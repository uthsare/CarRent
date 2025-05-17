/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao.custom.impl;
import com.mycompany.carrent.dao.custom.CustomerDao;
import com.mycompany.carrent.entity.CustomerEntity;
import java.util.ArrayList;
import com.mycompany.carrent.dao.CrudUtil;
import java.sql.ResultSet;
import db.DBConnection;
/**
 *
 * @author Uthsara Basnayake
 */
public class CustomerDaoImpl implements CustomerDao{
     
    
    @Override
    public boolean add(CustomerEntity t) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(),t.getTitle(),t.getName(),t.getAge(),t.getAddress(),t.getCity(),t.getDistrict(),t.getProvince(),t.getZip()) ;
    }

    
    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET title =?, name=?, age=?, address=?, city=?,district=?, province=?, zip=? WHERE id=?",
                t.getTitle(), t.getName(), t.getAge(),
                 t.getAddress(), t.getCity(), t.getDistrict(),t.getProvince(),
                t.getZip(), t.getId());
    }

    
    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE id=?",
                id);
    }

    
    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM customer WHERE id = ?", id);
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            return customerEntity;
        }
        return null;
    }

    
    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
         ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("Select * FROM customer");
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
           customerEntitys.add(customerEntity);
        }
        
        return customerEntitys;
    }
    
}
