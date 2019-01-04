package com.odbpo.fenggou.javadesignpatterns.proxy;

/**
 * @author: zc
 * @Time: 2019/1/4 16:42
 * @Desc:
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {

    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
