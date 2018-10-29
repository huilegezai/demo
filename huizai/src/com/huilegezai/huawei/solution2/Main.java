package com.huilegezai.huawei.solution2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner cn = new Scanner(System.in);

        while (cn.hasNext()){
            String str = cn.next();
            String c = cn.next();

            int sum = 0;

            for (int i = 0;i<str.length();i++){
                if (str.charAt(i) == c.toLowerCase().toCharArray()[0] || str.charAt(i) == c.toUpperCase().toCharArray()[0])
                    sum ++;
            }

            System.out.println(sum);

        }
    }
}
