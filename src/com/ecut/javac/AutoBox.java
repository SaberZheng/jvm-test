package com.ecut.javac;

/**
 * 基本数据类型和引用类型的区别主要在于基本数据类型是分配在栈上的，而引用类型是分配在堆上的
 * 不论是基本数据类型还是引用类型，他们都会先在栈中分配一块内存，对于基本类型来说，这块区域包含的是基本类型的内容；
 * 而对于引用类型来说，这块区域包含的是指向真正内容的指针，真正的内容被手动的分配在堆上。
 */
public class AutoBox {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Integer h = new Integer(3);
        Integer i = new Integer(3);
        /*
        包装类遇到“==”号的情况下，如果不遇到算数运算符（+、-、*、……）是不会自动拆箱的.所以这里“==”比较的是对象（地址）
         */
        //true 对于Integer 类型，整型的包装类系统会自动在常量池中初始化-128至127的值，如果c和d都指向同一个对象，即同一个地址。
        System.out.println("c==d:" + (c == d));
        //false 但是对于超出范围外的值就是要通过new来创建包装类型，所以内存地址也不相等
        System.out.println("e==f:" + (e == f));
        //true 因为遇到运算符自动拆箱变为数值比较，所以相等。
        System.out.println("c==(a+b):" + (c == (a + b)));
        //true 包装类都重写了equals（）方法，他们进行比较时是比的拆箱后数值。但是并不会进行类型转换
        System.out.println("c.equals(a+b)" + (c.equals(a + b)));
        //true ==遇到算数运算符会自动拆箱（long） 3==（int）3
        System.out.println("g==(a+b)" + (g == (a + b)));
        //false equals首先看比较的类型是不是同一个类型，如果是，则比较值是否相等，否则直接返回false
        System.out.println("g.equals(a+b):" + g.equals(a + b));
        //true equals首先看比较的类型是不是同一个类型，如果是，则比较值是否相等，否则直接返回false
        System.out.println("h.equals(i):" + h.equals(i));
        //false 通过new来创建包装类型，所以内存地址也不相等
        System.out.println("h == i:" + (h == i));
    }
}


