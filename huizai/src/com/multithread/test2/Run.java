package com.multithread.test2;

public class Run {

    public static void main(String[] args){


        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.start();
        t2.start();
        t3.start();
    }
}
