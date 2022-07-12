package com.cy.controller;

import com.cy.vo.ProductInfoVo;
import com.cy.vo.ProductVo;
import com.cy.vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 买家商品
 * @Create by 猪小帅
 * @date 2022/7/12 18:49
 * @mood happy
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVo list() {
        ResultVo<Object> resultVo = new ResultVo<>();
        ProductVo productVo = new ProductVo();
        ProductInfoVo productInfoVo = new ProductInfoVo();

        productVo.setProductInfoVoList(Arrays.asList(productInfoVo));
        resultVo.setData(Arrays.asList(productVo));
        resultVo.setCode(0);
        resultVo.setMsg("成功");

        return resultVo;
    }


}
