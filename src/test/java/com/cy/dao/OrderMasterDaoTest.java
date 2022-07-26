package com.cy.dao;

import com.cy.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Create by 猪小帅
 * @date 2022/7/20 21:04
 * @mood happy
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterDaoTest {


    @Autowired
    private OrderMasterDao orderMasterDao;

    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("0002");
        orderMaster.setBuyerName("小赵同学");
        orderMaster.setBuyerPhone("13812040093");
        orderMaster.setBuyerAddress("南京建邺");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal("88.88"));

        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(result);

    }
    @Test
    public void findByBuyerOpenid() {
        PageRequest request = PageRequest.of(1,4);

        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0, result.getTotalElements());

    }
}