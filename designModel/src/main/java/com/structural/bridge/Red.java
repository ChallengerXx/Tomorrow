package com.structural.bridge;

public class Red implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType + "绘制红色的" + name);
    }
}
