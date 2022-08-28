package com.cy.repository;

import com.cy.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Create by 猪小帅
 * @date 2022/8/24 16:33
 * @mood happy
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("0004");
        orderDetail.setOrderId("0091");
        orderDetail.setProductIcon("http://xxxxx.jpg");
        orderDetail.setProductId("111117");
        orderDetail.setProductName("有机蓝莓原浆");
        orderDetail.setProductPrice(new BigDecimal(6));
        orderDetail.setProductQuantity(48);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("0091");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}