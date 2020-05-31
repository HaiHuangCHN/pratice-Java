package anno2;

import java.lang.reflect.Field;

/** UserCheck.java */
public class UserCheck {
	public static boolean check(User user) {
		if (user == null) {
			System.out.println("Object is null");
			return false;
		}

		// Get all the attributes in User class. (If use getFields here, cannot get the
		// private attributes)
		Field[] fields = User.class.getDeclaredFields();

		for (Field field : fields) {
			// If the attribute is annotated, then do validation
			if (field.isAnnotationPresent(Validate.class)) {
				Validate validate = field.getAnnotation(Validate.class);
				if (field.getName().equals("age")) {
					if (user.getAge() == null) {
						if (validate.isNotNull()) {
							System.out.println("Validation fail: age can not be null");
							return false;
						} else {
							System.out.println("Validation pass");
							continue;
						}
					} else {
						System.out.println("Validation pass");
					}

					if (user.getAge().length() < validate.min()) {
						System.out.println("Validation fail: length is too short");
						return false;
					} else {
						System.out.println("Validation pass");
					}

					if (user.getAge().length() > validate.max()) {
						System.out.println("Validation pass: length is too long");
						return false;
					} else {
						System.out.println("Validation pass");
					}
				}
				if (field.getName().equals("name")) {
					if (user.getName() == null) {
						if (validate.isNotNull()) {
							System.out.println("Validation fail: name can not be null");
							return false;
						} else {
							System.out.println("Validation pass");
							continue;
						}
					} else {
						System.out.println("Validation pass");
					}

					if (user.getName().length() < validate.min()) {
						System.out.println("Validation fail: length is too short");
						return false;
					} else {
						System.out.println("Validation pass");
					}

					if (user.getName().length() > validate.max()) {
						System.out.println("Validation fail: length is too long");
						return false;
					} else {
						System.out.println("Validation pass");
					}
				}
			}
		}
		return true;
	}
}