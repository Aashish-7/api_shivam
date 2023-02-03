package com.coforge.api.service;


import com.coforge.api.dao.*;
import com.coforge.api.dto.EmployeeDto;
import com.coforge.api.exception.BadRequest400Exception;
import com.coforge.api.exception.dto.Error;
import com.coforge.api.exception.dto.ResponseStatusDto;
import com.coforge.api.model.Address;
import com.coforge.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    EmployeesRepository employeesRepository;

    DepartmentRepository departmentRepository;

    OfficeAddressRepository officeAddressRepository;

    ProjectRepository projectRepository;

    RoleRepository roleRepository;

    TeamRepository teamRepository;

    AddressRepository addressRepository;


    @Autowired
    public EmployeeService(EmployeesRepository employeesRepository, AddressRepository addressRepository
            , DepartmentRepository departmentRepository, OfficeAddressRepository officeAddressRepository, ProjectRepository projectRepository, RoleRepository roleRepository, TeamRepository teamRepository) {
        this.employeesRepository = employeesRepository;
        this.departmentRepository = departmentRepository;
        this.officeAddressRepository = officeAddressRepository;
        this.projectRepository = projectRepository;
        this.roleRepository = roleRepository;
        this.teamRepository = teamRepository;
        this.addressRepository = addressRepository;
    }


    public ResponseEntity<Object> addEmployee(EmployeeDto employee) {
        Map<String, Object> map = new HashMap<>();
        if (!departmentRepository.existsByDepartmentId(employee.getDepartmentId())){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(5000, "departmentId "+employee.getDepartmentId()+ " does not exist"));
        }
        if (!officeAddressRepository.existsByOfficeLocationId(employee.getOfficeLocationId())){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(5000, "officeLocationId "+employee.getOfficeLocationId()+ " does not exist"));
        }
        if (!projectRepository.existsByProjectId(employee.getProjectId())){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(5000, "projectId "+employee.getProjectId()+ " does not exist"));
        }
        if (!roleRepository.existsByRoleId(employee.getRoleId())){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(5000, "roleId "+employee.getRoleId()+ " does not exist"));
        }
        if(!teamRepository.existsByTeamId(employee.getTeamId())){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(5000, "team "+employee.getTeamId()+ " does not exist"));
        }
        Employee employees1 = new Employee();
        employees1.setFirstName(employee.getFirstName());
        employees1.setMiddleName(employee.getMiddleName());
        employees1.setLastName(employee.getLastName());
        employees1.setGender(employee.getGender());
        employees1.setDateOfBirth(employee.getDateOfBirth());
        employees1.setEmailId(employee.getEmailId());
        if (!employee.getEmailId().toUpperCase().endsWith("@COFORGE.COM")){
            throw new BadRequest400Exception("FAILURE", null, "N", "NA", new Error(4000,"emailId is not allowed.Only @COFORGE.COM emailId allowed"));
        }
        employees1.setMobileNumber(employee.getMobileNumber());
        employees1.setDesignation(employee.getDesignation());
        employees1.setProjectId(employee.getProjectId());
        employees1.setTeamId(employee.getTeamId());
        employees1.setRoleId(employee.getRoleId());
        employees1.setOfficeLocationId(employee.getOfficeLocationId());
        employeesRepository.save(employees1);
        Address address = new Address();
        address.setApartmentNumber(employee.getApartmentNumber());
        address.setState(employee.getState());
        address.setStreet(employee.getStreet());
        address.setCity(employee.getCity());
        address.setZipCode(employee.getZipCode());
        address.setCountry(employee.getCountry());
        address.setEmployeeId(employeesRepository.findById(employees1.getEmployeeId()).get().getEmployeeId());
        addressRepository.save(address);
        map.put("employee", employees1);
        map.put("address", address);
        map.put("department", departmentRepository.findById(employee.getDepartmentId()));
        map.put("project", projectRepository.findById(employee.getProjectId()));
        map.put("team", teamRepository.findById(employee.getTeamId()));
        map.put("role", roleRepository.findById(employee.getRoleId()));
        map.put("officeAddress", officeAddressRepository.findById(employee.getOfficeLocationId()));

        ResponseStatusDto responseStatusDto = new ResponseStatusDto();
        responseStatusDto.setResponseStatus("SUCCESS");
        responseStatusDto.setData(map);
        responseStatusDto.setDatabaseSave("Y");
        responseStatusDto.setQueryType("INSERT");
//        responseStatusDto.setError(null);
        return ResponseEntity.ok(responseStatusDto);
    }

    public List<Employee> employeesList() {
        return employeesRepository.findAll();
    }

    public Employee updateEmployee(Long id, EmployeeDto employee) throws Exception {
        if (employeesRepository.findById(id).isPresent()) {
            Employee employees1 = employeesRepository.findById(id).get();
            employees1.setFirstName(employee.getFirstName());
            employees1.setMiddleName(employee.getMiddleName());
            employees1.setLastName(employee.getLastName());
            employees1.setGender(employee.getGender());
            employees1.setDateOfBirth(employee.getDateOfBirth());
            employees1.setEmailId(employee.getEmailId());
            employees1.setMobileNumber(employee.getMobileNumber());
            employees1.setDateOfJoin(employee.getDateOfJoin());
            employees1.setDesignation(employee.getDesignation());
            employees1.setDepartmentId(employee.getDepartmentId());
            employees1.setProjectId(employee.getProjectId());
            employees1.setTeamId(employee.getTeamId());
            employees1.setRoleId(employee.getRoleId());
            employees1.setOfficeLocationId(employee.getOfficeLocationId());
            employeesRepository.save(employees1);
            return employees1;
        } else {
            throw new Exception("Employee not found.");
        }
    }

    public String deleteEmployee(Long id) {
        if (employeesRepository.existsById(id)) {
            employeesRepository.deleteById(id);
            return "Delete Successfully!!";
        } else {
            return ("Employee not found");
        }
    }

    public Map<String, Object> fetchEmployeeByEmployeeId(Long id) {
        Map<String, Object> map = new LinkedHashMap<>();
        Employee employee = employeesRepository.findByEmployeeId(id);
        map.put("employee", employee);
        map.put("address", addressRepository.findByEmployeeId(employee.getEmployeeId()));
        map.put("department", departmentRepository.findById(employee.getDepartmentId()));
        map.put("project", projectRepository.findById(employee.getProjectId()));
        map.put("team", teamRepository.findById(employee.getTeamId()));
        map.put("role", roleRepository.findById(employee.getRoleId()));
        map.put("officeAddress", officeAddressRepository.findById(employee.getOfficeLocationId()));
        map.put("getById", employeesRepository.getById(id));
        return map;
    }

    public List<String> fetchEmployeeByCity() {  // String ki replace me Employee ka complete object se complete aayega nhi to sirf first name hi kia h
        List<String> employees = new ArrayList<>();
        if (!employeesRepository.findAll().isEmpty()) {
            employeesRepository.findAll().forEach(employee -> {
                    if (officeAddressRepository.findById(employee.getOfficeLocationId()).get().getCity().equals(addressRepository.findByEmployeeId(employee.getEmployeeId()).getCity())) {
                        employees.add(employee.getFirstName()); // agar Employee hi chahiye to ye .getFirstName() hta dena or return type change krna controller se bi
                    }
            });
        }
        return employees;
    }

    public Address getAddressByEmployeeId(Long id){
        return addressRepository.findByEmployeeId(id);
    }
}
