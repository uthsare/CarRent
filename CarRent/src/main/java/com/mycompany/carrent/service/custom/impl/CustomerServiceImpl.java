/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom.impl;

import com.mycompany.carrent.dto.CustomerDto;
import com.mycompany.carrent.service.custom.CustomerService;
import com.mycompany.carrent.entity.CustomerEntity;
import com.mycompany.carrent.dao.DaoFactory;
import com.mycompany.carrent.dao.custom.CustomerDao;
import java.util.ArrayList;

/**
 *
 * @author Uthsara Basnayake
 */
public class CustomerServiceImpl implements CustomerService {
    CustomerDao customerDao=(CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
  

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitle(),
                dto.getName(), dto.getAge(),
                dto.getAddress(), dto.getCity(),dto.getDistrict(), dto.getProvince(),
                dto.getZip());

        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitle(),
                dto.getName(), dto.getAge(),
                dto.getAddress(), dto.getCity(),dto.getDistrict(), dto.getProvince(),
                dto.getZip());
        
        if (customerDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if (customerDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = (CustomerEntity) customerDao.get(id);
        return new CustomerDto(entity.getId(), entity.getTitle(),
                entity.getName(), entity.getAge(), 
                entity.getAddress(), entity.getCity(), entity.getDistrict(),entity.getProvince(),
                entity.getZip());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
       ArrayList<CustomerDto>  customerDto = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(), entity.getTitle(),
                entity.getName(), entity.getAge(), entity.getAddress(),
                 entity.getCity(),entity.getDistrict(), entity.getProvince(),
                entity.getZip());
            customerDto.add(dto);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return customerDto;
    }
    
}
