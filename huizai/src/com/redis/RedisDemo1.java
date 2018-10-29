package com.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class RedisDemo1 {

    public static void main(String[] args){

        Jedis jedis = new Jedis( "127.0.0.1",6379 );

        jedis.connect();

        jedis.set( "key1","value1" );

        System.out.println( jedis.get( "key1" ) );

        jedis.lpush( "key2","valu3");
        jedis.lpush( "key2","valu4");
        jedis.lpush( "key2","valu5");

        System.out.println( jedis.rpop( "key2" ) );
        System.out.println( jedis.rpop( "key2" ) );

        jedis.sadd( "key3","valu6","value7" );
        jedis.sadd( "key3","valu8","value9" );

        Set set = jedis.smembers( "key3" );


        System.out.println( set.toArray()[0] );

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println( iterator);
            iterator.next();
        }

        System.out.println( jedis.smembers( "key3" ) );



        jedis.hset( "key4","name","valu10" );

        System.out.println( jedis.hget( "key4","name" ) );


        jedis.zadd( "key5",3,"vale1" );
        jedis.zadd( "key5",2,"vale2" );


        jedis.close();

        RedisUtil.edisString(jedis);

    }
}
