package com.huilegezai.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {
    /**
     *  真实服务对象
     */
    private Object target;

    /**
     * 绑定委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target){
        this.target = target;
        //取得代理对象
        return Proxy.newProxyInstance( target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this );//jdk代理需要提供接口。
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( "#############我是JDK动态代理############" );
        Object result = null;
        //反射方法前调用
        System.err.println( "我准备说Helllo" );
        //执行方法，相当于调用HelloServiceImpl类的sayHello方法
        result=method.invoke( target,args );
        //反射方法后调用
        System.err.println( "我说过Hello了" );
        return result;
    }
}

