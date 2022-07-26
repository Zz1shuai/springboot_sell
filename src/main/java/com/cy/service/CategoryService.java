package com.cy.service;

import com.cy.pojo.ProductCategory;

import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/10 16:17
 * @mood happy
 */

public interface CategoryService {

   ProductCategory findById(Integer categoryId);

   List<ProductCategory> findAll();

   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

   ProductCategory save(ProductCategory productCategory);
}
