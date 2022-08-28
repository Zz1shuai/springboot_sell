package com.cy.service;

import com.cy.pojo.ProductCategory;

import java.util.List;

/**
 * 类目
 * @Create by 猪小帅
 * @date 2022/8/23 10:05
 * @mood happy
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory sava(ProductCategory productCategory);
}
