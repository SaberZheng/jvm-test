package com.ecut.stack;

/**
 * -verbose:gc
 */
public class SlotTest {

    public static void main(String[] args) {
        //placeholder的作用域被限制在花括号之内
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        //如果不增加这行，即没有任何对局部变量表的读写操作，placeholder原本所占用的Slot还没有被其他变量所复用，所以作为GC Roots一部分的局部变量表仍然保持着对它的关联。
        int a = 0 ;
        System.gc();
    }
}
