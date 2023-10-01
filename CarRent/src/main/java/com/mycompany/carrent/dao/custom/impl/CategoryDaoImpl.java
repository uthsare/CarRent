/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao.custom.impl;

import com.mycompany.carrent.dao.CrudUtil;
import com.mycompany.carrent.dao.custom.CategoryDao;
import com.mycompany.carrent.entity.CategoryEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean add(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?,?,?)",
                 t.getCategoryName(),t.getNoOfCars(),t.getBrand(),t.getFee());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE category SET  name=?, noOfCars=?, brand=?, fee=? WHERE name=?",
                t.getBrand(), t.getNoOfCars(), t.getBrand(),
                 t.getFee());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String name) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM category WHERE name=?",
                name);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String[] geT(String brand) throws Exception {
       
       
      
        int j=0;
         String[] category =new String[0];
         
         
       ResultSet rst = CrudUtil.executeQuery("Select name FROM category WHERE brand =?", brand);
      
            
             while(rst.next()){
                 
               
                 
                  String temp[]=new String[category.length+1];
         for(int i=0;i<temp.length-1;i++)
         {temp[i]=category[i];
         }
         category=temp;
                
                 
                 category[j]=rst.getString(1);
                       
                 j++;
                 
                 
             }  
        
                 System.out.println(j+"    ,"+Arrays.toString(category));
         return category; 
      
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    
        
    }
    

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("Select * FROM category");
        ArrayList<CategoryEntity> categoryEntitys = new ArrayList<>();
        while (rst.next()) {            
            CategoryEntity categoryEntity = new CategoryEntity(rst.getString(1),
                    rst.getInt(2),
                    rst.getString(3),
                    rst.getDouble(4));
            
           categoryEntitys.add(categoryEntity);
        }
        
        
        return categoryEntitys;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

