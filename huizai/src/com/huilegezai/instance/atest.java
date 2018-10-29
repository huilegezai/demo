package com.huilegezai.instance;

public class atest {
    public static void main(String[] args){
        a ll1 = new a();
        a ll2 = new a();
        a ll3 = new a();
        Thread thread1 = new Thread( ll1 );
        Thread thread2 = new Thread( ll2 );
        Thread thread3 = new Thread( ll3 );
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
