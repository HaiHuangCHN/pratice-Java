package anonymous.clazz;

interface MyInterface2 {
	public String getName();
}

public class AnonymousTest2 {
	public static void main(String[] args) {
		AnonymousTest2 at2 = new AnonymousTest2();
		at2.test(new AnonymousTest2Equal());
	}

	public void test(MyInterface2 i) {
		System.out.println("The Content of this function is: " + i.getName());
	}
}

// The following is equal to the above
class AnonymousTest2Equal implements MyInterface2 {
	public String getName() {
		return "Anonymous Class Content";
	}
}