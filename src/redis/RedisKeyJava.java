//package redis;
//
//import java.util.Iterator;
//import java.util.Set;
//import redis.clients.jedis.Jedis;
//
//public class RedisKeyJava {
//	public static void main(String[] args) {
//		// Connect to the redis server
//		Jedis jedis = new Jedis("localhost");
//		System.out.println("Connect successfully");
//
//		// Get records and print out
//		Set<String> keys = jedis.keys("*");
//		Iterator<String> it = keys.iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			System.out.println(key);
//		}
//	}
//}