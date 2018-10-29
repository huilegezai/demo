package com.huilegezai.datacache;


import java.util.Map;

/**
 * Created by Administrator on 2017/9/18.
 */
public class CacheManagerTest {

    public static void main(String [] args)throws Exception{

        String key = "test";

        String value = CacheManager.getData(key, new CacheManager.Load<String>() {
            public String load(){
                return "testValue";
            }
        },2);

        System.out.println("value:"+value);

        Thread.sleep(3 * 1000);

        String value2 = CacheManager.getData(key, new CacheManager.Load<String>() {
            @Override
            public String load() {
                return "什么";
            }
        },3);
        System.out.println("value2:" + value2);
        System.out.println("value3:" + CacheManager.getData(key));

    }


}
