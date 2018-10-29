package com.huilegezai.huawei.solution5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            String str16 = cn.nextLine();

            System.out.println(Integer.parseInt(str16,16));
        }
    }
}
