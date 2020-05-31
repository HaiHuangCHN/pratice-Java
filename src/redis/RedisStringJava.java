package redis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
    public static void main(String[] args) {
        // Connect to the local redis server
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connect successfully");
        // Set String
        jedis.set("setJedis", "set1");
        // Get the records and print out
        System.out.println("String stored in redis is: "+ jedis.get("runoobkey"));
    }
}