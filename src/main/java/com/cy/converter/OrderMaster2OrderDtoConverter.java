package com.cy.converter;

import com.cy.dto.OrderDto;
import com.cy.pojo.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Create by 猪小帅
 * @date 2022/8/29 13:05
 * @mood happy
 */

public class OrderMaster2OrderDtoConverter {
    public static OrderDto converter(OrderMaster orderMaster) {

        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(orderMaster, orderDto);
        return orderDto;
    }

    public static List<OrderDto> converter(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                converter(e)
        ).collect(Collectors.toList());
    }
}
