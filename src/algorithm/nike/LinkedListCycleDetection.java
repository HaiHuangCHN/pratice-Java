package algorithm.nike;

/**
 * #### Question 2: Linked Lists
 * Implement a function to detect if a linked list has a cycle. If there is a cycle, return the node where the cycle begins. Otherwise, return `None`.
 *
 * @author hai.huang.a@outlook.com
 * @date 2025/5/2 19:30
 */
// 定义链表节点类
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

/**
 * 第一步：使用快慢指针判断链表中是否有环。
 * 慢指针 slow 每次移动一步，快指针 fast 每次移动两步。如果链表中有环，那么快指针最终会追上慢指针，即 slow == fast。
 * 如果快指针到达链表末尾（fast 或 fast.next 为 None），则说明链表中没有环，返回 None。
 *
 * 第二步：如果链表中有环，当快慢指针相遇后，将慢指针重新指向链表头 head，
 * 然后快慢指针以相同的速度（每次移动一步）继续移动，它们再次相遇的节点就是环的起始节点。
 */
public class LinkedListCycleDetection {
    public ListNode detectCycle(ListNode head) {
        // 初始化快慢指针
        ListNode slow = head;
        ListNode fast = head;
        // 第一步：使用快慢指针判断是否有环
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // 如果快慢指针相遇，说明有环
            if (slow == fast) {
                break;
            }
        }
        // 如果没有环，返回 null
        if (fast == null || fast.next == null) {
            return null;
        }
        // 第二步：找到环的起始节点
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // 创建一个有环的链表
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // 创建环

        LinkedListCycleDetection solution = new LinkedListCycleDetection();
        ListNode result = solution.detectCycle(node1);
        if (result != null) {
            System.out.println("The node where the cycle begins: " + result.val);
        } else {
            System.out.println("Node");
        }
    }
}