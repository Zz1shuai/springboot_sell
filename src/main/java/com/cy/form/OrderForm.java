package com.cy.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Create by 猪小帅
 * @date 2022/8/30 13:53
 * @mood happy
 */
@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家姓名
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家微信openid
     */
    @NotEmpty(message = "openid")
    private String openid;

    /**
     * g购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
