package com.ecut.classload;

public class ConstClass {

    public static final String HELLOWORD = "hello world";

    static  {
        System.out.println("const init !");
    }
}
