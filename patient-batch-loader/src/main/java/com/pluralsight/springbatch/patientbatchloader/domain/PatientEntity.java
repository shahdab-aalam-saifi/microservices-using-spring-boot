package com.pluralsight.springbatch.patientbatchloader.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patient")
public class PatientEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "patient_id")
    private Long id;

    @NotNull
    @Column(name = "source_id", nullable = false)
    private String sourceId;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_initial", nullable = true)
    private String middleInitial;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = true)
    private String emailAddress;

    @NotNull
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = "street", nullable = false)
    private String street;

    @NotNull
    @Column(name = "city", nullable = false)
    private String city;

    @NotNull
    @Column(name = "state", nullable = false)
    private String state;

    @NotNull
    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @NotNull
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @NotNull
    @Column(name = "social_security_number", nullable = false)
    private String socialSecurityNumber;

    public PatientEntity() {
    }

    public PatientEntity(@NotNull String sourceId, @NotNull String firstName, String middleInitial, @NotNull String lastName, String emailAddress, @NotNull String phoneNumber, @NotNull String street, @NotNull String city, @NotNull String state, @NotNull String zipCode, @NotNull LocalDate birthDate, @NotNull String socialSecurityNumber) {
        this.sourceId = sourceId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public PatientEntity(Long id, @NotNull String sourceId, @NotNull String firstName, String middleInitial, @NotNull String lastName, String emailAddress, @NotNull String phoneNumber, @NotNull String street, @NotNull String city, @NotNull String state, @NotNull String zipCode, @NotNull LocalDate birthDate, @NotNull String socialSecurityNumber) {
        this.id = id;
        this.sourceId = sourceId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return "PatientEntity{id=" + this.id + ", sourceId='" + this.sourceId + '\'' + ", firstName='" + this.firstName + '\'' + ", middleInitial='" + this.middleInitial + '\'' + ", lastName='" + this.lastName + '\'' + ", emailAddress='" + this.emailAddress + '\'' + ", phoneNumber='" + this.phoneNumber + '\'' + ", street='" + this.street + '\'' + ", city='" + this.city + '\'' + ", state='" + this.state + '\'' + ", zipCode='" + this.zipCode + '\'' + ", birthDate=" + this.birthDate + ", socialSecurityNumber='" + this.socialSecurityNumber + '\'' + '}';
    }
}
