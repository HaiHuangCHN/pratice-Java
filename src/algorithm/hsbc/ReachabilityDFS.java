package algorithm.hsbc;

public class ReachabilityDFS {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 9, 1},
                {1, 1, 1, 1, 0},
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

    public static boolean isReachable(int[][] grid, int targetR, int targetC) {
        int rows = grid.length;
        int cols = grid[0].length;

        // 初始化访问标记数组
        boolean[][] visited = new boolean[rows][cols];

        // 定义四个方向：右、下、左、上
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // 从起点 (0, 0) 开始进行DFS
        return dfs(grid, visited, directions, 0, 0, targetR, targetC);
    }

    private static boolean dfs(int[][] grid, boolean[][] visited, int[][] directions, int r, int c, int targetR, int targetC) {
        // 检查是否到达目标位置
        if (r == targetR && c == targetC) {
            return true;
        }

        // 标记当前格子为已访问
        visited[r][c] = true;

        // 检查四个方向
        for (int[] dir : directions) {
            int newR = r + dir[0];
            int newC = c + dir[1];

            // 检查新位置是否在范围内、是否可以通行且未被访问过
            if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length
                    && (grid[newR][newC] == 1 || grid[newR][newC] == 9)
                    && !visited[newR][newC]) {
                if (dfs(grid, visited, directions, newR, newC, targetR, targetC)) {
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

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == target) {
                    return new int[]{r, c}; // 返回坐标 (r, c)
                }
            }
        }

        return null; // 如果没有找到目标值，返回 null
    }

}
