package algorithm.leetcode.hsbc;

public class ReachabilityDFS {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 9, 1},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };

        int target = 9;

        boolean isReachable = false;

        int[] result = findElement(grid, target);
        if (result != null) {
            isReachable = isReachable(grid, result[0], result[1]);
        }

        System.out.println("Can reach target: " + isReachable);
    }

    public static boolean isReachable(int[][] grid, int targetX, int targetY) {
        int rows = grid.length;
        int cols = grid[0].length;

        // 初始化访问标记数组
        boolean[][] visited = new boolean[rows][cols];

        // 定义四个方向：右、下、左、上
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // 从起点 (0, 0) 开始进行DFS
        return dfs(grid, visited, directions, 0, 0, targetX, targetY);
    }

    private static boolean dfs(int[][] grid, boolean[][] visited, int[][] directions, int x, int y, int targetX, int targetY) {
        // 检查是否到达目标位置
        if (x == targetX && y == targetY) {
            return true;
        }

        // 标记当前格子为已访问
        visited[x][y] = true;

        // 检查四个方向
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            // 检查新位置是否在范围内、是否可以通行且未被访问过
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length
                    && (grid[newX][newY] == 1 || grid[newX][newY] == 9)
                    && !visited[newX][newY]) {
                if (dfs(grid, visited, directions, newX, newY, targetX, targetY)) {
                    return true;
                }
            }
        }

        // 如果四个方向都走不通，返回false
        return false;
    }


    public static int[] findElement(int[][] grid, int target) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == target) {
                    return new int[]{i, j}; // 返回坐标 (i, j)
                }
            }
        }

        return null; // 如果没有找到目标值，返回 null
    }

}
