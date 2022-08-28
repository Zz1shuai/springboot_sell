package com.cy.dto;

import lombok.Data;

/**
 * @Create by 猪小帅
 * @date 2022/8/28 10:07
 * @mood happy
 */
@Data
public class CartDto {

    /** 商品id. */
    private String productId;

    /** 商品数量. */
    private Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
