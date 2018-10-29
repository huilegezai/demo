package com.huilegezai;

public class findTwoNum {

    public static int[] findTwo(int[] num,int target){

        int length = num.length;
        if(length < 1)
            return null;

        int i = 0;
        int j = length -1;

        while (i<j){
            if(target > num[i] + num[j]){
                i++;
            }else if(target < num[i] + num[j]){
                j--;
            }else {
                return new int[]{num[i],num[j]};
            }
        }

        return null;
    }

    public static void main(String[] args){
        int[] l = new int[]{1,2,4,6,8};
        System.out.println(findTwo( l,10 )[1]);
        System.out.println(findTwo( l,10 )[0]);
    }
}
