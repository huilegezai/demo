package com.huilegezai.huawei.solution7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            float douNum = cn.nextFloat();
            int douInt = (int) douNum;

            if(douNum > 0 ){
                if ((douNum - douInt) >= 0.5) {
                    System.out.println(douInt + 1);
                }else {
                    System.out.println(douInt);
                }
            }else {
                if ((douNum - douInt) <= -0.5){
                    System.out.println(douInt);
                }else {
                    System.out.println(douInt - 1);
                }
            }
        }
    }
}
