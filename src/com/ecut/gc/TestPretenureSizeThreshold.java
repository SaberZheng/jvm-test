package com.ecut.gc;

/**
 * -verbose:ge -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {

        byte[]  allocation = new byte[4 * _1MB];

    }
}
