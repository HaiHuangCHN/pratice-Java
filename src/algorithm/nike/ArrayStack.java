package algorithm.nike;

/**
 * ### Question 2: Implement a Stack Using Arrays
 * Write a class to implement a stack using arrays with methods for push, pop, and peek.
 */
public class ArrayStack {
    private int[] elements;       // 存储栈元素的数组
    private int top;              // 栈顶指针（初始为 -1，表示空栈）
    private final int capacity;   // 栈的最大容量

    /**
     * 构造方法：初始化栈
     *
     * @param capacity 栈的最大容量
     */
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.top = -1;  // 初始时栈中无元素
    }

    /**
     * 压栈：将元素添加到栈顶
     *
     * @param item 要压入的元素
     * @throws IllegalStateException 栈满时抛出异常
     */
    public void push(int item) {
        if (isFull()) {
            throw new IllegalStateException("栈已满，无法压入元素");
        }
        top++;                 // 栈顶指针上移
        elements[top] = item;  // 元素存入栈顶位置
    }

    /**
     * 弹栈：移除并返回栈顶元素
     *
     * @return 栈顶元素
     * @throws IllegalStateException 栈空时抛出异常
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空，无法弹栈");
        }
        int item = elements[top];  // 取出栈顶元素
        top--;                     // 栈顶指针下移
        return item;
    }

    /**
     * 查看栈顶元素（不移除）
     *
     * @return 栈顶元素
     * @throws IllegalStateException 栈空时抛出异常
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空，无法查看栈顶");
        }
        return elements[top];
    }

    /**
     * 判断栈是否为空
     *
     * @return 空返回 true，否则返回 false
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 判断栈是否已满
     *
     * @return 满返回 true，否则返回 false
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * 获取栈的当前元素数量
     *
     * @return 元素数量
     */
    public int size() {
        return top + 1;
    }

    // 测试用例
    public static void main(String[] args) {
        // 创建容量为 5 的栈
        ArrayStack stack = new ArrayStack(5);

        // 压栈测试
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("压栈后栈顶元素: " + stack.peek());   // 输出: 30

        // 弹栈测试
        System.out.println("弹出元素: " + stack.pop());         // 输出: 30
        System.out.println("弹出后栈顶元素: " + stack.peek());   // 输出: 20

        // 栈状态测试
        System.out.println("栈是否为空: " + stack.isEmpty());   // 输出: false
        System.out.println("栈当前大小: " + stack.size());      // 输出: 2

        // 栈满测试
        stack.push(40);
        stack.push(50);
        System.out.println("栈是否已满: " + stack.isFull());     // 输出: true

        // 尝试压入第 6 个元素（应抛出异常）
        try {
            stack.push(60);
        } catch (IllegalStateException e) {
            System.out.println("压栈异常: " + e.getMessage());  // 输出: 栈已满，无法压入元素
        }
    }
}
    