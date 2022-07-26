package com.cy.dao;

import com.cy.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Create by 猪小帅
 * @date 2022/7/14 12:58
 * @mood happy
 */

public interface OrderMasterDao extends JpaRepository<OrderMaster ,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
