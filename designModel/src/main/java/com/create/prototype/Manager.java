package com.create.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    //保存名字和实例之间的对应关系
    private Map<String, Product> cash = new HashMap<>();

    //register 方法将接收到的名字和Product接口 注册到cash中，这里的Product接口是实现Product的实现类
    public void register(String name, Product product) {
        cash.put(name, product);
    }

    public Product create(String name) {
        Product product = cash.get(name);
        return product;
    }

    public static void main(String[] args) {
        Product box = new MessageBox('*');
        Manager manager = new Manager();
        //注册实例
        manager.register("xing", box);
        box.use("nihao");

        Product product = manager.create("xing");
        product.use("nihao");
    }
}
