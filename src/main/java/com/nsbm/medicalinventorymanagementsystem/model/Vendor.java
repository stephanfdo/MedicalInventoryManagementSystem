package com.nsbm.medicalinventorymanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MIMS_Vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    private long id;

    @Column(name = "vendor_name")
    private String name;

    @Column(name = "vendor_email")
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
