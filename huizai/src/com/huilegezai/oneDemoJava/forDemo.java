package com.huilegezai.oneDemoJava;

import java.util.Random;

public class forDemo {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            System.out.println( i );
        }
        Random random = new Random( 47 );
        float f[] = new float[100];
        for (int i = 0;i<100;i++){
            f[i] = random.nextFloat();
        }

        for (float x : f){
            System.out.println( (int) (x*10) );
        }
    }
}
