/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.carrent.service.custom;

import com.mycompany.carrent.dto.CategoryDto;
import com.mycompany.carrent.entity.CategoryEntity;
import java.util.ArrayList;
import com.mycompany.carrent.service.SuperService;

/**
 *
 * @author <"Uthsara Basnayake">
 */
public interface CategoryService extends SuperService {
    String addCategory(CategoryDto categorydto)throws Exception;
       
    CategoryEntity getCategory(String categoryName) throws Exception;
   public String deleteCategory(String name);

    public String updateCategory(CategoryDto categoryDto);
    ArrayList<CategoryDto> getAllCategories() throws Exception;

 
}
