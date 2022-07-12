package com.cy.dao;

import com.cy.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/12 15:30
 * @mood happy
 */

public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
