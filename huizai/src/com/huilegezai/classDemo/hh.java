package com.huilegezai.classDemo;

/**
 * 多态
 */
class shh{
    public void sprint(){
        System.out.println( "shh" );
    }
}
class phh extends shh{
    public void sprint(){
        System.out.println( "phh" );
    }
}
class fhh extends shh{
    public void sprint(){
        System.out.println( "fhh" );
    }
}
public class hh {
    public void print(shh ss){
        ss.sprint();
    }
    public static void main(String[] args){
        shh shh = new shh();
        phh phh = new phh();
        fhh fhh = new fhh();

        hh hh = new hh();
        hh.print( shh );
        hh.print( phh );
        hh.print( fhh );

    }
}
