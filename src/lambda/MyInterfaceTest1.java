package lambda;

public class MyInterfaceTest1 {
	public void test(MyInterface i) {
		System.out.println("The Content of this function is " + i.getName());
	}

	public static void main(String[] args) {
		MyInterfaceTest1 at1 = new MyInterfaceTest1();
		at1.test(new MyInterface() {
			@Override
			public String getName() {
				return "Anonymous Content";
			}
		});
	}
}
