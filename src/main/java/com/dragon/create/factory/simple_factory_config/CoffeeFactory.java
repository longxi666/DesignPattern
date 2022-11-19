package com.dragon.create.factory.simple_factory_config;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import static java.lang.Class.forName;

/**
 * TODO 咖啡配置工厂(static版)* -- bean.properties
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中的配置全类名并创建对象进行存储

    //1.定义容器对象储存咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    //2.加载配置文件，只需加载一次
    static {
        //创建Properties 对象
        Properties p = new Properties();
        //调用Load 方法进行配置文件加载
        InputStream stream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(stream);
            //从p 集合中获取全类名并创建对象
            Set<Object> keySet = p.keySet();
            for (Object key : keySet) {
                String className = p.getProperty((String) key);
                //通过反射进行对象创建
                Class clazz = forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将名称和对象存储到map之中
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据名称获取对象
    public static Coffee creatCoffee(String name){
        Coffee coffee = map.get(name);
        return coffee;
    }

}
