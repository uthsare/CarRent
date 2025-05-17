/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.entity;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CategoryEntity {
    private String categoryName;
    private int noOfCars;
    private String brand;
    private double fee;

    public CategoryEntity() {
    }

    public CategoryEntity(String categoryName, int noOfCars, String brand,double fee) {
        this.categoryName = categoryName;
        this.noOfCars = noOfCars;
        this.brand = brand;
        this.fee=fee;
    }

    public CategoryEntity(String categoryname) {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the noOfCars
     */
    public int getNoOfCars() {
        return noOfCars;
    }

    /**
     * @param noOfCars the noOfCars to set
     */
    public void setNoOfCars(int noOfCars) {
        this.noOfCars = noOfCars;
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
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "categoryName=" + categoryName + ", noOfCars=" + noOfCars + ", brand=" + brand + ", fee=" + fee + '}';
    }

}
