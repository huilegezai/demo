package com.huilegezai.huawei.solution3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            int num = cn.nextInt();
            ArrayList<Integer> arrays = new ArrayList<Integer>();
            for (int i = 0; i < num;i++){
                arrays.add(cn.nextInt());
            }


            Collections.sort(arrays);

            for (int j = 0;j < arrays.size();j++){
                if (arrays.get(j) > 1000)
                    arrays.remove(j);
            }

            for (int k = 0; k < arrays.size()-1;){
                if (arrays.get(k) == arrays.get(k+1)){
                    arrays.remove(k+1);
                }else{
                    k++;
                }
            }


            for (int j = 0;j < arrays.size();j++){
                System.out.println(arrays.get(j));
            }
        }
    }
}
