package com.huilegezai.instance;

public class a implements Runnable {
    @Override
    public void run() {
        System.out.println( MyObject.getInstance().hashCode() );
    }
}
