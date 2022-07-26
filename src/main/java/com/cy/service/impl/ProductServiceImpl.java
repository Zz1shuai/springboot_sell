package com.cy.service.impl;

import com.cy.dao.ProductInfoDao;
import com.cy.pojo.ProductInfo;
import com.cy.enums.ProductStatusEnum;
import com.cy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/7/12 15:59
 * @mood happy
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao infoDao;

    @Override
    public ProductInfo findById(String productId) {
        return infoDao.findById(productId).orElse(null);
    }

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return infoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return infoDao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return infoDao.save(productInfo);
    }
}
