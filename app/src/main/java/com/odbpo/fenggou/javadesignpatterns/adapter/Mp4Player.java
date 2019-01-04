package com.odbpo.fenggou.javadesignpatterns.adapter;

/**
 * @author: zc
 * @Time: 2019/1/4 15:00
 * @Desc:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
