package com.coforge.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {

    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long employeeId;

    @Column(name = "first_name",length = 50)
    private String firstName;

    @Column(name = "middle_name", length = 50)
    private String middleName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "gender", length = 1)
    private Character gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email_id", length = 50)
    private String emailId;

    @Column(name = "mobile_number")
    private Long mobileNumber;

    @Column(name = "date_of_join")
    private LocalDateTime dateOfJoin = LocalDateTime.now();

    @Column(name = "designation")
    private String designation;

    private String departmentId;

    private String projectId;

    private String teamId;

    private String roleId;

    private String officeLocationId;

    public Employee() {
    }

    public Employee(Long employeeId, String firstName, String middleName, String lastName, Character gender, LocalDate dateOfBirth, String emailId, Long mobileNumber, LocalDateTime dateOfJoin, String designation, String departmentId, String projectId, String teamId, String roleId, String officeLocationId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.dateOfJoin = dateOfJoin;
        this.designation = designation;
        this.departmentId = departmentId;
        this.projectId = projectId;
        this.teamId = teamId;
        this.roleId = roleId;
        this.officeLocationId = officeLocationId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public LocalDateTime getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDateTime dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getOfficeLocationId() {
        return officeLocationId;
    }

    public void setOfficeLocationId(String officeLocationId) {
        this.officeLocationId = officeLocationId;
    }
}
