package alg;

/**
 * 输出旋转数组
 * 1    2     3     4
 * 10   11   12     5
 * 9    8    7      6
 */
public class RotateArray {
    public static int[][] rotate(int m, int n){


         int[][] ints = new int[m][n];
         int flag = 1;

         //数组的x，y坐标
         int ii = 0;
         int jj = 0;


         //等于零时返回空数组
         if(m<=0||n<=0){
             return null;
         }

         //等于1时，直接输出数组
         if (m==1){
             for(int i =0;i<n;i++){
                 ints[0][i] = i+1;
             }
             return ints;
         }
         if (n==1){
             for(int i =0;i<m;i++){
                 ints[i][0] = i+1;
             }
             return ints;
         }



         //不等于1时
        // ints[jj][ii] 不等于零时，数组已经被填满
         for (int i = 0;ints[jj][ii]==0;i++){

             //标记填数据的方向，取4的余数，等于0时往右添加，1时往下添加，等于2时往左添加，等于3时往上添加。
             int mm = i % 4;
             //往右
             if(mm== 0){
                 for (;ii<n;ii++){
                     ints[jj][ii] = flag++;
                     if(ii==n-1||ints[jj][ii+1] != 0){
                         jj++;
                         break;//跳出内层的for循环，表示这一次往右的添加已经结束
                     }
                 }
             }

             //往下
             if(mm == 1){
                 for (;jj<m;jj++){
                     ints[jj][ii] = flag++;
                     if(jj==m-1||ints[jj+1][ii] != 0){
                         ii--;
                         break;//跳出内层的for循环，表示这一次往下的添加已经结束
                     }
                 }
             }

             //往左
             if(mm == 2){
                 for (;ii>=0;ii--){
                     ints[jj][ii] = flag++;
                     if(ii==0||ints[jj][ii-1] != 0){
                         jj--;
                         break;//跳出内层的for循环，表示这一次往左的添加已经结束
                     }
                 }
             }

             //往上
             if(mm == 3){
                 for (;jj>=0;jj--){
                     ints[jj][ii] = flag++;
                     if(jj==0||ints[jj-1][ii] != 0){
                         ii++;
                         break;//跳出内层的for循环，表示这一次往上的添加已经结束
                     }
                 }
             }

         }
         return ints;
    }
    public static void main(String[] args){

        int m = 10;
        int n = 10;
        int[][] ints = rotate( m,n );

        for (int i=0;i<m;i++){
            System.out.println();
            for (int j=0 ; j<n;j++){
                System.out.print( "*****"+ ints[i][j] );
            }

        }

    }
}
