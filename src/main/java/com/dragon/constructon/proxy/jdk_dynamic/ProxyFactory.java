package com.dragon.constructon.proxy.jdk_dynamic;

import java.lang.reflect.*;

/**
 * TODO 代理对象工厂类 创造代理对象
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //返回代理对象
        /*参数：
        * 类加载器：加载代理类，可以通过目标对象获取类加载器
        * 代理列实现接口的字节码对象
        * 代理对象的调用处理程序
        * */
        SellTickets proxyObject = (SellTickets)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),

                new InvocationHandler() {
                    /*invoke方法:
                    *   参数：
                    *       代理对象 //和proxyObject 是同一个对象，在invoke 中基本不用
                    *       对接口中的方法进行封装的method 对象
                    *       调用方法的实际参数
                    *
                    *   返回值：
                    *       方法的返回值
                    * */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*System.out.println("invoke!");*/
                        System.out.println("代售点收取服务费用 ———— jdk动态代理");
                        //执行目标对象的方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
