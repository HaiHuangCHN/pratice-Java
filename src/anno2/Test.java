package anno2;

/** Test.java */
public class Test {
	public static void main(String[] args) {
		User user = new User();

		user.setName("Huangggg");
		user.setAge("1");

		System.out.println(UserCheck.check(user));
	}
}