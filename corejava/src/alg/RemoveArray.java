package alg;

/**
 *  在一个数组里面移除指定的value，返回一个数组长度，不能新建一个数组。
 */
public class RemoveArray {

    public static int removeArray(int[] array,int value){

        int i = 0;
        int j = 0;
        for(j = 0;j < array.length; j++){
            if(array[j] == value){
                continue;
            }

            array[i] = array[j];
            i++;

        }
        return i;
    }

    public static void main(String[] args){

        int[] ints = new int[]{1,2,3,3,3,4};

        int AfterRemoveArray = removeArray( ints,3 );


        System.out.println( AfterRemoveArray );

    }
}
