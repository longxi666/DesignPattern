package com.dragon.create.singleton_pattern.problems;

import java.io.IOException;
import java.io.InputStream;

/**
 * TODO RunTime类的简单使用
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {

        //获取Runtime 类对象
        Runtime runtime = Runtime.getRuntime();

        //调用Runtime 方法

        //exec 方法参数为一个命令
        Process process = runtime.exec("ipconfig");
        //调用process 对象输入流方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(arr);//返回读到的字节个数
        //将字节数组转换为字符串然后输出
        System.out.println(new String(arr, 0, len, "GBK"));

    }
}

