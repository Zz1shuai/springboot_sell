package com.cy.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Create by 猪小帅
 * @date 2022/7/12 16:04
 * @mood happy
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")

    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
