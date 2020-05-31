package anno1;

import java.lang.reflect.Method;

/** UserFactory.java */
public class UserFactory {
	public static User create() {
		User user = new User();

		// Get all the methods in User class (getDeclaredMethods also works here)
		Method[] methods = User.class.getMethods();

		try {
			for (Method method : methods) {
				// If the method is annotated，then pass the value to the user object
				if (method.isAnnotationPresent(Init.class)) {
					Init init = method.getAnnotation(Init.class);
					method.invoke(user, init.value());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return user;
	}
}