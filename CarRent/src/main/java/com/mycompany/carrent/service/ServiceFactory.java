/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service;
import com.mycompany.carrent.service.custom.impl.CustomerServiceImpl;
import com.mycompany.carrent.service.custom.impl.CarServiceImpl;
import com.mycompany.carrent.service.custom.impl.CategoryServiceImpl;
import com.mycompany.carrent.service.custom.impl.RentServiceImpl;
import com.mycompany.carrent.service.custom.impl.ReturnServiceImpl;

/**
 *
 * @author Uthsara Basnayake
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();
            case CAR:
                return new CarServiceImpl();
            case USER:
               // return new OrderServiceImpl();
            case CATEGORY:
                return new CategoryServiceImpl();
            case RENT:
                return new RentServiceImpl();
            case RETURN:
                return (SuperService) new ReturnServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER, CAR,USER,CATEGORY,RENT,RETURN
    }
}
