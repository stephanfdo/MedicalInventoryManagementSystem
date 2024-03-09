package com.nsbm.medicalinventorymanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MIMS_Manager_Type")
public class ManagerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_type_id")
    private long id;

    @Column(name = "manager_type_name")
    private String typeName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


}
