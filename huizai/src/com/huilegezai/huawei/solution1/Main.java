package com.huilegezai.huawei.solution1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            String str = cn.nextLine();
            String[] st1 = str.split(" ");
            String st2 = st1[st1.length - 1];
            System.out.println(st2.length());
        }


    }
}
