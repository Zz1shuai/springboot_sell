package com.cy.dao;

import com.cy.pojo.ProductInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/12 15:34
 * @mood happy
 */
@SpringBootTest
class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao infoDao;

    @Test
    void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal("3.2"));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = infoDao.save(productInfo);
        Assertions.assertNotNull(result);

    }

    @Test
    void findByProductStatus() {

        List<ProductInfo> productInfoList = infoDao.findByProductStatus(0);
        Assertions.assertNotEquals(0, productInfoList.size());
    }
}