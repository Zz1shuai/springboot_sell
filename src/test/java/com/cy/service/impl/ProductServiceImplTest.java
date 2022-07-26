package com.cy.service.impl;

import com.cy.pojo.ProductInfo;
import com.cy.enums.ProductStatusEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/12 16:12
 * @mood happy
 */
@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;
    @Test
    void findById() {
        ProductInfo productInfo = productService.findById("12345");
        Assertions.assertEquals("12345", productInfo.getProductId());
    }

    @Test
    void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assertions.assertNotEquals(0, productInfoList.size());
    }

    @Test
    void findAll() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
//        System.out.println(productInfoPage.getTotalElements());
        Assertions.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("6789");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal("3.2"));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的粥虾");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        Assertions.assertNotNull(result);
    }
}