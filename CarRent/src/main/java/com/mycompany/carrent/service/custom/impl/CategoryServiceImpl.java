/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.service.custom.impl;

import com.mycompany.carrent.dao.DaoFactory;
import com.mycompany.carrent.dao.custom.CategoryDao;
import com.mycompany.carrent.dao.custom.impl.CategoryDaoImpl;
import com.mycompany.carrent.dto.CategoryDto;
import com.mycompany.carrent.entity.CategoryEntity;
import com.mycompany.carrent.service.custom.CategoryService;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CategoryServiceImpl implements CategoryService {
CategoryDao categoryDao=(CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    @Override
    public String addCategory(CategoryDto categorydto) throws Exception {
        CategoryEntity ce = new CategoryEntity(categorydto.getCategoryName(), categorydto.getNoOfCars(),
                categorydto.getBrand(),categorydto.getFee());

        if (categoryDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String[] getCategorys(String brand) throws Exception {
        CategoryDaoImpl categoryDaoimpl=new CategoryDaoImpl();
      String[] cats= categoryDaoimpl.geT(brand);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return cats;
    }

    @Override
    public ArrayList<CategoryDto> getAllCategories() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCategory(String name) {
    try {
        if (categoryDao.delete(name)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } catch (Exception ex) {
        Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    @Override
    public String updateCategory(CategoryDto categoryDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoryEntity getCategory(String categoryName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
