package com.structural.bridge;

public class ClientMain {

    public static void main(String[] args) {
        Color color = new Green();
        Pen pen = new SmallPen();

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
