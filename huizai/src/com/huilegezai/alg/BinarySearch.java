package com.huilegezai.alg;

public class BinarySearch {
    public static int rank(int key , int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi){
            int mid = lo + (hi + lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args){

        int[] a = new int[]{1,2,4,5,7,8,70,80};
        System.out.println( "aa" );

        System.out.println( rank( 5,a ) );
    }
}
