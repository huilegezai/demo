package com.huilegezai.huawei.solution12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()){
            String nstr = cn.next();

            StringBuffer sb = new StringBuffer(nstr);

            sb.reverse();

            System.out.println(sb.toString());
        }
    }
}
