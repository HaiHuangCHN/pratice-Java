package reflect;

public class Person {

	public String familyName = "Huang";
	private String firstName = "Hai";

	public Person() {
		System.out.println("no args's constructor");
	}

	public Person(String name) {
		System.out.println("String args's constructor");
	}

	public Person(Integer ordinal, String name) {
		System.out.println("Integer and String args's constructor");
	}

	public void doSomething() {
		System.out.println("method doSomething() is invoked");
	}

	public void doSomething(String arguement) {
		Integer a = 1;
		double b = 2.2;
		System.out.println("method doSomething(String arguement) with " + arguement + " is invoked");
	}
	
	@SuppressWarnings("unused")
	private void doSomethingPrivate(String arguement) {
		System.out.println("method doSomethingPrivate(String arguement) with " + arguement + " is invoked");
	}

	protected void doSomethingprotected(String arguement) {
		System.out.println("method doSomethingprotected(String arguement) with " + arguement + " is invoked");
	}
}
