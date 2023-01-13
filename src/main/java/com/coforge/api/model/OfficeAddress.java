package com.coforge.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "office_address")
public class OfficeAddress {


    @Id
    @Column(name = "Office_location_id", length = 10)
    private String officeLocationId;

    @Column(name = "apartment_number", length = 10, nullable = false)
    private String buildingNumber;

    @Column(name = "street", length = 50, nullable = false)
    private String street;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "zip_code", length = 6, nullable = false)
    private Integer zipCode;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    public OfficeAddress(String officeLocationId, String buildingNumber, String street, String city, Integer zipCode, String state, String country) {
        this.officeLocationId = officeLocationId;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    public OfficeAddress() {
    }

    public String getOfficeLocationId() {
        return officeLocationId;
    }

    public void setOfficeLocationId(String officeLocationId) {
        this.officeLocationId = officeLocationId;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
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

    @Override
    public String toString() {
        return "OfficeAddress{" +
                "officeLocationId='" + officeLocationId + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
