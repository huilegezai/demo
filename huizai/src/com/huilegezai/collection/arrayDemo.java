package com.huilegezai.collection;

import java.util.ArrayList;

public class arrayDemo {
    public static void main(String[] args){
        ArrayList  arrayList = new ArrayList();
        int[] a = {1,2,5,6,4,8};
        int[] b = a;
        System.out.println( b.length );
        arrayList.add("h");
        arrayList.add("p");
        arrayList.add("s");
        for (int i = 0 ; i < arrayList.size(); i ++) {
            System.out.println( arrayList.get( i ) );
        }
    }
}
