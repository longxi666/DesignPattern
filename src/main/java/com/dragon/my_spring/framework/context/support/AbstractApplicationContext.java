package com.dragon.my_spring.framework.context.support;

import com.dragon.my_spring.framework.beans.factory.support.BeanDefinitionReader;
import com.dragon.my_spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dragon.my_spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import com.dragon.my_spring.framework.context.ApplicationContext;

import java.util.*;

/**
 * @date 2022/12/15 21:40
 * TODO ApplicationContext 接口的子实现类,用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义存储Bean 对象的Map
    protected Map<String ,Object> singletonObjects = new HashMap<>();

    //声明记录配置文件路径变量
    protected String configLocation;
    @Override
    public void refresh() throws Exception {
        //加载BeanDefinition 对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化Bean

    }

    //bean对象的初始化
    private void finishBeanInitialization()throws Exception{
        //获取注册表
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        //获取BeanDefinition 对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            //进行Bean 的初始化
            getBean(beanName);
        }

    }
}
