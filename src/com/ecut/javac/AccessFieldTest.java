package com.ecut.javac;

import java.lang.reflect.Field;

public class AccessFieldTest {

    public static void main(String[] args) {

        Object o = new Student();

        Class<?> c = o.getClass() ;

        Field[] fields = c.getDeclaredFields();//获得由本类直接声明的所有的属性组成的 Field 数组

        for( int i = 0 , n = fields.length ; i < n ; i++ ) {
            Field f = fields[ i ] ;
            System.out.println( f );
        }

    }
}
