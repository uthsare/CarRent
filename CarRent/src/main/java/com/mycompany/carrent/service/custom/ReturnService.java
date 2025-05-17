/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.carrent.service.custom;

import com.mycompany.carrent.dto.RentDto;
import com.mycompany.carrent.dto.ReturnDto;
import com.mycompany.carrent.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public interface ReturnService extends SuperService {
     String addReturn(ReturnDto returndto)throws Exception;
       
    ReturnDto getReturn(String regNo) throws Exception;
   public String deleteReturn(String regNo);

    public String updateReturn(ReturnDto returnDto);
    ArrayList<ReturnDto> getAllReturns() throws Exception;
}
