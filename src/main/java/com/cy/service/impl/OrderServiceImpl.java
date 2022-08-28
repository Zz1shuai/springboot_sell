package com.cy.service.impl;

import com.cy.dto.CartDto;
import com.cy.dto.OrderDto;
import com.cy.enums.OrderStatusEnum;
import com.cy.enums.PayStatusEnum;
import com.cy.enums.ResultEnum;
import com.cy.exception.SellException;
import com.cy.pojo.OrderDetail;
import com.cy.pojo.OrderMaster;
import com.cy.pojo.ProductInfo;
import com.cy.repository.OrderDetailRepository;
import com.cy.repository.OrderMasterRepository;
import com.cy.service.OrderService;
import com.cy.service.ProductService;
import com.cy.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Create by 猪小帅
 * @date 2022/8/26 9:17
 * @mood happy
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    /**
     * 创建订单.
     *
     * @param orderDto
     */
    @Override
    @Transactional
    public OrderDto create(OrderDto orderDto) {

        String orderId = KeyUtil.genUniqueKey();
        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);

//        List<CartDto> cartDtoList = new ArrayList<>();

        //1.查询（数量，价格）
        for (OrderDetail orderDetail : orderDto.getOrderDetailList()) {
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            //2.计算订单总价
            orderAmount =productInfo.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);

            //订单详情入库
            orderDetail.setOrderId(orderId);
            orderDetail.setDetailId(KeyUtil.genUniqueKey());
            BeanUtils.copyProperties(productInfo, orderDetail);
            orderDetailRepository.save(orderDetail);

//            CartDto cartDto = new CartDto(orderDetail.getProductId(),orderDetail.getProductQuantity() );
//            cartDtoList.add(cartDto);
        }

        //3.写入订单数据库（orderMaster和orderDetail）
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDto, orderMaster);
        orderMaster.setOrderId(orderId);
        orderMaster.setOrderAmount(orderAmount);
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterRepository.save(orderMaster);

        //4.扣库存
        List<CartDto> cartDtoList =  orderDto.getOrderDetailList().stream()
                .map(e -> new CartDto(e.getProductId(), e.getProductQuantity()))
                .collect(Collectors.toList());
        productService.decreaseStock(cartDtoList);

        return orderDto;
    }

    /**
     * 查询单个订单.
     *
     * @param orderId
     */
    @Override
    public OrderDto findOne(String orderId) {
        return null;
    }

    /**
     * 查询订单列表.
     *
     * @param buyerOpenid
     * @param pageable
     */
    @Override
    public Page<OrderDto> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    /**
     * 取消订单.
     *
     * @param orderDto
     */
    @Override
    public OrderDto cancel(OrderDto orderDto) {
        return null;
    }

    /**
     * 完结订单.
     *
     * @param orderDto
     */
    @Override
    public OrderDto finish(OrderDto orderDto) {
        return null;
    }

    /**
     * 支付订单.
     *
     * @param orderDto
     */
    @Override
    public OrderDto paid(OrderDto orderDto) {
        return null;
    }
}
