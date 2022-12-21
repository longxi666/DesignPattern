package com.dragon.my_spring.framework.context;

import com.dragon.my_spring.framework.beans.factory.BeanFactory;

/**
 * @date 2022/12/15 21:30
 * TODO 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
