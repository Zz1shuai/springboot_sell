package com.cy.utils;

/**
 * @Create by 猪小帅
 * @date 2022/9/6 17:22
 * @mood happy
 */

public class MathUtil {

    private static final  Double MONEY_RANGE = 0.01;
    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }
}
