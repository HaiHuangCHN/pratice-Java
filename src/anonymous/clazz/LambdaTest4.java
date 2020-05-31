package anonymous.clazz;

interface MyInterface3 {
	public String getName();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		LambdaTest4 at1 = new LambdaTest4();
		at1.test(() -> "Anonymous Content");
	}

	public void test(MyInterface3 i) {
		System.out.println("The Content of this function is: " + i.getName());
	}

}
