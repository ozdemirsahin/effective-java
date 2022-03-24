package com.example.equalshascodetostring;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Color color= new Color(1,2);
        Color color2= new Color(1,2);
        System.out.println(color.equals(color2));

        Map<Color,String> map=new HashMap<>();
        map.put(new Color(1,2),"deneme");
        System.out.println(map.get(new Color(1,2)));
    }
}
