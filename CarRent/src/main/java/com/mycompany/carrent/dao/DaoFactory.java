/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.dao;
import com.mycompany.carrent.dao.custom.impl.CustomerDaoImpl;
import com.mycompany.carrent.dao.custom.impl.CarDaoImpl;
import com.mycompany.carrent.dao.custom.impl.CategoryDaoImpl;
import com.mycompany.carrent.dao.custom.impl.RentDaoImpl;
import com.mycompany.carrent.dao.custom.impl.ReturnDaoImpl;
/**
 *
 * @author Uthsara Basnayake
 */
public class DaoFactory {
     private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
    if (daoFactory==null){
    daoFactory=new DaoFactory();
    }
    return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
     switch(type){
         case CUSTOMER:
             return new CustomerDaoImpl();
         case CAR:
             return new CarDaoImpl();
         case CATEGORY:
             return new CategoryDaoImpl();
         case RENT:
            return new RentDaoImpl();
         case RETURN:
             return new ReturnDaoImpl();
         default:
     return null;}
    }
    public enum DaoTypes{
    CUSTOMER,CAR,CATEGORY,RENT,RETURN
    } 
}
