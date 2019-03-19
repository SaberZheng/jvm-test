package com.ecut.javac;

import java.util.HashMap;
import java.util.Map;

public class GenericTest {

    public static void main(String[] args) {
        Map< String , String >  map = new HashMap<>();

        map.put("How are you ?","吃了吗？");

        map.put("Hi","您好！");

        System.out.println(map.get("Hi"));
    }
}
