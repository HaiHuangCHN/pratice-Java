package algorithm.nike;

import java.util.ArrayList;
import java.util.List;

/**
 * ### Question 1: Implement a Binary Search Tree
 * Write a class to implement a binary search tree (BST) with methods for insertion, search, and in-order traversal.
 */
public class BinarySearchTree {
    private TreeNode root;  // 二叉搜索树的根节点

    // 构造方法：初始化空树
    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * 插入新值到二叉搜索树中
     * @param val 要插入的值
     */
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    // 递归辅助方法：插入新节点
    private TreeNode insertRecursive(TreeNode node, int val) {
        // 若当前节点为空，创建新节点作为插入位置
        if (node == null) {
            return new TreeNode(val);
        }

        // 根据 BST 规则递归插入左/右子树
        if (val < node.val) {
            node.left = insertRecursive(node.left, val);
        } else {
            // 若值大于等于当前节点，插入右子树（允许重复值在右子树）
            node.right = insertRecursive(node.right, val);
        }
        return node;
    }

    /**
     * 搜索二叉搜索树中是否存在指定值
     * @param val 要搜索的值
     * @return 存在返回对应节点，不存在返回 null
     */
    public TreeNode search(int val) {
        return searchRecursive(root, val);
    }

    // 递归辅助方法：搜索节点
    private TreeNode searchRecursive(TreeNode node, int val) {
        // 当前节点为空或找到目标值，返回当前节点
        if (node == null || node.val == val) {
            return node;
        }

        // 根据 BST 规则递归搜索左/右子树
        if (val < node.val) {
            return searchRecursive(node.left, val);
        } else {
            return searchRecursive(node.right, val);
        }
    }

    /**
     * 中序遍历二叉搜索树（结果按升序排列）
     * @return 中序遍历的节点值列表
     */
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    // 递归辅助方法：中序遍历收集结果
    private void inorderRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderRecursive(node.left, result);   // 递归遍历左子树
            result.add(node.val);                  // 访问当前节点
            inorderRecursive(node.right, result);  // 递归遍历右子树
        }
    }

    // 测试用例
    public static void main(String[] args) {
        // 创建二叉搜索树并插入数据
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // 中序遍历验证（应输出升序：20, 30, 40, 50, 60, 70, 80）
        System.out.println("中序遍历结果: " + bst.inorderTraversal());

        // 搜索测试
        TreeNode foundNode = bst.search(40);
        System.out.println("搜索 40: " + (foundNode != null ? "找到节点值: " + foundNode.val : "未找到"));  // 输出: 找到节点值: 40

        TreeNode notFoundNode = bst.search(90);
        System.out.println("搜索 90: " + (notFoundNode != null ? "找到" : "未找到"));  // 输出: 未找到
    }
}