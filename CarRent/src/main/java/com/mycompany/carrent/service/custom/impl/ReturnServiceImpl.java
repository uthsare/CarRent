/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom.impl;

import com.mycompany.carrent.dao.DaoFactory;
import com.mycompany.carrent.dao.custom.ReturnDao;
import com.mycompany.carrent.dto.RentDto;

import com.mycompany.carrent.dto.ReturnDto;
import com.mycompany.carrent.entity.ReturnEntity;

import com.mycompany.carrent.service.custom.ReturnService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class ReturnServiceImpl implements ReturnService{
ReturnDao returnDao=(ReturnDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURN);
    @Override
    public String addReturn(ReturnDto returndto) throws Exception {
        ReturnEntity re = new ReturnEntity( returndto.getBrand(),
                returndto.getModel(),
              
             returndto.getMfyear(),returndto.getRegNo(),returndto.getDamages());

        if (returnDao.add(re)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReturnDto getReturn(String regNo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteReturn(String regNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateReturn(ReturnDto returnDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ReturnDto> getAllReturns() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
