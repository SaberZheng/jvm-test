package com.ecut.gc;

public class FinalizeEscapeGC {

    public static FinalizeEscapeGC finalizeEscapeGC = null;

    public void isAlive(){
        System.out.println("yes, I am alive !");
    }

    @Override
    protected  void finalize() throws  Throwable{
        super.finalize();
        System.out.println("finalize method executed !");
        FinalizeEscapeGC.finalizeEscapeGC = this ;
    }

    public static void main(String[] args) throws InterruptedException {
        finalizeEscapeGC = new FinalizeEscapeGC();
        finalizeEscapeGC = null;
        //对象第一次成功拯救了自己
        System.gc();
        //finalize方法优先级很低，需要暂停等待
        Thread.sleep(500);
        if(finalizeEscapeGC != null){
            finalizeEscapeGC.isAlive();
        }else {
            System.out.println("no , I am dead !");
        }

        finalizeEscapeGC = null;
        //finalize方法只会被系统自动调用一次，因此逃跑失败
        System.gc();
        Thread.sleep(500);
        if(finalizeEscapeGC != null){
            finalizeEscapeGC.isAlive();
        }else {
            System.out.println("no , I am dead !");
        }
    }
}
