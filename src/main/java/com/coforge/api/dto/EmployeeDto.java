package com.coforge.api.dto;

import com.coforge.api.model.Department;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.coforge.api.model.Employee} entity
 */
public class EmployeeDto implements Serializable {
    private  Long employeeId;

    @NotNull(message = "2000,firstName field should not be null")
    @Size(max = 50, message = "3000,firstName field is exceeding it's maximum length")
    private  String firstName;
    @Size(max = 50, message = "3000,middleName field is exceeding it's maximum length")
    private  String middleName;
    @Size(max = 50, message = "3000,lastName field is exceeding it's maximum length")
    private  String lastName;
    @NotNull(message = "2000,gender field should not be null")
//    @Min(value = 1, message = "3000,gender field is exceeding it's maximum length")
    private  Character gender;
    @NotNull(message = "2000,DOB filed should not be null")
    private  LocalDate dateOfBirth;
    @NotNull(message = "2000,emailId field should not be null")
    @Size(max = 50, message = "3000,emailId field is exceeding it's maximum length")
    @Email(message = "4000,emailId is not allowed.Only @COFORGE.COM emailId allowed")
    private  String emailId;
    @NotNull(message = "2000,mobileNumber field should not be null")
    private  Long mobileNumber;
    private  LocalDateTime dateOfJoin;
    @NotNull(message = "2000,designation field should not be null")
    @Size(max = 50, message = "3000,designation field is exceeding it's maximum length")
    private  String designation;
    @NotNull(message = "2000,departmentId field should not be null")
    @Size(max = 10, message = "3000,departmentId field is exceeding it's maximum length")
    @NotEmpty(message = "2000,departmentId field should not be null")
    private  String departmentId;
    @NotNull(message = "2000,projectId field should not be null")
    @Size(max = 10, message = "3000,projectId field is exceeding it's maximum length")
    private  String projectId;
    @NotNull(message = "2000,teamId field should not be null")
    @Size(max = 10, message = "3000,teamId field is exceeding it's maximum length")
    private  String teamId;
    @NotNull(message = "2000,roleId field should not be null")
    @Size(max = 10, message = "3000,roleId field is exceeding it's maximum length")
    private  String roleId;
    @NotNull(message = "2000,officeLocationId field should not be null")
    @Size(max = 10, message = "3000,officeLocationId field is exceeding it's maximum length")
    private  String officeLocationId;
//    @NotNull(message = "2000,addressId field should not be null")
//    @Size(max = 10, message = "3000,addressId field is exceeding it's maximum length")
//    private  String addressId;

    @NotNull(message = "2000,apartmentNumber field should not be null")
    @Size(max = 10, message = "3000,apartmentId field is exceeding it's maximum length")
    private String apartmentNumber;
    @NotNull(message = "2000,street field should not be null")
    @Size(max = 50, message = "3000,street field is exceeding it's maximum length")
    private String street;
    @NotNull(message = "2000,city field should not be null")
    @Size(max = 50, message = "3000,city field is exceeding it's maximum length")
    private String city;
    @NotNull(message = "2000,zipCode field should not be null")
    @Min(value = 6, message = "3000,zipCode field is exceeding it's maximum length")
    private Integer zipCode;
    @NotNull(message = "2000,state field should not be null")
    @Size(max = 50, message = "3000,state field is exceeding it's maximum length")
    private String state;
    @NotNull(message = "2000,country field should not be null")
    @Size(max = 50, message = "3000,country field is exceeding it's maximum length")
    private String country;

    public EmployeeDto(Long employeeId, String firstName, String middleName, String lastName, Character gender, LocalDate dateOfBirth, String emailId, Long mobileNumber, LocalDateTime dateOfJoin, String designation, String departmentId, String projectId, String teamId, String roleId, String officeLocationId, String addressId, String apartmentNumber, String street, String city, Integer zipCode, String state, String country) {
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
//        this.addressId = addressId;
        this.apartmentNumber = apartmentNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
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

//    public String getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(String addressId) {
//        this.addressId = addressId;
//    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}