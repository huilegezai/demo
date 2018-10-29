package com.huilegezai.huawei.solution10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){

            int[] ints = new int[128];
            String cstr = cn.next();

            for (int i = 0;i < cstr.length();i++){

                if(cstr.charAt(i) >= 0 && cstr.charAt(i) <= 127){
                    ints[cstr.charAt(i)] ++;
                }
            }
            int count = 0;
            for (int j = 0;j < 128;j++){

                if(ints[j] > 0){
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}
