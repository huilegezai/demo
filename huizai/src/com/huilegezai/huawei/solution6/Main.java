package com.huilegezai.huawei.solution6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            Long num = cn.nextLong();

            isPrimerFactors(num);
        }
    }

    private static void isPrimerFactors(long num)
    {
        long number = num;
        while(number != 1)
        {
            for(int i = 2; i <= number ;i++)
            {
                if(number % i == 0)
                {
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
