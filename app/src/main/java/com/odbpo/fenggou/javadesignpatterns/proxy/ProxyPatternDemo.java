package com.odbpo.fenggou.javadesignpatterns.proxy;

/**
 * @author: zc
 * @Time: 2019/1/4 16:44
 * @Desc: 代理模式
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }

}
