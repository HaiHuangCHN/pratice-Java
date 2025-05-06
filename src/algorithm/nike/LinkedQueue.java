package algorithm.nike;

/**
 * ### Question 3: Implement a Queue Using Linked Lists
 * Write a class to implement a queue using linked lists with methods for enqueue, dequeue, and peek.
 */
public class LinkedQueue {
    // 链表节点（静态内部类，避免持有外部类引用）
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node front;  // 队头指针（指向队列的第一个元素）
    private Node rear;   // 队尾指针（指向队列的最后一个元素）

    // 构造方法：初始化空队列
    public LinkedQueue() {
        front = null;
        rear = null;
    }

    /**
     * 入队：将元素添加到队列尾部
     *
     * @param item 要入队的元素
     */
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            // 队列为空时，front 和 rear 都指向新节点
            front = newNode;
            rear = newNode;
        } else {
            // 队列非空时，将新节点添加到队尾，并更新 rear
            rear.next = newNode;
            rear = newNode;
        }
    }

    /**
     * 出队：移除并返回队头元素
     *
     * @return 队头元素
     * @throws IllegalStateException 队列为空时抛出异常
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("队列空，无法出队");
        }
        int item = front.val;  // 保存队头元素值
        front = front.next;    // front 后移（自动断开原队头节点）

        // 特殊情况：出队后队列为空，rear 也置为 null
        if (front == null) {
            rear = null;
        }
        return item;
    }

    /**
     * 查看队头元素（不移除）
     *
     * @return 队头元素
     * @throws IllegalStateException 队列为空时抛出异常
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("队列空，无法查看队头");
        }
        return front.val;
    }

    /**
     * 判断队列是否为空
     *
     * @return 空返回 true，否则返回 false
     */
    public boolean isEmpty() {
        return front == null;  // front 为 null 时，rear 也一定为 null
    }

    // 测试用例
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        // 入队测试
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("入队后队头元素: " + queue.peek());  // 输出: 10

        // 出队测试
        System.out.println("出队元素: " + queue.dequeue());  // 输出: 10
        System.out.println("出队后队头元素: " + queue.peek());  // 输出: 20

        // 队列状态测试
        System.out.println("队列是否为空: " + queue.isEmpty());  // 输出: false

        // 继续出队
        System.out.println("出队元素: " + queue.dequeue());  // 输出: 20
        System.out.println("出队元素: " + queue.dequeue());  // 输出: 30
        System.out.println("队列是否为空: " + queue.isEmpty());  // 输出: true

        // 空队列时出队（应抛出异常）
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("出队异常: " + e.getMessage());  // 输出: 队列空，无法出队
        }
    }
}
    