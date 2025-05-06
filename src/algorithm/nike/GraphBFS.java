package algorithm.nike;

import java.util.*;

public class GraphBFS {

    /**
     * 对邻接表表示的图进行 BFS 遍历
     *
     * @param adjList 邻接表（键：节点，值：相邻节点列表）
     * @param start   起始节点
     * @return BFS 遍历顺序的节点值列表
     */
    public List<Integer> bfs(Map<Integer, List<Integer>> adjList, int start) {
        List<Integer> traversalOrder = new ArrayList<>();

        // 边界条件：起始节点不存在于图中
        if (!adjList.containsKey(start)) {
            return traversalOrder;
        }

        // 初始化队列（用于 BFS 逐层遍历）和访问标记集合
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        // 起始节点入队并标记为已访问
        queue.offer(start);
        visited.add(start);

        // 遍历队列直到为空
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();  // 取出队首节点
            traversalOrder.add(currentNode);  // 记录遍历顺序

            // 遍历当前节点的所有相邻节点
            List<Integer> neighbors = adjList.get(currentNode);
            if (neighbors == null) continue;  // 无相邻节点则跳过

            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {  // 仅处理未访问的节点
                    visited.add(neighbor);
                    queue.offer(neighbor);  // 相邻节点入队
                }
            }
        }

        return traversalOrder;
    }

    // 测试用例
    public static void main(String[] args) {
        /* 构造邻接表表示的图：
            0 连接 1、2
            1 连接 2
            2 连接 0、3
            3 连接 3（自环）
            4 无连接（测试孤立节点）
        */
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        adjList.put(0, Arrays.asList(1, 2));
        adjList.put(1, Arrays.asList(2));
        adjList.put(2, Arrays.asList(0, 3));
        adjList.put(3, Arrays.asList(3));  // 自环
        adjList.put(4, new ArrayList<>()); // 孤立节点（邻接列表为空）

        GraphBFS bfs = new GraphBFS();

        // 从节点 0 开始 BFS
        List<Integer> resultFrom0 = bfs.bfs(adjList, 0);
        System.out.println("BFS 从 0 开始: " + resultFrom0);  // 输出: [0, 1, 2, 3]

        // 从节点 4 开始 BFS（孤立节点）
        List<Integer> resultFrom4 = bfs.bfs(adjList, 4);
        System.out.println("BFS 从 4 开始: " + resultFrom4);  // 输出: [4]

        // 从不存在的节点 5 开始 BFS
        List<Integer> resultFrom5 = bfs.bfs(adjList, 5);
        System.out.println("BFS 从 5 开始: " + resultFrom5);  // 输出: []
    }
}
    