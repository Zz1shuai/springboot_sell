package com.cy.utils;

import com.cy.enums.CodeEnum;

/**
 * @Create by 猪小帅
 * @date 2022/9/8 16:11
 * @mood happy
 */

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
 }
