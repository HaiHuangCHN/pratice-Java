package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU缓存实现，支持O(1)时间复杂度的get和put操作
 * 使用双向链表维护访问顺序，哈希表实现快速查找
 *
 * @author hai.huang.a@outlook.com
 * @date 2025/7/9 00:11
 */
public class LRUCache {
    public static void main(String[] args) {
        // 测试示例
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // 返回 1
        cache.put(3, 3); // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2)); // 返回 -1 (未找到)
        cache.put(4, 4); // 该操作会使得关键字 1 作废
        System.out.println(cache.get(1)); // 返回 -1 (未找到)
        System.out.println(cache.get(3)); // 返回 3
        System.out.println(cache.get(4)); // 返回 4
    }

    /**
     * 双向链表节点类，存储缓存的键值对
     */
    class DLinkedNode {
        int key;       // 缓存键
        int value;     // 缓存值
        DLinkedNode prev; // 前驱节点
        DLinkedNode next; // 后继节点

        public DLinkedNode() {}
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<>(); // 哈希表存储键到节点的映射
    private int size;                // 当前缓存大小
    private int capacity;            // 缓存容量上限
    private DLinkedNode head, tail;  // 双向链表的虚拟头节点和尾节点

    /**
     * 初始化LRU缓存
     * @param capacity 缓存容量
     */
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        // 初始化虚拟头尾节点
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 获取缓存中指定键的值
     * @param key 缓存键
     * @return 存在则返回值，否则返回-1
     */
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1; // 键不存在
        }
        // 键存在，将对应节点移动到链表头部（最近访问）
        moveToHead(node);
        return node.value;
    }

    /**
     * 向缓存中添加或更新键值对
     * @param key 缓存键
     * @param value 缓存值
     */
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 键不存在，创建新节点
            DLinkedNode newNode = new DLinkedNode(key, value);
            // 添加到哈希表
            cache.put(key, newNode);
            // 添加到链表头部（最近访问）
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 超过容量，删除链表尾部节点（最久未访问）
                DLinkedNode removed = removeTail();
                // 从哈希表中移除对应项
                cache.remove(removed.key);
                --size;
            }
        } else {
            // 键已存在，更新值并移到链表头部
            node.value = value;
            moveToHead(node);
        }
    }

    /**
     * 将节点添加到链表头部
     * @param node 待添加的节点
     */
    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    /**
     * 从链表中移除指定节点
     * @param node 待移除的节点
     */
    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    /**
     * 将节点移动到链表头部（最近访问）
     * @param node 待移动的节点
     */
    private void moveToHead(DLinkedNode node) {
        // 先从链表中移除该节点
        removeNode(node);
        // 再添加到链表头部
        addToHead(node);
    }

    /**
     * 移除链表尾部节点（最久未访问）
     * @return 被移除的节点
     */
    private DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}