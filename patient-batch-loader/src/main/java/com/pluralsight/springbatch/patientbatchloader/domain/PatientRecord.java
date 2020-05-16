//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.pluralsight.springbatch.patientbatchloader.domain;

import java.io.Serializable;

public class PatientRecord implements Serializable {
    private String sourceId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String birthDate;
    private String action;
    private String ssn;

    public PatientRecord() {
    }

    public PatientRecord(String sourceId, String firstName, String middleInitial, String lastName, String emailAddress, String phoneNumber, String street, String city, String state, String zip, String birthDate, String action, String ssn) {
        this.sourceId = sourceId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.birthDate = birthDate;
        this.action = action;
        this.ssn = ssn;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String toString() {
        return "PatientRecord{sourceId='" + this.sourceId + '\'' + ", firstName='" + this.firstName + '\'' + ", middleInitial='" + this.middleInitial + '\'' + ", lastName='" + this.lastName + '\'' + ", emailAddress='" + this.emailAddress + '\'' + ", phoneNumber='" + this.phoneNumber + '\'' + ", street='" + this.street + '\'' + ", city='" + this.city + '\'' + ", state='" + this.state + '\'' + ", zip='" + this.zip + '\'' + ", birthDate='" + this.birthDate + '\'' + ", action='" + this.action + '\'' + ", ssn='" + this.ssn + '\'' + '}';
    }
}
