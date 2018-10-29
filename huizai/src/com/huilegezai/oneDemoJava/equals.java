package com.huilegezai.oneDemoJava;

/**
 *equals与==的区别
 * equals比较的是对象的内容
 * ==比较的是对象的引用
 *
 */
public class equals {
    public static void main(String[] args){
        String s1 = "hui";
        String s2 = "hui";
        System.out.println( s1==s2 );//true
        System.out.println( s1.equals( s2 ));//true

        String as1 = new String( "huihui" );
        String as2 = new String( "huihui" );
        System.out.println( as1==as2 );//false
        System.out.println( as1.equals( as2 ));//true
    }
}
