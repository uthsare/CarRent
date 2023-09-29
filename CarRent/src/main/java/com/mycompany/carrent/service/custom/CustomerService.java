/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom;
import com.mycompany.carrent.dto.CustomerDto;
import com.mycompany.carrent. service.SuperService;
import java.util.ArrayList;
import db.DBConnection;
/**
 *
 * @author Uthsara Basnaayke
 */
public  interface CustomerService extends SuperService {
     String addCustomer(CustomerDto customerdto)throws Exception;
        String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    CustomerDto getCustomer(String id) throws Exception;

    ArrayList<CustomerDto> getAllCustomer() throws Exception;  
    
}
