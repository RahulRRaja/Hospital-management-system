package com.sample.Demo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "out_patient")
public class Out_patient {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    @Column
    private Integer lab_no;
    @Column
    private String date;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLab_no() {
        return lab_no;
    }

    public void setLab_no(Integer lab_no) {
        this.lab_no = lab_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
