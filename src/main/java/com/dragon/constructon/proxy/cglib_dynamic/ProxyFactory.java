package com.dragon.constructon.proxy.cglib_dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

/**
 * TODO 代理对象工厂，用来生成代理对象 -- cglib 代理方式
 */
public class ProxyFactory implements MethodInterceptor, Callback  {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer 类，类似与jdk 代理中的Proxy 类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取服务费 -- cglib");
        //调用目标对象的方法
        return method.invoke(station,objects);
    }

}
