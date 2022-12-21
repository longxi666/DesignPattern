package com.dragon.my_spring.framework.beans.factory;

/**
 * @date 2022/12/15 21:16
 * TODO IOC 容器父接口
 */
public interface BeanFactory {

    Object getBean(String name) throws  Exception;

    <T> T getBean(String name,Class<? extends T> clazz) throws  Exception;

}
