package com.cy.service.impl;

import com.cy.dto.OrderDto;
import com.cy.service.OrderService;
import com.cy.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Create by 猪小帅
 * @date 2022/9/5 15:27
 * @mood happy
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDto orderDto = orderService.findOne("1661842752811447301");
        payService.create(orderDto);
    }

    @Test
    public void refund() {
        OrderDto orderDto = orderService.findOne("1661842752811447301");
        payService.refund(orderDto);
    }
}