package com.huilegezai.oneDemoJava;

import java.util.Date;

class hh{
    private void sprint(){
        System.out.println( "hh" );
        System.out.println( new Date() );
    }
    protected void ssprint(){
        System.out.println( "hh" );
        System.out.println( new Date() );
    }
}
class pp extends hh{
    public void pprint(){
        super.ssprint();
        System.out.println( "pp" );
    }
}
public class publicDemo {
    protected void nprint(){
        System.out.println( "ii" );
    }
    public static void main(String[] args){
        ss ssq = new ss();
        ssq.hprint();
        publicDemo publicDemo = new publicDemo();
        publicDemo.nprint();
        hh hhp = new hh();
//        hhp.sprint();编译出错了

        pp pp = new pp();
        pp.pprint();
    }
}
