/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.carrent.service.custom;

import com.mycompany.carrent.dto.CarDto;
import com.mycompany.carrent. service.SuperService;
import java.util.ArrayList;
/**
 *
 * @author Uthsara Basnayake
 */
public interface CarService extends SuperService{
    String addCar(CarDto cardto)throws Exception;
        String updateCar(CarDto carDto) throws Exception;

    String deleteCar(String regNo) throws Exception;

    CarDto getCar(String regNo) throws Exception;

    ArrayList<CarDto> getAllCars() throws Exception; 

    public String[] getModels(String category);
}
