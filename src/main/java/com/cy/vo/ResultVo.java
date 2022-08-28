package com.cy.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @Create by 猪小帅
 * @date 2022/8/24 11:00
 * @mood happy
 */
@Data
public class ResultVo<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
