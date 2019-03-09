package com.ecut.exception;

public class RuntimeConstantPool {
    public static void main(String[] args) {
        /*jdk1.6 intern方法会把首次遇到的字符串实例复制到永久代中，返回的也是这个永久代中的这个字符串实例的引用。
        StringBuilder创建的字符串实例在Java堆上，所以必然不是同一个引用
        jdk1.7中intern实现只是在常量池中记录首次出现的实例引用，因此intern返回的引用和StringBuilder创建的那个字符
        串实例时同一个*/
        String s1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(s1.intern() == s1);
    }
}
