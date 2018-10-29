package char1;

/**
 * Java程序设计平台
 * 简单性
 * 面向对象
 * 网路技能
 * 健壮性
 * 安全性
 * 体系结构中立
 * 可移植性
 * 解释型
 * 高性能
 * 多性能
 * 动态性
 *
 */

/**
 * 一个简单的Java应用程序
 * 注释
 * 字符串
 * 数据类型
 * 变量
 * 运算符
 * 输入输出
 * 控制流
 * 大数值
 * 数组
 *
 */

/**
 * 类名是以大写字母开头的名词
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * java有8种基本类型
 * 其中4种整型，2种浮点类型，一种char和一种boolean
 * int      4字节
 * short    2字节
 * long     8字节
 * byte     1字节
 */



public class ClassName {
    public static final double CM_PER_INCH = 2.54;//final表示这个变量只能被赋值一次，一旦被赋值就不能更改了，常量名使用全大写。

    public static void main(String[] args){

        System.out.println( "print" );
        String[] greeting = new String[3];
        greeting[0] = "12";
        greeting[1] = "13";
        greeting[2] = "14";
        for (String m:greeting){
            System.out.println( m );
        }

        int a;
        short b;
        long c;
        byte d;
        float e;
        double f;
        char g;
        boolean l;

        System.out.println( CM_PER_INCH );
        int swithint = 14;
        //case类型可以是char，byte，short，或者int
        //java se7开始，字符串也可以是string
        switch (swithint){
            case 11:
                System.out.println( swithint+1 );
                break;

            case 12:
                System.out.println( swithint+2 );

             default:
                 System.out.println( swithint );

        }
        //case 是string的情况
        String sstring = "hhh";
        switch (sstring){
            case "hh":
                System.out.println( sstring );
                break;
            case "gg":
                System.out.println( sstring+"jj" );
                break;
            default:
                System.out.println( "byebye" );
        }


        List<String> list = new ArrayList<String>();
        list.add( "a" );
        list.add( "b" );
        for(String mm:list){
            System.out.println( mm );
        }

        System.out.println( list.get( 0 ) );
    }
}
