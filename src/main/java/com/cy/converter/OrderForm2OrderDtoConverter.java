package com.cy.converter;

import com.cy.dto.OrderDto;
import com.cy.enums.ResultEnum;
import com.cy.exception.SellException;
import com.cy.form.OrderForm;
import com.cy.pojo.OrderDetail;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Create by 猪小帅
 * @date 2022/8/30 14:08
 * @mood happy
 */
@Slf4j
public class OrderForm2OrderDtoConverter {

    public static OrderDto converter(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDto orderDto = new OrderDto();

        orderDto.setBuyerName(orderForm.getName());
        orderDto.setBuyerPhone(orderForm.getPhone());
        orderDto.setBuyerAddress(orderForm.getAddress());
        orderDto.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList =gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e) {
            log.info("【对象转换】错误, string = {}", orderForm.getItems());
            throw new SellException(ResultEnum.PARM_ERROR);
        }
        orderDto.setOrderDetailList(orderDetailList);

        return orderDto;
    }
}
