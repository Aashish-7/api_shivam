package com.coforge.api.controller;

import com.coforge.api.dto.EmployeeDto;
import com.coforge.api.model.Address;
import com.coforge.api.model.Employee;
import com.coforge.api.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/addEmployee")
    private ResponseEntity<Object> addEmployee(@RequestBody @Valid EmployeeDto employees) {
        return employeeService.addEmployee(employees);
    }

    @GetMapping("/employeesList")
    public List<Employee> employeesList() {
        return employeeService.employeesList();
    }


    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employees) throws Exception {
        return employeeService.updateEmployee(id, employees);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/fetchEmployeeByEmployeeId/{id}")
    public Map<String, Object> fetchEmployeeByEmployeeId(@PathVariable Long id){
        return employeeService.fetchEmployeeByEmployeeId(id);
    }

    @GetMapping("/fetchEmployeeByCity")
    public List<String> fetchEmployeeByCity(){
        return employeeService.fetchEmployeeByCity();
    }


    @GetMapping("/getAddressByEmployeeId/{id}")
    public Address getAddressByEmployeeId(@PathVariable Long id){
        return employeeService.getAddressByEmployeeId(id);
    }}
