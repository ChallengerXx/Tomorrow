package com.structural.bridge;

public class Green implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType + "绘制绿色的" + name);
    }
}
