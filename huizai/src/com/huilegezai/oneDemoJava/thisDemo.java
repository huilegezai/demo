package com.huilegezai.oneDemoJava;

/**
 * this指向当前正在操作的对象，当前对象的引用
 */
public class thisDemo {
    int i = 0 ;
    thisDemo increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println( i );
    }
    public static void main(String[] args){
        thisDemo thisDemo = new thisDemo();
        thisDemo.increment().increment().increment().increment().print();
    }
}
