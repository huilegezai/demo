package com.huilegezai.oneDemoJava;

class rock{
    rock(){
        System.out.println( "rock()" );
    }
    rock(int n){
        System.out.println( "rock()"+n );
    }
}
public class simpleconstructor {
    public static void main(String[] args){
        for (int i = 0 ; i < 10 ; i ++){
            new rock();
        }

        for (int i = 0 ; i < 10 ; i ++){
            new rock(i);
        }
    }
}
