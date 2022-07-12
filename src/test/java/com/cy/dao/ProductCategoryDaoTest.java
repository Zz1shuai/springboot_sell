package com.cy.dao;

import com.cy.dataobject.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/8 0:20
 * @mood happy
 */
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao dao;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = dao.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = dao.save(productCategory);
        Assertions.assertNotNull(result);
//        Assertions.assertNotEquals(null, result);

    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = dao.findByCategoryTypeIn(list);
        Assertions.assertNotEquals(0, result.size());
    }
}