package com.ecut.classload;

/**
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义的常量的类，因此不会触发定义常量的类初始化
 */
public class NotInitializatio3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORD);
    }
}


