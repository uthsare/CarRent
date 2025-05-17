/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dto;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class ReturnDto {
  private String brand;
private String model;
private String mfyear;
private String regNo;
private String damages;

    public ReturnDto() {
    }

    public ReturnDto(String brand, String model, String mfyear, String regNo, String damages) {
        this.brand = brand;
        this.model = model;
        this.mfyear = mfyear;
        this.regNo = regNo;
        this.damages = damages;
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
     * @return the damages
     */
    public String getDamages() {
        return damages;
    }

    /**
     * @param damages the damages to set
     */
    public void setDamages(String damages) {
        this.damages = damages;
    }

    @Override
    public String toString() {
        return "ReturnDto{" + "brand=" + brand + ", model=" + model + ", mfyear=" + mfyear + ", regNo=" + regNo + ", damages=" + damages + '}';
    }


}
