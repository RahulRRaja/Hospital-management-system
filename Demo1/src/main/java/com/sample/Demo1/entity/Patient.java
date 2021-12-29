package com.sample.Demo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    @Column
    private String name;
    @Column
    private Integer weight;
    @Column
    private String gender;
    @Column
    private String address;
    @Column
    private Integer phone_no;
    @Column
    private String disease;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Integer phone_no) {
        this.phone_no = phone_no;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

