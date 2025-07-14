package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO Fill in desc
 *
 * @author hai.huang.a@outlook.com
 * @version 0.1.0
 * @date 2025/7/11 16:45
 * @since 0.1.0
 */
public class SynchronizedMapExample {
    public static void main(String[] args) {
        // 创建非线程安全的HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // 将HashMap转换为线程安全的Map
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);

        // 线程安全地操作Map
        synchronizedMap.put("apple", 1);
        synchronizedMap.put("banana", 2);

        // 读取操作也需要同步
        synchronized (synchronizedMap) {
            for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}