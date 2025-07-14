package map;

import java.util.*;

public class SynchronizedMapCME {
    public static void main(String[] args) {
        Map<String, Integer> unsafeMap = new HashMap<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(unsafeMap);

        // 添加初始数据
        syncMap.put("a", 1);
        syncMap.put("b", 2);
        syncMap.put("c", 3);
        syncMap.put("d", 3);

        // 线程A遍历Map
        Thread threadA = new Thread(() -> {
            // 错误：没有外部同步
            for (String key : syncMap.keySet()) {
                System.out.println("ThreadA: " + key);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 线程B修改Map
        Thread threadB = new Thread(() -> {
            try {
                // 确保线程A先开始遍历
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            syncMap.put("e", 5); // 在A遍历期间修改Map
        });

        threadA.start();
        threadB.start();
    }
}