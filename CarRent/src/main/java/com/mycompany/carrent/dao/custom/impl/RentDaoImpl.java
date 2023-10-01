/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao.custom.impl;

import com.mycompany.carrent.dao.CrudUtil;
import com.mycompany.carrent.dao.custom.RentDao;
import com.mycompany.carrent.entity.RentEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class RentDaoImpl implements RentDao{

    @Override
    public boolean add(RentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO rent VALUES(?,?,?,?,?,?)",
                 t.getRentId(),t.getBrand(),t.getModel(),t.getRegNo(),t.getMfyear(),t.getRentalPeriod());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(RentEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
         ArrayList<RentEntity> rentEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("Select * FROM rent ");
        
        while (rst.next()) {            
            RentEntity rentEntity = new RentEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6)
      );
            
           rentEntitys.add(rentEntity);
        }
        
        return rentEntitys;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
