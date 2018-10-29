package com.huilegezai.sort;

public class Sort {

    public static void Swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    /**
     * 冒泡排序
     1. 比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
     2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     3. 针对所有的元素重复以上的步骤，除了最后一个。
     4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param A
     * @param n
     */
    public static void BubbleSort(int[] A,int n){

        for(int j = 0;j< n - 1;j++){
            for(int i = 0;i < n-1-j;i++){
                if(A[i] > A[i+1]){
                    Swap( A, i,i+1 );
                }
            }
        }
    }


    /**
     * 鸡尾酒排序，也叫定向冒泡排序，是冒泡排序的一种改进。
     * 此算法与冒泡排序的不同处在于从低到高然后从高到低，而冒泡排序则仅从低到高去比较序列里的每个元素。
     * 他可以得到比冒泡排序稍微好一点的效能。
     * @param A
     * @param n
     */
    public static void CocktailSort(int[] A,int n){

        int left = 0;                            // 初始化边界
        int right = n - 1;
        while (left < right)
        {
            for (int i = left; i < right; i++)   // 前半轮,将最大元素放到后面
            {
                if (A[i] > A[i + 1])
                {
                    Swap(A, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--)   // 后半轮,将最小元素放到前面
            {
                if (A[i - 1] > A[i])
                {
                    Swap(A, i - 1, i);
                }
            }
            left++;
        }

    }

    /**
     * 选择排序
     * 选择排序也是一种简单直观的排序算法。它的工作原理很容易理解：初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     * 注意选择排序与冒泡排序的区别：冒泡排序通过依次交换相邻两个顺序不合法的元素位置，从而将当前最小（大）元素放到合适的位置；
     * 而选择排序每遍历一次都记住了当前最小（大）元素的位置，最后仅需一次交换操作即可将其放到合适的位置。
     * @param A
     * @param n
     */
    public static void SelectionSort(int[] A,int n){

        for(int i = 0;i < n - 1;i++) {     //i为已排序序列的末尾

            int m = i;

            for (int j = i+1; j < n; j++) {  //未排序序列

                if(A[j] < A[m]){ //找出未排序序列中的最小值

                    m = j;

                }

            }

            if (m != i)
            {
                Swap(A, m, i);    // 放到已排序序列的末尾，该操作很有可能把稳定性打乱，所以选择排序是不稳定的排序算法
            }

        }
    }


    /**
     * 插入排序(Insertion Sort)
     * 对于未排序数据(右手抓到的牌)，在已排序序列(左手已经排好序的手牌)中从后向前扫描，找到相应位置并插入。
     *　插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，
     *  需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
     *　具体算法描述如下：
     1. 从第一个元素开始，该元素可以认为已经被排序
     2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     5. 将新元素插入到该位置后
     6. 重复步骤2~5
     * @param A
     * @param n
     */
    public static void InsertionSort(int[] A,int n){

        for (int i = 1; i < n; i++)         // 类似抓扑克牌排序
        {
            int get = A[i];                 // 右手抓到一张扑克牌
            int j = i - 1;                  // 拿在左手上的牌总是排序好的
            while (j >= 0 && A[j] > get)    // 将抓到的牌与手牌从右向左进行比较
            {
                A[j + 1] = A[j];            // 如果该手牌比抓到的牌大，就将其右移
                j--;
            }
            A[j + 1] = get; // 直到该手牌比抓到的牌小(或二者相等)，将抓到的牌插入到该手牌右边(相等元素的相对次序未变，所以插入排序是稳定的)
        }
    }


    /**
     * 插入排序的改进：二分插入排序
     * 对于插入排序，如果比较操作的代价比交换操作大的话，可以采用二分查找法来减少比较操作的次数，我们称为二分插入排序，代码如下：
     * @param A
     * @param n
     */
    public static void  InsertionSortDichotomy(int A[], int n)
    {
        for (int i = 1; i < n; i++)
        {
            int get = A[i];                    // 右手抓到一张扑克牌
            int left = 0;                    // 拿在左手上的牌总是排序好的，所以可以用二分法
            int right = i - 1;                // 手牌左右边界进行初始化
            while (left <= right)            // 采用二分法定位新牌的位置
            {
                int mid = (left + right) / 2;
                if (A[mid] > get)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            for (int j = i - 1; j >= left; j--)    // 将欲插入新牌位置右边的牌整体向右移动一个单位
            {
                A[j + 1] = A[j];
            }
            A[left] = get;                    // 将抓到的牌插入手牌
        }
    }


    /**
     * 希尔排序
     * 希尔排序，也叫递减增量排序，是插入排序的一种更高效的改进版本。希尔排序是不稳定的排序算法。
     　希尔排序是基于插入排序的以下两点性质而提出改进方法的：
     * 插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率
     * 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位
     　　希尔排序通过将比较的全部元素分为几个区域来提升插入排序的性能。
     这样可以让一个元素可以一次性地朝最终位置前进一大步。然后算法再取越来越小的步长进行排序，算法的最后一步就是普通的插入排序，但是到了这步，需排序的数据几乎是已排好的了（此时插入排序较快）。
     　　假设有一个很小的数据在一个已按升序排好序的数组的末端。
     如果用复杂度为O(n^2)的排序（冒泡排序或直接插入排序），可能会进行n次的比较和交换才能将该数据移至正确位置。
     而希尔排序会用较大的步长移动数据，所以小数据只需进行少数比较和交换即可到正确位置。
     * @param A
     * @param n
     */
    public static void ShellSort(int[] A,int n){

        int h = 0;
        while (h <= n)                          // 生成初始增量
        {
            h = 3 * h + 1;
        }
        while (h >= 1)
        {
            for (int i = h; i < n; i++)
            {
                int j = i - h;
                int get = A[i];
                while (j >= 0 && A[j] > get)
                {
                    A[j + h] = A[j];
                    j = j - h;
                }
                A[j + h] = get;
            }
            h = (h - 1) / 3;                    // 递减增量
        }

    }



    public static void main(String[] args){
        int[] A = new int[]{1,3,2,6,7,9,5,10};
        BubbleSort(A,A.length);

        for(int i = 0; i < A.length ; i++){
            System.out.println( A[i] );
        }
    }
}
