/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dto;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class RentDto {
     private String rentId;
    private String brand;
    private String model;
    private String mfyear;
    //private String regNo;
    private int rentalPeriod;

    public RentDto() {
    }

    public RentDto(String rentId,String brand, String model, String mfyear, int rentalPeriod) {
       this.rentId=rentId;
        this.brand = brand;
        this.model = model;
        this.mfyear = mfyear;
        //this.regNo = regNo;
        this.rentalPeriod = rentalPeriod;
    }
/**
     * @return the rentId
     */
    public String getRentId() {
        return rentId;
    }

    /**
     * @param rentId
     */
    public void setRentId(String rentId) {
        this.rentId = rentId;
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
    /*public String getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
   /* public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the rentalPeriod
     */
   /* public int getRentalPeriod() {
        return rentalPeriod;
    }*/

    /**
     * @param rentalPeriod the rentalPeriod to set
     */
    public void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    @Override
    public String toString() {
        return "RentDto{" + "rentId=" + rentId + ", brand=" + brand + ", model=" + model + ", mfyear=" + mfyear + ", rentalPeriod=" + rentalPeriod + '}';
    }

    
    
}
