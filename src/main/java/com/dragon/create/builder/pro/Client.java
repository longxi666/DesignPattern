package com.dragon.create.builder.pro;


public class Client {
    public static void main(String[] args) {
        //创建手机对象,通过构造者创造手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("Samsung")
                .memory("kingston")
                .mainboard("ASUS")
                .build();

        System.out.println(phone);
    }
}
