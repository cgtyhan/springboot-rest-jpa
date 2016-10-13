package com.cagatayhan.domain;

import javax.persistence.*;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Entity
@Table (name = "manager")
@PrimaryKeyJoinColumn (name = "emloyee_id")
public class Manager extends Employee {
    @ManyToOne
    @JoinColumn (name = "department_id")
    private Department department;

    @Column(name = "salary")
    private double salary;

    public Manager() {
        super();
    }

    public Manager(int id, String name, String address, Department department, double salary) {
        super(id, name, address);
        this.department = department;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
