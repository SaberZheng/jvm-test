package com.ecut.exception;

/**
 * -Xss128k
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        }catch (Exception e){
            System.out.println("stack length :" + javaVMStackSOF.stackLength);
            throw e;

        }
    }
}
