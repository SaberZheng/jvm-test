package com.ecut.gc;

public class ReferenceCountingGC {

    public Object instance = null ;

    private byte[] bigSize = new byte[2*1024*1024];

    public static void main(String[] args) {
        ReferenceCountingGC referenceCountingGC1 = new ReferenceCountingGC();
        ReferenceCountingGC referenceCountingGC2 = new ReferenceCountingGC();
        referenceCountingGC1.instance = referenceCountingGC2;
        referenceCountingGC2.instance = referenceCountingGC1;
        referenceCountingGC1 = null;
        referenceCountingGC2 = null;
        System.gc();
    }
}
