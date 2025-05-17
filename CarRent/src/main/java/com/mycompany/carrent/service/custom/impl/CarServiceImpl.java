/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom.impl;
import com.mycompany.carrent.dao.DaoFactory;
import com.mycompany.carrent.dao.custom.CarDao;
import com.mycompany.carrent.dao.custom.impl.CarDaoImpl;

import com.mycompany.carrent.dto.CarDto;
import com.mycompany.carrent.entity.CarEntity;
import com.mycompany.carrent.service.custom.CarService;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CarServiceImpl implements CarService {
  CarDao carDao=(CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);
  
    @Override
    public String addCar(CarDto cardto) throws Exception {
        CarEntity ce = new CarEntity(cardto.getCategory(),cardto.getBrand(), cardto.getModel(),
                cardto.getMfyear(),cardto.getRegNo(),cardto.getNoOfCars());

        if (carDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateCar(CarDto cardto) throws Exception {
         CarEntity ce = new CarEntity(cardto.getCategory(),cardto.getBrand(), cardto.getModel(),
                cardto.getMfyear(),cardto.getRegNo(),cardto.getNoOfCars());
       if (carDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCar(String regNo) throws Exception {
         if (carDao.delete(regNo)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CarDto getCar(String regNo) throws Exception {
       CarEntity entity = (CarEntity) carDao.get(regNo);
        return new CarDto(entity.getCategory(),entity.getBrand(),entity.getModel(),entity.getMfyear(),entity.getRegNo(),entity.getNoOfCars());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception {
         ArrayList<CarDto>  carDto = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAll();
        
        for (CarEntity entity : carEntitys) {
            CarDto dto = new CarDto(entity.getCategory(),entity.getBrand(),entity.getModel(),entity.getMfyear(),entity.getRegNo(),entity.getNoOfCars());
                  carDto.add(dto);

        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return carDto;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] getModels(String category) {
      try {
          String[] model= CarDaoImpl.geT(category);
          //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          return model;
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      } catch (Exception ex) {
          Logger.getLogger(CarServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
    }


   
    
}
