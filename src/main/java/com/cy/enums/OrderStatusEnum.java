package com.cy.enums;

import lombok.Getter;

/**
 * @Create by 猪小帅
 * @date 2022/7/14 12:33
 * @mood happy
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),

    FINISHED(1, "完结"),

    CANCEL(2, "已取消"),

    ;

    Integer code;

    String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
