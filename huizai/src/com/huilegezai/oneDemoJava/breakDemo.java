package com.huilegezai.oneDemoJava;

/**
 * break与continue的区别
 * break强行推出循环，不执行后面的剩余的语句，
 * continue则停止执行当前的迭代，然后退回循环开始处，开始下一次迭代。
 */
public class breakDemo {
    public static void main(String[] args){
        for(int i = 0 ; i < 10 ; i++){
            if(i == 5){
                break;
            }
            System.out.println( i );
        }
        /**
         0
         1
         2
         3
         4
         */

        for(int i = 0 ; i < 10 ; i++){
            if(i == 5){
                continue;
            }
            System.out.println( i );
        }
        /**
         0
         1
         2
         3
         4
         6
         7
         8
         9
         */
    }
}
