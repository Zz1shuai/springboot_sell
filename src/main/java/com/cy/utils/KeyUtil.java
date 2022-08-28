package com.cy.utils;

import java.util.Random;

/**
 * @Create by 猪小帅
 * @date 2022/8/26 9:51
 * @mood happy
 */

public class KeyUtil {
    /**
     * 生成唯一的主键
     * 时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey() {

        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
