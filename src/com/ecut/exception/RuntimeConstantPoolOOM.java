package com.ecut.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:PermSize=10M -XX:MaxPermSize=10M  JDK 1.6 会抛出OOM异常，JDK1.7开始了去永久代
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用list保持着产量池的引用，避免fullGC回收常量池的行为
        List<String> list  = new ArrayList<>();
        int i = 0 ;
        while(true){
            list.add(String.valueOf(i++));
        }
    }
}
