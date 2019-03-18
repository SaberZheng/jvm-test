package com.ecut.classload;

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 * -XX:+TraceClassLoading 
 */
public class NotInitializatio2 {
    public static void main(String[] args) {
        SuperClass[] superClasses  = new SuperClass[10];
    }
}


