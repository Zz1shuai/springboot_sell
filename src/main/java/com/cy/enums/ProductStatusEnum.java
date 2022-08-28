package com.cy.enums;

import lombok.Getter;

/**
 * @Create by 猪小帅
 * @date 2022/8/24 10:31
 * @mood happy
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "上架"),

    DOWN(1, "下架")

    ;

    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
