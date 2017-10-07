package com.bignerdranch.android.myapplication.model;

/**
 * Created by Arek on 10/7/2017.
 */

public class Vehicle {
    private String vMake;
    private String vModel;
    private String Year;

    public Vehicle(String vMake, String vModel, String year) {
        this.vMake = vMake;
        this.vModel = vModel;
        Year = year;
    }

    public String getvMake() {
        return vMake;
    }

    public void setvMake(String vMake) {
        this.vMake = vMake;
    }

    public String getvModel() {
        return vModel;
    }

    public void setvModel(String vModel) {
        this.vModel = vModel;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }


}
