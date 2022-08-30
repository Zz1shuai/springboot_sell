package com.cy.utils;

import com.cy.vo.ResultVo;

/**
 * @Create by 猪小帅
 * @date 2022/8/24 14:57
 * @mood happy
 */

public class ResultVoUtil {

    public static ResultVo success(Object object) {
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo error(Integer code, String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }


}
