package com.huilegezai.huawei.solution13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            String nstr = cn.nextLine();

            String[] arrayStr = nstr.split(" ");
            for(int j = arrayStr.length-1;j>=0 ; j--) {
                System.out.print(arrayStr[j]);
                System.out.print(" ");
            }
        }
    }
}
