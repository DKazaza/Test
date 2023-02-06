package com.dk.test.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "Loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "surname")
    @NotBlank(message = "Фамилия не может отсутствовать")
    private String surname;
    @NotBlank(message = "Имя не может отсутствовать")
    @Column(name = "name")
    private String name;
    @NotBlank(message = "Отчество не может отсутствовать")
    @Column(name = "patronymic")
    private String patronymic;
    @NotBlank(message = "Паспорт не может отсутствовать")
    @Column(name = "passport")
    private String passport;
    @Column(name = "status")
    private String status;
    @NotBlank(message = "Адрес регистрации не может отсутствовать")
    @Column(name = "location")
    private String location;
    @NotBlank(message = "Телефон не может отсутствовать")
    @Column(name = "phone")
    private String phone;
    @NotBlank(message = "Место работы не может отсутствовать")
    @Column(name = "work_name")
    private String work_name;
    @NotBlank(message = "Стаж работы не может отсутствовать")
    @Column(name = "work_time")
    private String work_time;
    @NotBlank(message = "Должность не может отсутствовать")
    @Column(name = "work_position")
    private String work_position;
    @Column(name = "sum")
    @Min(value = 1)
    private BigDecimal sum;
    @Column(name = "loan_term")
    private int loan_term;
    @Column(name = "loan_date")
    private String loan_date;
    @Column(name = "approved")
    private String approved;
    @Column(name = "signed")
    private String signed;

    public Loan() {
    }

    public Loan(String surname, String name, String patronymic, String passport, String status, String location, String phone, String work_name, String work_time, String work_position, BigDecimal sum, int loan_term, String loan_date, String approved, String signed) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.passport = passport;
        this.status = status;
        this.location = location;
        this.phone = phone;
        this.work_name = work_name;
        this.work_time = work_time;
        this.work_position = work_position;
        this.sum = sum;
        this.loan_term = loan_term;
        this.loan_date = loan_date;
        this.approved = approved;
        this.signed = signed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public String getWork_position() {
        return work_position;
    }

    public void setWork_position(String work_position) {
        this.work_position = work_position;
    }

    public int getLoan_term() {
        return loan_term;
    }

    public void setLoan_term(int loan_term) {
        this.loan_term = loan_term;
    }

    public String getLoan_date() {
        return loan_date;
    }

    public void setLoan_date(String loan_date) {
        this.loan_date = loan_date;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", sum=" + sum +
                ", approved='" + approved + '\'' +
                ", signed='" + signed + '\'' +
                '}';
    }
}
