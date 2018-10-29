package com.huilegezai.huawei.solution11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            int n = cn.nextInt();

            String s = "";
            while (n != 0){

                s = s  + n % 10;

                n /= 10;
            }

            System.out.println(s);
        }
    }
}
