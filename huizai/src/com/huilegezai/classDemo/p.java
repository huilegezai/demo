package com.huilegezai.classDemo;

class n{
    final int nn = 10; //final这是不能改变的
    n(){
        System.out.println( "初始化n" );
    }
    public void nprint(){
        System.out.println( "n" );
        System.out.println( nn );
    }
}
class s extends n{
   s(){
       System.out.println( "初始化s" );
   }
}
public class p {
    public static void main(String[] args){
        s ss = new s();
        ss.nprint();
    }
}

/*
初始化n
初始化s
n
* */