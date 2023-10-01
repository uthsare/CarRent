/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao.custom.impl;

import com.mycompany.carrent.dao.CrudUtil;
import com.mycompany.carrent.dao.custom.ReturnDao;
import com.mycompany.carrent.entity.ReturnEntity;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class ReturnDaoImpl implements ReturnDao {

    @Override
    public boolean add(ReturnEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO returncar VALUES(?,?,?,?,?)",
                 t.getBrand(),t.getModel(),t.getRegNo(),t.getMfyear(),t.getDamages());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public boolean update(ReturnEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReturnEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ReturnEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
