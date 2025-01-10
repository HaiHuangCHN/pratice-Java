package algorithm;

/**
 * https://blog.csdn.net/qq_61862008/article/details/127711119
 */
public class QuickSort {

    public static void main(String[] args) {

//        int[] arr = {3, 5, 2, 1, 43, 33, 22, 64, 74, 25, 13, 27, 98, 56, 100, 21, 7};
//        int[] arr = {6, 2, 7, 4, 8, 9, 3, 10};
//        int[] arr = {3, 7, 5, 8, 4, 3};
        int[] arr = {2, 7, 4, 4, 5, 9};
        quickSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void quickSort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    /**
     * 主要方法1：递归过程
     *
     * @param array
     */
    private static void doSort(int[] array, int left, int right) {
        // 递归结束条件
        // 为什么要「>=」而不是「=」？是因为，要考虑可能没有子树的情况，如：「1  2  3  4」，以「1」为基准的话，pivot-1 就越界了
        if (left >= right) {
            return;
        }

        // 基准下标
        int pivot = partition(array, left, right);
        doSort(array, left, pivot - 1);
        doSort(array, pivot + 1, right);
    }

    /**
     * 主要方法2：找基准
     *
     * 备注：
     * 为什么要 right 先动，而不是 left 先动，那是因为我们以 left 为基准，
     * 如果 left 先动，划分好后，你会发现基准左边的值存在比基准大的值，
     * 而我们的策略是基准左边比基准小，基准右边比基准大
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] array, int left, int right) {
        // 记录基准值的下标，循环结束后，相遇值和基准值交换时能找到基准值的下标
        int baseIndex = left;
        // 这是基准
        int base = array[left];
        // 一个大 while包含着两个小while，小while是独立的while，
        while (left < right) {
            // right 下标 = 直到找到比 base 更小的值的下标
            while (left < right && array[right] > base) {
                right--;
            }

            // left 下标 = 直到找到比 base 更大的值的下标
            // 假设输入：int[] arr = {3, 7, 5, 8, 4, 3};
            // 「array[right] >= base + array[left] <= base」，结果正确
            // 「array[right] > base + array[left] <= base」，结果正确
            // 「array[right] >= base + array[left] < base」，结果错误 = 「3 4 5 3 7 8」
            // 所以，array[left] <= base 中的「=」是必不可缺的
            while (left < right && array[left] <= base) {
                left++;
            }
            if (left != right) {
                swap(array, left, right);
            }
        }

        if (left != baseIndex) {
            // 到这里 s 和 e 相遇，把相遇值和基准值交换
            swap(array, left, baseIndex);
        }
        // 返回基准下标
        return left;
    }

    /**
     * 主要方法3：交换
     *
     * @param array
     * @param m
     * @param n
     */
    public static void swap(int[] array, int m, int n) {
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }

}