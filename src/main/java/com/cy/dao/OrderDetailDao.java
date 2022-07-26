package com.cy.dao;

import com.cy.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/14 13:04
 * @mood happy
 */

public interface OrderDetailDao extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
