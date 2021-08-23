//package redis;
//
//import java.util.List;
//import redis.clients.jedis.Jedis;
//
//public class RedisListJava {
//	public static void main(String[] args) {
//		//  Connect to the local redis server
//		Jedis jedis = new Jedis("localhost");
//		System.out.println("Connect successfully");
//		// Store the records into a list
//		jedis.lpush("site-list", "Runoob");
//		jedis.lpush("site-list", "Google");
//		jedis.lpush("site-list", "Taobao");
//		// Get the records and print out
//		List<String> list = jedis.lrange("site-list", 0, 2);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("List is: " + list.get(i));
//		}
//	}
//}