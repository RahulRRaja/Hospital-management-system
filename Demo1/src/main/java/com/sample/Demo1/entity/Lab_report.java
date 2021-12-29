package com.sample.Demo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "lab_report")
public class Lab_report {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lab_no;
    @Column
    private Integer pid;
    @Column
    private String date;
    @Column
    private Integer doctor_id;
    @Column
    private Integer Amount;

    public Integer getLab_no() {
        return lab_no;
    }

    public void setLab_no(Integer lab_no) {
        this.lab_no = lab_no;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

}
