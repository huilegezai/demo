package com.huilegezai.huawei.solution14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        String[] ints = new String[n];
        for(int i = 0 ;i<n;i++){
            ints[i] = cn.next();
        }

        Arrays.sort(ints);

        for(int j = 0;j<ints.length;j++){
            System.out.println(ints[j]);
        }
    }
}
