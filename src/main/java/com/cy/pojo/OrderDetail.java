package com.cy.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Create by 猪小帅
 * @date 2022/7/14 12:50
 * @mood happy
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id. */
    private String orderId;
    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}
