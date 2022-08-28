package com.cy.exception;

import com.cy.enums.ResultEnum;

/**
 * @Create by 猪小帅
 * @date 2022/8/26 9:28
 * @mood happy
 */

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
       super(resultEnum.getMsg());

       this.code = resultEnum.getCode();
    }
}
