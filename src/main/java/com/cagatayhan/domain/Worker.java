package com.cagatayhan.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Çağatay Han on 12.10.2016.
 */
@Entity
@Table (name = "worker")
@PrimaryKeyJoinColumn (name = "emloyee_id")
public class Worker extends Employee{
    @Column(name="fee_per_hour")
    private double feePerHour;
    @Column(name="hour_per_day")
    private int hourPerDay;

    public Worker() {
        super();
    }

    public Worker(int id, String name, String address, double feePerHour, int hourPerDay)
    {
        super(id, name, address);
        this.feePerHour = feePerHour;
        this.hourPerDay = hourPerDay;
    }

    public double getFeePerHour() {
        return feePerHour;
    }

    public void setFeePerHour(double feePerHour) {
        this.feePerHour = feePerHour;
    }

    public int getHourPerDay() {
        return hourPerDay;
    }

    public void setHourPerDay(int hourPerDay) {
        this.hourPerDay = hourPerDay;
    }
}
