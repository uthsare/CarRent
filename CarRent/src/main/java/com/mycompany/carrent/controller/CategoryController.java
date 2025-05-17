/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent.controller;
import com.mycompany.carrent.dto.CategoryDto;
import com.mycompany.carrent.entity.CategoryEntity;
import com.mycompany.carrent.service.ServiceFactory;
import com.mycompany.carrent.service.custom.CategoryService;
import com.mycompany.carrent.service.custom.impl.CategoryServiceImpl;
import java.util.ArrayList;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public class CategoryController {

   

    CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String addCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.addCategory(categoryDto);
    }

    public ArrayList<CategoryDto> getAllCategories() throws Exception {
        return categoryService.getAllCategories();
    }

    public String updateCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.updateCategory(categoryDto);
    }

    public String deleteCategory(String name) throws Exception {
        return categoryService.deleteCategory(name);
    }

    public CategoryDto getCar(String regNo) throws Exception {
        return categoryService.getCategory(regNo);
    }

    public String[] searchCategory(String brand) throws Exception {
       CategoryServiceImpl csi=new CategoryServiceImpl();
        return csi.getCategorys(brand);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
