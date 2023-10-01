/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom.impl;


import com.mycompany.carrent.dao.DaoFactory;
import com.mycompany.carrent.dao.custom.CustomerDao;
import com.mycompany.carrent.dao.custom.RentDao;
import com.mycompany.carrent.dto.RentDto;

import com.mycompany.carrent.entity.RentEntity;
import com.mycompany.carrent.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class RentServiceImpl implements RentService {
RentDao rentDao=(RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);
  
    @Override
    public String addRent(RentDto rentdto) throws Exception {
       RentEntity re = new RentEntity(rentdto.getRentId(), rentdto.getBrand(),
                rentdto.getModel(),
              
             rentdto.getMfyear(),rentdto.);

        if (rentDao.add(re)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentDto getRent(String rentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteRent(String rentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateRent(RentDto rentDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RentDto> getAllRents() throws Exception {
        ArrayList<RentDto>  rentDto = new ArrayList<>();
        ArrayList<RentEntity> rentEntitys = rentDao.getAll();
        
        for (RentEntity entity : rentEntitys) {
            RentDto dto = new RentDto(entity.getRentId(),entity.getBrand(),entity.getModel(),entity.getMfyear(),entity.getRentalPeriod());
            rentDto.add(dto);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return rentDto;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}
