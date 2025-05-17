/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.entity;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CarEntity {
    private String category;
    private String brand;
    private String model;
    private String mfyear;
    private String regNo;
    private int NoOfCars;

    public CarEntity() {
    }

    public CarEntity( String category,String brand, String model, String mfyear, String regNo, int NoOfCars) {
       this.category=category;
        this.brand = brand;
        this.model = model;
        this.mfyear = mfyear;
        this.regNo = regNo;
        this.NoOfCars = NoOfCars;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the mfyear
     */
    public String getMfyear() {
        return mfyear;
    }

    /**
     * @param mfyear the mfyear to set
     */
    public void setMfyear(String mfyear) {
        this.mfyear = mfyear;
    }

    /**
     * @return the regNo
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the NoOfCars
     */
    public int getNoOfCars() {
        return NoOfCars;
    }

    /**
     * @param NoOfCars the NoOfCars to set
     */
    public void setNoOfCars(int NoOfCars) {
        this.NoOfCars = NoOfCars;
    }

  

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "category=" + category + ", brand=" + brand + ", model=" + model + ", mfyear=" + mfyear + ", regNo=" + regNo + ", NoOfCars=" + NoOfCars + '}';
    }
    
    
}
