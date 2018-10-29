package com.huilegezai.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectService {
    /**
     * 服务方法
     * @param name --姓名
     */
    public void sayHello(String name){
        System.out.println("Hello" +name);
    }

    /**
     * 测试入口
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //通过反射创建ReflectService对象
        Object service = Class.forName(ReflectService.class.getName()).newInstance();
        //获取服务方法--sayHello
        Method method = service.getClass().getMethod( "sayHello",String.class );
        //反射调用方法
        method.invoke( service,"huizai" );
    }
}
