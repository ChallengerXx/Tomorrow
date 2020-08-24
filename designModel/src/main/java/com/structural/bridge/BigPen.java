package com.structural.bridge;

public class BigPen extends Pen {

    @Override
    public void draw(String name) {
        String pen = "大号笔";
        this.color.bePaint(pen, name);
    }
}
