/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.controller;

import com.mycompany.carrent.dto.ReturnDto;
import com.mycompany.carrent.service.ServiceFactory;
import com.mycompany.carrent.service.custom.ReturnService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class ReturnController {
    ReturnService returnService = (ReturnService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RETURN);

   
    public ArrayList<ReturnDto> getAllReturns() throws Exception {
        return returnService.getAllReturns();
    }

    public String updateReturn(ReturnDto returnDto) throws Exception {
        return returnService.updateReturn(returnDto);
    }

    public String deleteReturn(String regNo) throws Exception {
        return returnService.deleteReturn(regNo);
    }

    

    public String addReturn(ReturnDto rd) throws Exception {
       return returnService.addReturn(rd);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
