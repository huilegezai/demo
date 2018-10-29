package com.huilegezai.alg;

public class prime {
    private static boolean isPrime(int num){
        if(num == 1)
            return false;
        long sprtNum = (long) Math.sqrt( num );
        for (int i = 2; i <= sprtNum;i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args){

        for(int i = 1; i < 100;i++){
            if(isPrime( i )){
                System.out.println( i );
            }
        }
    }
}
