package com.huilegezai.classDemo;

public class instruIm implements instru {
    @Override
    public void f() {
        System.out.println( "implements" );
    }
    public static void main(String[] args){
        instruIm instruIm = new instruIm();
        instruIm.f();
    }
}
