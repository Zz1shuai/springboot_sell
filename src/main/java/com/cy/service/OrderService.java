package com.cy.service;

import com.cy.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 订单
 * @Create by 猪小帅
 * @date 2022/8/26 9:05
 * @mood happy
 */

public interface OrderService {

    /** 创建订单. */
    OrderDto create(OrderDto orderDto);

    /** 查询单个订单. */
    OrderDto findOne(String orderId);

    /** 查询订单列表. */
    Page<OrderDto> findList(String buyerOpenid, Pageable pageable);

    /** 取消订单. */
    OrderDto cancel(OrderDto orderDto);

    /** 完结订单. */
    OrderDto finish(OrderDto orderDto);

    /** 支付订单. */
    OrderDto paid(OrderDto orderDto);

    /** 查询订单列表. */
    Page<OrderDto> findList(Pageable pageable);
}
