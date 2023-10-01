/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.controller;

import com.mycompany.carrent.dto.RentDto;
import com.mycompany.carrent.service.ServiceFactory;
import com.mycompany.carrent.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class RentController {
     RentService rentService = (RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);

   
    public ArrayList<RentDto> getAllRents() throws Exception {
        return rentService.getAllRents();
    }

    public String updateRent(RentDto rentDto) throws Exception {
        return rentService.updateRent(rentDto);
    }

    public String deleteRent(String id) throws Exception {
        return rentService.deleteRent(id);
    }

    public RentDto getRent(String rentId) throws Exception {
        return rentService.getRent(rentId);
    }

    public String addRent(RentDto rd) throws Exception {
       return rentService.addRent(rd);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
