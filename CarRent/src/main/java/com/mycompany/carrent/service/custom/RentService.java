/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.carrent.service.custom;

import com.mycompany.carrent.dto.RentDto;
import com.mycompany.carrent.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public interface RentService extends SuperService {
     String addRent(RentDto rentdto)throws Exception;
       
    RentDto getRent(String rentId) throws Exception;
   public String deleteRent(String rentId);

    public String updateRent(RentDto rentDto);
    ArrayList<RentDto> getAllRents() throws Exception;
    
}
