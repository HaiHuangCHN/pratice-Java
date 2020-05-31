package anonymous.clazz;

abstract class MyUpperClass {
	private String name;
	private String password;

	public abstract String getName();

	public String getPassword() {
		return password;
	}

	public MyUpperClass() {
	}

	public MyUpperClass(String name) {
		this.name = name;
	}
}// Abstract instead of Interface

public class AnonymousTest3 {
	public void test(MyUpperClass m) {
		System.out.println("The Content of this Method is " + m.getName());
	}

	public static void main(String[] args) {
		AnonymousTest3 at2 = new AnonymousTest3();
		at2.test(new MyUpperClass("Abstract Class Derived Content") {
			public String getName() {
				return "AnonymousClass Derived Content";
			}
		});
	}
}
