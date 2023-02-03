//package com.coforge.api.service;
//
//import com.coforge.api.dao.EmployeesRepository;
//import com.coforge.api.model.Employee;
//import junit.framework.Assert;
//import org.hamcrest.Matcher;
//import org.junit.jupiter.api.*;
//import org.mockito.hamcrest.MockitoHamcrest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class EmployeeServiceTest {
//
//
//    EmployeesRepository employeesRepository;
//    @Autowired
//    public EmployeeServiceTest(EmployeesRepository employeesRepository) {
//        this.employeesRepository = employeesRepository;
//    }
//
//    @Test
//    @DisplayName("add_Employee")
////    @Order(2)
//    void addEmployee() {
//
//    }
//
//    @Test
//    @DisplayName("employeeList")
////    @Order(1)
//    void employeesList() {
////        Employee employee = employeesRepository
//    }
//
//    @Test
//    void updateEmployee() {
//    }
//
//    @Test
//    void deleteEmployee() {
//    }
//
//    @Test
//    @DisplayName("employeeById")
//    @Order(1)
//    void fetchEmployeeByEmployeeId() {
//        Employee employee = employeesRepository.findByEmployeeId(1102L);
//        MockitoHamcrest.longThat((Matcher<Long>) employeesRepository.findByEmployeeId(1102L));
//    }
//
//    @Test
//    void fetchEmployeeByCity() {
//    }
//
//    @Test
//    void getAddressByEmployeeId() {
//    }
//}