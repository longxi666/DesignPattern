package com.dragon.my_spring.framework.context.support;


import com.dragon.my_spring.framework.beans.BeanDefinition;
import com.dragon.my_spring.framework.beans.PropertyValue;
import com.dragon.my_spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dragon.my_spring.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.dragon.my_spring.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @date 2022/12/15 21:50
 * TODO IOC 容器的子实现类,用于加载xml 配置文件
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try{
            this.refresh();
        } catch (Exception e){

        }
    }

    //根据bean 对象名称获取bean 对象
    @Override
    public Object getBean(String name) throws Exception {
        //判断对象容器中是否含有指定名称的bean
        Object o = singletonObjects.get(name);
        if (o != null){
            return o;
        }

        //获BeanDefinition 对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        //获取bean 信息中的className
        String className = beanDefinition.getClassName();
        //反射创建对象
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        //进行依赖注入
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues()) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && !"".equals(ref)) {
                //获取依赖的bean 对象
                Object bean = getBean(ref);
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //获取所有方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (methodName.equals(method.getName())){
                        //执行setter 方法
                        method.invoke(beanObj,bean);
                    }
                }
            }

            if(value != null && !"".equals(ref)) {
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //获取method 对象
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }
        }

        //返回beanObj 对象之前，将该对象存储到map 容器中
        singletonObjects.put(name , beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null){
            return null;
        }
        return clazz.cast(bean);
    }
}
