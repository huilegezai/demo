package com.huilegezai.huawei.solution8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){

            int num = cn.nextInt();

            int[] ints = new int[num];

            for(int i = 0; i < num;i++){
                int tem = cn.nextInt();
                ints[tem] = ints[tem] + cn.nextInt();
            }

            for(int j = 0;j<num; j++){
                if(ints[j] !=0){
                    System.out.print(j);
                    System.out.print(' ');
                    System.out.println(ints[j]);
                }
            }
        }
    }

    public static void printMap(){

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int s=sc.nextInt();
                int value=sc.nextInt();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + value);
                } else
                    map.put(s, value);
            }
            for (Integer key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
