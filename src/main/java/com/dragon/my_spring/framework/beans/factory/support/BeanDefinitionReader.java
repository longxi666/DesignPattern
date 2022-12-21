package com.dragon.my_spring.framework.beans.factory.support;

/**
 * @date 2022/12/15 20:53
 * TODO 用来解析配置文件， 该接口仅定义规范
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}

