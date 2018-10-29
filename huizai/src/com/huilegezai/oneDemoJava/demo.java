package com.huilegezai.oneDemoJava;

import java.util.Date;

public class demo {
    public static void main(String[] ags){
        System.out.println( "one first java" );
        System.out.println( new Date());
        System.out.println(System.getProperty( "java.library.path" ));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println(System.getProperty( "user.name" ));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.getProperties().list( System.out );
    }
}
