package com.dragon.my_spring.framework.utils;

/**
 * @date 2022/12/15 22:07
 */
public class StringUtils {
    private StringUtils() {
    }

    public static String getSetterMethodByFieldName(String fieldName){
        String methodName = "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        return methodName;
    }
}
