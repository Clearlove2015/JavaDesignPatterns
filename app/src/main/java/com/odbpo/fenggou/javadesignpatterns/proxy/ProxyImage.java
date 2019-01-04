package com.odbpo.fenggou.javadesignpatterns.proxy;

/**
 * @author: zc
 * @Time: 2019/1/4 16:43
 * @Desc:
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
