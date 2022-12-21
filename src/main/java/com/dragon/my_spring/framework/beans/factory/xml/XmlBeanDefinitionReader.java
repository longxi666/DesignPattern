package com.dragon.my_spring.framework.beans.factory.xml;

import com.dragon.my_spring.framework.beans.BeanDefinition;
import com.dragon.my_spring.framework.beans.MutablePropertyValues;
import com.dragon.my_spring.framework.beans.PropertyValue;
import com.dragon.my_spring.framework.beans.factory.support.BeanDefinitionReader;
import com.dragon.my_spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dragon.my_spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @date 2022/12/15 20:54
 * TODO 针对xml 文件的解析器
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    //声明注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //使用dom4j 进行xml文件的解析
        SAXReader saxReader = new SAXReader();
        //获取类路径下的配置文件
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = saxReader.read(is);
        //根据document 对象获取根标签对象（beans）
        Element rootElement = document.getRootElement();
        //获取根标签下的所有bean 标签对象
        List<Element> beanElements = rootElement.elements("bean");
        //遍历集合
        for (Element beanElement : beanElements) {
            //获取id
            String id = beanElement.attributeValue("id");
            //获取class
            String className = beanElement.attributeValue("class");

            //将两属性封装到BeanDefinition
            BeanDefinition definition = new BeanDefinition();
            definition.setId(id);
            definition.setClassName(className);

            //创建MutablePropertyValues 对象
            MutablePropertyValues propertyValues = new MutablePropertyValues();
            //property
            List<Element> properties = beanElement.elements("property");
            for (Element property : properties) {
                String name = property.attributeValue("name");
                String ref = property.attributeValue("ref");
                String value = property.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name,ref,value);
                propertyValues.addPropertyValue(propertyValue);
            }
            //封装到BeanDefinition
            definition.setPropertyValues(propertyValues);

            //将BeanDefinition 注册到注册表中
            registry.registerBeanDefinition(id,definition);
        }
    }
}
