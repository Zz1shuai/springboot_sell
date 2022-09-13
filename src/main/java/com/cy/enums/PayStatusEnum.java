package com.cy.enums;

import lombok.Getter;

/**
 * @Create by 猪小帅
 * @date 2022/8/24 15:15
 * @mood happy
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "未支付"),

    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
