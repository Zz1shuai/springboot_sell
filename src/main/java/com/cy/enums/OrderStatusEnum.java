package com.cy.enums;

import lombok.Getter;

/**
 * @Create by 猪小帅
 * @date 2022/8/24 15:11
 * @mood happy
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {

    NEW(0, "新订单"),

    FINISHED(1, "完结"),

    CANCEL(2, "已取消"),

    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
