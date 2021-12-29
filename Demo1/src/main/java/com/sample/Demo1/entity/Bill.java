package com.sample.Demo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bill_no;
    @Column
    private Integer pid;
    @Column
    private Integer lab_charge;
    @Column
    private Integer doctor_charge;

    public Integer getBill_no() {
        return bill_no;
    }

    public void setBill_no(Integer bill_no) {
        this.bill_no = bill_no;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLab_charge() {
        return lab_charge;
    }

    public void setLab_charge(Integer lab_charge) {
        this.lab_charge = lab_charge;
    }

    public Integer getDoctor_charge() {
        return doctor_charge;
    }

    public void setDoctor_charge(Integer doctor_charge) {
        this.doctor_charge = doctor_charge;
    }
}
