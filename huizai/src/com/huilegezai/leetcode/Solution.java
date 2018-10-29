package com.huilegezai.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * leetcode解题
 */
public class Solution {


    /**
     * 在数组a中移除指定的k，并返回数组的长度
     * @param a
     * @param k
     * @return
     */
    private static int removeElem(int[] a,int k){

        int length = a.length;
        int j = 0;

        for(int i=0;i<length;i++){
            if(a[i] == k){
                continue;
            }

            a[j] = a[i];
            j++;
        }

        return j;

    }

    private static int removeElement(int[] nums, int val) {
        int tail = 0;
        for (int i = 0, len = nums.length; i < len; ++i) {
            if (nums[i] != val) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }

    /**
     * 删除排序好了的重复数组元素
     * @param a
     * @return
     */
    private static int removeDuplicates(int[] a){

        if(a.length == 0){
            return 0;
        }

        int j = 0;

        for(int i = 1; i < a.length;i++){
            if(a[j] != a[i]){
                a[++j] = a[i];
            }
        }

        return j+1;

    }


    /**旋转整型数
     * 123-->321
     * 120-->21
     * -132--> -231
     * @param x
     * @return
     */
    private static int reverse(int x){

        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
    /**
     * 删除排序好了的重复数组元素, 允许元素重复两次
     * @param a
     * @return
     */
    private static int removeDuplicates1(int[] a){

        if(a.length == 0){
            return 0;
        }

        int j = 0;

        int num = 0;

        for(int i = 2; i < a.length;i++){
            if(a[j] != a[i]){
                a[++j] = a[i];
                num = 0;
            }else {
                num++;
                if(num < 2){
                    a[++j] = a[i];
                }
            }
        }

        return j+1;

    }


    /**
     * 求数组两个元素相加等于target
     * @param a
     * @param target
     * @return
     */
    private static int[] plusone(int[] a, int target){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < a.length; i++){

            if(map.containsKey( a[i] )){

                return new int[]{map.get(a[i]),i};
            }

            map.put(target - a[i],i );
        }

        return null;

    }

    /**解法1：
     * 题意是判断一个有符号整型数是否是回文，也就是逆序过来的整数和原整数相同，
     * 首先负数肯定不是，接下来我们分析一下最普通的解法，就是直接算出他的回文数，然后和给定值比较即可。
     * @param knum
     * @return
     */
    private static boolean isPalindrome(int knum){

        if(knum<0)
            return false;

        int temk = knum, reverse = 0;

        while (temk > 0){
            reverse = reverse*10 + temk % 10;
            temk = temk / 10;
        }

        return reverse == knum;

    }

    /**解法2：
     * 好好思考下是否需要计算整个长度，比如 1234321，其实不然，我们只需要计算一半的长度即可，就是在计算过程中的那个逆序数比不断除 10 的数大就结束计算即可，但是这也带来了另一个问题，
     * 比如 10 的倍数的数 10010，它也会返回 `true`，所以我们需要对 10 的倍数的数再加个判断即可，代码如下所示。
     * @param knum
     * @return
     */
    private static boolean isPalindrome2(int knum){

        if(knum<0 || (knum!=0&& knum % 10 ==0))
            return false;

        int temk = 0;

        while (knum > temk){
            temk = temk * 10 + knum % 10;
            knum /= 10;
        }

        return temk == knum || temk / 10 == knum;

    }


    /**
     *
     * 题意是罗马数字转整型数，范围从 1 到 3999，查看下百度百科的罗马数字介绍如下：
     * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
     * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
     * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9。
     * 那么我们可以利用 map 来完成罗马数字的 7 个数字符号：I、V、X、L、C、D、M 和整数的映射关系，然后根据上面的解释来模拟完成即可。
     * @param s
     * @return
     */


    private static int romanToInt(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();

        int sum  = map.get(s.charAt(len-1));

        for(int i = len-2;i >= 0; --i){
            if( map.get( s.charAt( i ) ) < map.get( s.charAt( i+1 ) )){
                sum -= map.get( s.charAt( i ) );
            }else {
                sum += map.get( s.charAt( i ) );
            }
        }

        return sum;
    }


    /**
     * 题意是让你从字符串数组中找出公共前缀，我的想法是找出最短的那个字符串的长度 `minLen`，然后在 `0...minLen` 的范围比较所有字符串，
     * 如果比较到有不同的字符，那么直接返回当前索引长度的字符串即可，否则最后返回最短的字符串即可。
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        int minLen = 0x7fffffff;
        for (String str : strs) minLen = Math.min(minLen, str.length()); //找出最短的字符串长度
        for (int j = 0; j < minLen; ++j)
            for (int i = 1; i < len; ++i)
                if (strs[0].charAt(j) != strs[i].charAt(j))
                    return strs[0].substring(0, j);
        return strs[0].substring(0, minLen);
    }

    /**
     * Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

     * @param s
     * @return
     */

    private static boolean isValid(String s){

        char[] stack = new char[s.length() + 1];
        int top = 1;
        for(char c : s.toCharArray()){
            if(c == '(' || c =='{' || c == '['){
                stack[top++] = c;
            }else if(c == ')' && stack[--top] != '('){
                return false;
            }else if(c == '}' && stack[--top] != '{'){
                return false;
            }else if(c == ']' && stack[--top] != '['){
                return false;
            }
        }

        return top == 1;
    }




    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * 题意是用一个新链表来合并两个已排序的链表，那我们只需要从头开始比较已排序的两个链表，新链表指针每次指向值小的节点，依次比较下去，
     * 最后，当其中一个链表到达了末尾，我们只需要把新链表指针指向另一个没有到末尾的链表此时的指针即可。
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode mergeTwoLists(ListNode l1,ListNode l2){

        ListNode resultNode = new ListNode( 1 );

        ListNode listNode = resultNode;

        while (l1 != null && l2 != null ){
            if(l1.val < l2.val){
                resultNode.next = l1;
                l1 = l1.next;
            }else {
                resultNode.next = l2;
                l2 = l2.next;
            }

            resultNode = resultNode.next;
        }

        resultNode.next = l1 != null? l1:l2;
        return listNode.next;
    }


    /**
     * 题意是从主串中找到子串的索引，如果找不到则返回-1，当子串长度大于主串，直接返回-1，然后我们只需要遍历比较即可。
     * @param s1
     * @param s2
     * @return
     */
    private static int strStr(String s1,String s2){
        int len1 = s1.length(),len2 = s2.length();

        if(len1 < len2)
            return -1;

        for(int i = 0; i <= len1-len2 ; i++){
            for (int j = 0; ; j++){

                if(j == len2) return i;
                if(s1.charAt( i+j ) != s2.charAt( j )) break;

            }
        }

        return -1;
    }


    /**
     * 题意是让你从一个没有重复元素的已排序数组中找到插入位置的索引。因为数组已排序，所以我们可以想到二分查找法，
     * 因为查找到的条件是找到第一个等于或者大于 `target` 的元素的位置，所以二分法略作变动即可。
     * @param num
     * @param target
     * @return
     */
    private static int searchInsert(int[] num , int target){

        int li = 0;
        int lo = num.length-1;
        int mid = (li + lo) / 2;
        while (li <= lo){
            if(num[mid] < target){
                li = mid + 1;
            }else if(num[mid] >= target){
                lo = mid - 1;
            }

            mid = (li + lo) >> 1;

        }

        return li;
    }


    /**
     * 题意是求数组中子数组的最大和，这种最优问题一般第一时间想到的就是动态规划，我们可以这样想，
     * 当部分序列和大于零的话就一直加下一个元素即可，并和当前最大值进行比较，如果出现部分序列小于零的情况，
     * 那肯定就是从当前元素算起。其转移方程就是 `dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);`，由于我们不需要保留 dp 状态，
     * 故可以优化空间复杂度为 1，即 `dp = nums[i] + (dp > 0 ? dp : 0);`。
     * @param nums
     * @return
     */
    private static int maxSubArray(int[] nums){

        int len = nums.length, dp = nums[0], max = dp;
        for (int i = 1; i < len; ++i) {
            dp = nums[i] + (dp > 0 ? dp : 0);
            if (dp > max) max = dp;
        }
        return max;
    }


    /**
     * 题意是让你从一个只包含大小字母和空格字符的字符串中得到最后一个单词的长度，很简单，我们倒序遍历，
     * 先得到最后一个非空格字符的索引，然后再得到它前面的空格字符索引，两者相减即可。
     * 当然，我们使用 API 来完成这件事更加方便，只需一行代码 `return s.trim().length() - s.trim().lastIndexOf(" ") - 1;`，
     * 但我相信作者出这道题的目的肯定不是考你 API 的使用，所以我们还是用自己的思路来实现。

     * @param s
     * @return
     */
    private static int lengthOfLastWord(String s){
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') p--;
        int end = p;
        while (p >= 0 && s.charAt(p) != ' ') p--;
        return end - p;
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args){

        int[] a = new int[]{1,2,3,3,5,5,6,6,6,6,6,6};

        System.out.println( removeElem(a,6));
        System.out.println( removeDuplicates(a));
        System.out.println( removeDuplicates1(a));

        int[] nem =  new int[]{2,7,10,23};


        int[] len = plusone( a,9 );

        System.out.println( Arrays.toString(plusone(nem,9)) );


        System.out.println( reverse( 123 ) );
        System.out.println( isPalindrome2( 1232 ) );


        System.out.println( romanToInt("IIV") );
        System.out.println( longestCommonPrefix( new String[] {"str1","str2","str3"}));
        System.out.println( isValid("{}{}}[]()"));



        ListNode listNode1 = new ListNode(6);
        ListNode temNode1 = listNode1;
        listNode1.next = new ListNode( 8 );
        listNode1 = listNode1.next;
        listNode1.next = new ListNode( 10 );



        ListNode listNode2 = new ListNode(7);
        ListNode temNode2 = listNode2;
        listNode2.next = new ListNode( 9 );
        listNode2 = listNode2.next;
        listNode2.next = new ListNode( 15 );

        ListNode resultNode = mergeTwoLists( temNode1,temNode2 );

        while (resultNode.next != null){
            System.out.println( resultNode.val );
            resultNode = resultNode.next;
        }



        System.out.println( strStr( "lllstar","llt" ) );

        System.out.println( searchInsert( new int[]{1,3,6,10},10 ) );


        System.out.println( maxSubArray( new int[]{1,3,6,10}) );


        System.out.println( lengthOfLastWord("jjsjsjs ksdjdkddkak ji") );

    }

}
