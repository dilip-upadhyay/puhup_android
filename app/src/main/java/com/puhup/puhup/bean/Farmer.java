package com.puhup.puhup.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by Manish on 12/26/2016.
 */

public class Farmer {

    String firstName;
    String middleName;
    String lastName;
    Date dob;
    List<Address> address;
    Integer landSize;
    String measurementUnit;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getLandSize() {
        return landSize;
    }

    public void setLandSize(Integer landSize) {
        this.landSize = landSize;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }





}
