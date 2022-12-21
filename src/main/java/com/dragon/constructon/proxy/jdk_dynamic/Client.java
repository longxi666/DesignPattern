package com.dragon.constructon.proxy.jdk_dynamic;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2. 使用Factory 对象获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        System.out.println(proxyObject.getClass());
        //3. 调用方法
        proxyObject.sell();
        proxyObject.sellWater();


        //让程序一直执行 -- 判断
        /*while(true){

        }*/
    }
}
