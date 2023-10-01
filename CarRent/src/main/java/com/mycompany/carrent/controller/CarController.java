/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.controller;

import com.mycompany.carrent.dto.CarDto;
import com.mycompany.carrent.service.ServiceFactory;
import com.mycompany.carrent.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author Uthsara Basnayake
 */
public class CarController {
    CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);

    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String deleteCar(String regNo) throws Exception {
        return carService.deleteCar(regNo);
    }

    public CarDto getCar(String regNo) throws Exception {
        return carService.getCar(regNo);
    }

    public String[] searchModels(String category) {
       return carService.getModels(category);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
