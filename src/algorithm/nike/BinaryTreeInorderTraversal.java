package algorithm.nike;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * #### Question 3: Trees
 * Write a function to perform an in-order traversal of a binary tree and return the values in a list.
 */
// 定义二叉树节点类
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeInorderTraversal {

    // 递归实现中序遍历
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;  // 终止条件：当前节点为空时返回
        helper(node.left, result);   // 遍历左子树
        result.add(node.val);        // 访问根节点
        helper(node.right, result);  // 遍历右子树
    }

    // 迭代实现中序遍历（使用栈模拟递归）
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // 1. 先走到最左子节点，沿途节点压栈
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // 2. 弹出栈顶节点（当前最左节点），访问其值
            current = stack.pop();
            result.add(current.val);
            // 3. 转向右子树，重复步骤 1
            current = current.right;
        }
        return result;
    }

    // 测试用例
    public static void main(String[] args) {
        /* 构造测试二叉树：
                 1
                  \
                   2
                  /
                 3
            中序遍历结果应为：[1, 3, 2]
        */
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        node2.left = node3;
        TreeNode node1 = new TreeNode(1);
        node1.right = node2;
        TreeNode root = node1;

        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

        // 测试递归方法
        List<Integer> recursiveResult = solution.inorderTraversalRecursive(root);
        System.out.println("递归中序遍历结果: " + recursiveResult);  // 输出: [1, 3, 2]

        // 测试迭代方法
        List<Integer> iterativeResult = solution.inorderTraversalIterative(root);
        System.out.println("迭代中序遍历结果: " + iterativeResult);  // 输出: [1, 3, 2]
    }
}
    