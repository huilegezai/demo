package com.huilegezai.reflect;

public class HelloServiceMain {
    public static void main(String[] args){
        HelloServiceProxy HelloHandler = new HelloServiceProxy();
        HelloService proxy = (HelloService) HelloHandler.bind( new HelloServiceImpl() );
        proxy.sayHello( "huizai" );

    }
}
