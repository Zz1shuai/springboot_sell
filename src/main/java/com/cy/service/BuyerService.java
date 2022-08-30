package com.cy.service;

import com.cy.dto.OrderDto;

/**
 * @Create by 猪小帅
 * @date 2022/8/30 23:13
 * @mood happy
 */

public interface BuyerService {

    //查询一个订单
    OrderDto findOrderOne(String openid, String orderId);

    //取消订单
    OrderDto cancelOrderOne(String openid, String orderId);
}
