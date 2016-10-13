package com.cagatayhan.domain;

import javax.persistence.*;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Entity
@Table (name = "department")
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "department_id")
    private int id;

    @Column (name = "name")
    private String name;

    public Department() {
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
