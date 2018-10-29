package com.huilegezai.huawei.solution14;

import java.util.Arrays;
import java.util.HashSet;
public class ll {
    /**  * 链接：<a href="https://www.nowcoder.com/questionTerminal/d9385db532594b1789eecf198a99bef3?mutiTagIds=570_578&orderByHotValue=1" target="_blank">https://www.nowcoder.com/questionTerminal/d9385db532594b1789eecf198a99bef3?mutiTagIds=570_578&orderByHotValue=1
     * 来源：牛客网   德州扑克问题 ：一副牌中发五张扑克牌给你：让你判断数字的组成：  有以下几种情况：   1：四条：即四张一样数值的牌（牌均不论花色）2：三条带 一对   3：三条带两张不相同数值的牌   4：两对   5：顺子  包括 10，J，Q，K，A  6：什么都不是   7：只有一对  */
        public  static  final int pk[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        public  static  final int pks[] = {1,1,1,1,1};
        public static int[] fenpei() {
            int select[] = new int[5]; //获取5张牌  for(int i = 0;i<5;i++){ int dex = (int) (Math.random()*pk.length); select[i]=pk[dex];
            return select;
        }
        private static void lj (int [] arg) {
            Arrays.sort(arg);

            if (arg[0] == arg[4]) { //5张牌一样了，重新分配  arg = fenpei();

                HashSet<Integer> hashSet = new HashSet<Integer>();
                for (int i = 0; i < arg.length; i++) {
                    hashSet.add(arg[i]);
                    System.out.print(arg[i] + ",");
                }
                if (arg[0] == arg[3] || arg[1] == arg[4]) {
                    System.out.print("四条：即四张一样数值的牌（牌均不论花色）");
                } else if (arg[0] == arg[2] || arg[1] == arg[3] || arg[2] == arg[4]) {
                    if (hashSet.size() == 2) {
                        System.out.print("三条带 一对");
                    } else {
                        System.out.print("三条带两张不相同数值的牌");
                    }
                } else if (hashSet.size() == 3) {
                    System.out.print("两对");
                } else if (hashSet.size() == 4) {
                    System.out.print("只有一对");
                } else if (arg[0] + 1 == arg[1] && arg[1] + 1 == arg[2] && arg[2] + 1 == arg[3] && arg[3] + 1 == arg[4]) {
                    System.out.print("顺子");
                } else if (arg[1] + 1 == arg[2] && arg[2] + 1 == arg[3] && arg[3] + 1 == arg[4] && arg[4] + 1 == 14) {
                    System.out.print("顺子");
                } else {
                    System.out.print("什么都不是");
                }
                return;
            }
        }
public static void main(String[] args) { lj(pks);
}
}//这里JQKA分别用11,12,13,1表示
