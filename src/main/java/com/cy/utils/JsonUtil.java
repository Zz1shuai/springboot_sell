package com.cy.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Create by 猪小帅
 * @date 2022/9/5 22:18
 * @mood happy
 */

public class JsonUtil {
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
