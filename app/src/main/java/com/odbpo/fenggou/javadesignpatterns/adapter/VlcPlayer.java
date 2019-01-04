package com.odbpo.fenggou.javadesignpatterns.adapter;

/**
 * @author: zc
 * @Time: 2019/1/4 14:59
 * @Desc:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
