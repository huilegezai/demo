package char1;

/**
 * 值传递
 * 一个方法不能修改一个基本数据类型的参数
 * 可以改变一个对象参数的状态
 * 不能让对象参数引用一个新的对象
 */

/**
 * 类设计技巧
 * 一定要保证数据私有
 * 一定要对数据初始化
 * 不要在类中使用过多的基本类型
 * 不是所有的域都需要独立的域访问器和域更改器
 * 将职责过多的类进行分解
 * 类名和方法名要能够体现它们的职责。
 */
public class Num {
    public int anInt = 10;

    public Num(){
        System.out.println( "aaaaa" );
    }

    public  void change(int an){
        an = anInt*20;
        System.out.println( an );

    }

    public static void main(String[] args){
        Num num = new Num();
        int an = 10;
        num.change(an);

        System.out.println( an );
    }
}
