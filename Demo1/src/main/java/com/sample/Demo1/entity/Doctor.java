package com.sample.Demo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer did;
    @Column
    private String doctor_name;
    @Column
    private String dpt;

    public Integer getDoctor_id() {
        return did;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.did = did;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }
}
