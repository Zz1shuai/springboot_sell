package com.cy.dao;

import com.cy.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/26 23:01
 * @mood happy
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("0002");
        orderDetail.setOrderId("0089");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("111115");
        orderDetail.setProductName("怡宝");
        orderDetail.setProductPrice(new BigDecimal(2.00));
        orderDetail.setProductQuantity(12);

        OrderDetail result = orderDetailDao.save(orderDetail);
        Assertions.assertNotNull(result);
    }
    @Test
    public void findByOrderId() {

        List<OrderDetail> orderDetailList = orderDetailDao.findByOrderId("0088");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}