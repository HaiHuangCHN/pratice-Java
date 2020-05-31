package anonymous.clazz;

interface MyInterface {
	public String getName();
}

public class AnonymousTest1 {
	public static void main(String[] args) {
		AnonymousTest1 at1 = new AnonymousTest1();
		at1.test(new MyInterface() {
			@Override
			public String getName() {
				return "Anonymous Content";
			}
		});
	}

	public void test(MyInterface i) {
		System.out.println("The Content of this function is: " + i.getName());
	}

}

//// The following is equal to the above
//class AnonymousTest1Equal implements MyInterface {
//	public String getName() {
//		return "Anonymous Class Content";
//	}
//}