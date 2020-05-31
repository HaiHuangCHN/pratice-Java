package recursive;

public class TestRecursive {
	private static int result;
	private static int retry;

	public static void main(String[] args) {
		result = calculate(1, 0);
	}

	private static int calculate(int i, int j) {
		try {
			result = i / j;
		} catch (Exception e) {
			retry++;
			System.out.println(retry);
			if (retry < 3) {
				return calculate(i, j);
			}
		} finally {
			retry = 0;
		}

		return result;
	}
}



//写一个最简单的
//public class Sum {
//    static int sum = 0;
//
//    public static void main(String[] args){
//        System.out.println(sum(4));
//    }
//
//    static int sum(int i){
//        sum = sum + i;
//        i--;
//        if(i>1)
//            sum(i);
//        return sum;
//
//    }
//} 
//public class Sum {
//    static int sum = 0;
//
//    public static void main(String[] args){
//        System.out.println(sum(4));
//    }
//
//    static int sum(int i){
//        sum = sum + i;
//        i--;
//        if(i>1)
//            return sum(i);
//        return sum;
//
//    }
//} 
