//package redis;
//
//import redis.clients.jedis.Jedis;
//
//public class RedisJava {
//	public static void main(String[] args) {
//		// Connect to the local redis server
//		Jedis jedis = new Jedis("localhost");
//		System.out.println("Connect successfully");
//		// To check if the service is running
//		System.out.println("Service is running or not? " + jedis.ping());
//	}
//}