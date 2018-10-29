package com.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedisUtil {
    /**
     * 这是一个jedis连接池工具类，以及一些jedis基本应用。
     * @author lin
     * @date 2017/10/12
     */

        //Redis服务器IP
        private static String ADDR = "127.0.0.1";

        //Redis的端口号
        private static int PORT = 6379;

        //访问密码
        private static String AUTH = "123456";

        //可用连接实例的最大数目，默认值为8；
        //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
        private static int MAX_ACTIVE = 1024;

        //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值8。
        private static int MAX_IDLE = 200;

        //等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
        private static int MAX_WAIT = 10000;

        private static int TIMEOUT = 10000;

        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
        private static boolean TEST_ON_BORROW = true;

        private static JedisPool jedisPool = null;

        /**
         * 初始化Redis连接池
         */
        static {
            try {
                JedisPoolConfig config = new JedisPoolConfig();

                config.setMaxTotal(MAX_ACTIVE);
                config.setMaxIdle(MAX_IDLE);
                config.setMaxWaitMillis(MAX_WAIT);
                config.setTestOnBorrow(TEST_ON_BORROW);
                jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT);
                //需要认证
                // jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT,AUTH);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * 获取Jedis实例
         * @return
         */
        public synchronized static Jedis getJedis() {
            try {
                if (jedisPool != null) {
                    Jedis resource = jedisPool.getResource();
                    return resource;
                } else {
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /**
         * 释放jedis资源
         * @param jedis
         */
        public static void returnResource(final Jedis jedis) {
            if (jedis != null) {
                jedisPool.returnResource(jedis);
                jedisPool.close();

            }
        }


        public static void main(String[] args) {
            Jedis jedis = RedisUtil.getJedis();
            RedisUtil.edisString(jedis);
            //jedisUtil.edisMap(jedis);
            //jedisUtil.edisList(jedis);
            //jedisUtil.edisSet(jedis);
            //jedisUtil.edisZset(jedis);
        }



        /**
         * 操作字符串
         * @param jedis
         */
        public static void edisString(Jedis jedis) {
            //set-get
            jedis.set("kk","lin");
            String kk = jedis.get("kk");
            System.out.println(kk);
            //追加
            jedis.append("kk","qihong");
            kk = jedis.get("kk");
            System.out.println(kk);
            //删除
            jedis.del("kk");
            kk = jedis.get("kk");
            System.out.println(kk);
            //设置多个键值对
            jedis.mset("name","linqihong","age","20");
            String name = jedis.get("name");
            System.out.println("name：" + name);
            String age = jedis.get("age");
            System.out.println("age：" + age);
            //自增1
            jedis.incr("age");
            age = jedis.get("age");
            System.out.println("age：" + age);
        }



        /**
         * 操作Map
         * @param jedis
         */
        public static void edisMap(Jedis jedis) {
            Map<String,String> map = new HashMap<String,String>();
            map.put("name","linqihong");
            map.put("age","23");
            map.put("phone","15218612811");
            //hmset - hmget
            jedis.hmset("user",map);
            List<String> maplist = jedis.hmget("user","name","age");
            System.out.println(maplist);
            //删除map中某个键值对
            jedis.hdel("user","phone");
            System.out.println("phone:" + jedis.hmget("user","phone"));
            System.out.println(jedis.hexists("user","phone"));
            System.out.println(jedis.hlen("user"));
            System.out.println("keys:"+jedis.hkeys("user"));
            System.out.println("values"+jedis.hvals("user"));
        }



        /**
         * 操作list
         * @param jedis
         */
        public static void edisList(Jedis jedis) {
            //lpush向集合添加元素
            jedis.lpush("javaKJ", "springMVC");
            jedis.lpush("javaKJ","spring");
            jedis.lpush("javaKJ", "mybatis");
            System.out.println(jedis.lrange("javaKJ", 0, -1));
            //del
            //jedis.del("javaKJ");
            //System.out.println(jedis.lrange("javaKJ", 0, -1));
            jedis.rpush("javaKJ", "strus2");
            System.out.println(jedis.lrange("javaKJ", 0, -1));
        }



        /**
         * 操作set
         * @param jedis
         */
        public static void edisSet(Jedis jedis) {
            //sadd
            jedis.sadd("books","java编程思想");
            jedis.sadd("books", "java编程规范");
            jedis.sadd("books","redis入门");
            //获取集合元素
            System.out.println(jedis.smembers("books"));
            //判断某元素是否是集合元素
            System.out.println(jedis.sismember("books", "redis入门"));
        }

        /**
         * 操作zset
         * @param jedis
         */
        public static void edisZset(Jedis jedis) {
            //zadd
            jedis.zadd("zuowei",1, "lin1");
            jedis.zadd("zuowei", 2,"lin2");
            jedis.zadd("zuowei", 3, "lin3");
            //获取数据集
            System.out.println(jedis.zrange("zuowei", 0, 4));

        }
}
