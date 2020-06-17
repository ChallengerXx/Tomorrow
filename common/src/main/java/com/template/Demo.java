package com.template;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Demo {

    public static List<String> test1(String id, Integer num){
        List<String> result = new ArrayList<>();
        if (id.equals("1")){
            result.add("1");
            result.add("2");
            result.add("3");
        } else {
            result.add("4");
            result.add("5");
        }

        switch (num){
            case 1:
                result.add("number one");
                break;
            case 2:
                result.add("number two");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String id = "1";
        Integer number = 2;
        ExternalServiceTemplate.ServiceExecutor<List<String>> executor = () -> test1(id, number);
        Map<String, Object> build = new ExternalServiceTemplate.ParamMap()
                .buildParam("id", id)
                .buildParam("number", number)
                .build();
        List<String> list = ExternalServiceTemplate.execute(executor, "XTXN", "查询车贷合同列表", build);
        System.out.println(list);

    }
}
