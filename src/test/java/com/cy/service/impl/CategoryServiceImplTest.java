package com.cy.service.impl;

import com.cy.pojo.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/10 16:33
 * @mood happy
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findById() {
        ProductCategory productCategory = categoryService.findById(1);
        Assertions.assertEquals(1, productCategory.getCategoryId());
    }

    @Test
    void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assertions.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assertions.assertNotEquals(0, byCategoryTypeIn.size());
    }

    @Test
    void save() {
        ProductCategory productCategory = new ProductCategory("男生专享", 10);
        ProductCategory result = categoryService.save(productCategory);
        Assertions.assertNotNull(result);
    }
}