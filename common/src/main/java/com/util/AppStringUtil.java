package com.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStringUtil {

    public static List<String> strToList(String str,String regex){
        if (str != null){
            return Arrays.asList(StringUtils.delimitedListToStringArray(str,regex));
        }
        return new ArrayList<>();
    }
}
