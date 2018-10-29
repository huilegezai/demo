package com.huilegezai.alg;

public class for9 {

    /**
     * 乘法口诀1
     */
    private static void printfor(){
        for (int i = 1;i <= 9; i++){
            for(int j = 1;j<=i;j++){
                System.out.print( j + "*" + i + "=" + i*j + " " );
            }
            System.out.println();
        }
    }

    /**
     * 乘法口诀2
     */
    private static void printfor1(){

        for(int i = 1,j=1;j <= 9 ; i++){

            System.out.print( j + "*" + i + "=" + i*j + " " );
            if(i == j){
                i = 0;
                j++;
                System.out.println();
            }

        }
    }


    /**
     * 回文1
     * @param num
     * @return
     */
    private static boolean huiwen(int num){
        String str = String.valueOf( num );
        StringBuffer sb = new StringBuffer( str );
        sb.reverse();
        String newStr = sb.toString();
        return str.equals( newStr );
    }

    private static int huiwen1(int num){
       int tem  = 0;
       while (num > 0){
           tem = tem * 10 + num % 10;
           num /= 10;
       }
       return tem;
    }
    public static void main(String[] args){

        System.out.println( huiwen( 123321 ) );
        System.out.println( 123321 == huiwen1( 123321 ) );
    }
}
