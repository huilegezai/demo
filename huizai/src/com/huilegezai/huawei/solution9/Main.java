package com.huilegezai.huawei.solution9;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){

        Scanner cn = new Scanner(System.in);

        while (cn.hasNext()){

            int[] a = new int[10];
            int n = cn.nextInt();
            int num = 0;
            while (n != 0){

                if(a[n%10] == 0){
                    a[n%10]++;
                    num = num*10 + n%10;
                }

                n /= 10;
            }

            System.out.println(num);
        }
    }
}
