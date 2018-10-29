package alg;

/**
 * Remove Duplicates from Sorted Array
 */
public class RemoveDuplicates {
    /**
     * 【1,1,2,3】---> 【1,2,3】
     * 输出新数组的长度
     * @param ints
     * @return
     */
    public static int remote(int[] ints){
        int length = 1;
        int i = 0;

        for(int j = 1;j<ints.length;j++){
            if(ints[i] == ints[j]){
                continue;
            }
            ++i;
            length++;
            ints[i] = ints[j];
        }

        for(int nn:ints){
            System.out.println( nn );
        }

        return length;
    }

    public static int remote1(int A[],int n){
        if(n == 0) {
            return 0;
        }

        int j = 0;
        int num = 0;

        for (int i = 1;i < n; i++){
            if(A[j] == A[i]){
                num++;
                if(num < 2){
                    A[++j] = A[i];
                }
            }else {
                A[++j] = A[i];
                num = 0;
            }
        }

        return j + 1;
    }


    public static void main(String[] args){
        int[] ints = {2,2,3,5,6,9,9,9,10};
        System.out.println(remote1(ints,ints.length));

    }
}
