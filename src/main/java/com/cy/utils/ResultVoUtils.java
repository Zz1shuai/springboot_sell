package com.cy.utils;

import com.cy.vo.ResultVo;

/**
 * @Create by 猪小帅
 * @date 2022/7/13 15:39
 * @mood happy
 */

public class ResultVoUtils {

    public static ResultVo<Object> success(Object object) {
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo<Object> success() {
        return success(null);
    }

    public static ResultVo<Object> error(Integer code, String msg) {
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
