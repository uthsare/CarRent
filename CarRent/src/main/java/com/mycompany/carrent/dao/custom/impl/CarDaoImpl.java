/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao.custom.impl;
import com.mycompany.carrent.dao.CrudUtil;
import com.mycompany.carrent.dao.custom.CarDao;
import com.mycompany.carrent.entity.CarEntity;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CarDaoImpl implements CarDao {

    
    @Override
    public boolean add(CarEntity t) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO cars VALUES(?,?,?,?,?,?)",
               t.getCategory(),  t.getBrand(),t.getModel(),t.getRegNo(),t.getMfyear(),t.getNoOfCars());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE cars SET  brand=?, model=?, manufactyear=?, regNo=?,noOfCars=? WHERE regNo=?",
                t.getBrand(),t.getModel(),t.getMfyear(),t.getRegNo(), t.getNoOfCars()
                 );
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String regNo) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM cars WHERE regNo=?",
                regNo);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CarEntity get(String regNo) throws Exception {
       ResultSet rst = CrudUtil.executeQuery("Select * FROM cars WHERE regNo = ?", regNo);
        
        while (rst.next()) {            
             CarEntity carEntity = new CarEntity(rst.getString(1),rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
            rst.getInt(6));
            return carEntity;
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("Select * FROM cars");
        ArrayList<CarEntity> carEntitys = new ArrayList<>();
        while (rst.next()) {            
            CarEntity carEntity = new CarEntity(rst.getString(1),rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
            rst.getInt(6));
            
           carEntitys.add(carEntity);
        }
        
        
        return carEntitys;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 public static String[] geT(String category) throws Exception {
       
       
      
        int j=0;
         String[] models =new String[0];
         
         
       ResultSet rst = CrudUtil.executeQuery("Select name FROM cars WHERE  =?", category);
      
            
             while(rst.next()){
                 
               
                 
                  String temp[]=new String[models.length+1];
         for(int i=0;i<temp.length-1;i++)
         {temp[i]=models[i];
         }
         models=temp;
                
                 
                 models[j]=rst.getString(1);
                       
                 j++;
                 
                 
             }  
        
                // System.out.println(j+"    ,"+Arrays.toString(category));
         return models; 
      
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    
        
    }

}
