package com.cy.enums;

import lombok.Getter;

/**
 * @Create by 猪小帅
 * @date 2022/7/14 12:38
 * @mood happy
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),

    SUCCESS(1, "支付成功"),

    ;

    Integer code;

    String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
