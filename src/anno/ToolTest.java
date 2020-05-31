package anno;

import java.lang.reflect.Method;

import org.junit.Test;

public class ToolTest {

	@Test
	public void testTool() {
		Class clazz = ForumService.class;
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println(methods.length);

		for (Method method : methods) {
			AnnotationPratice ap = method.getAnnotation(AnnotationPratice.class);
			if (ap != null) {
				if (ap.value()) {
					System.out.println(method.getName() + "(), value() is ture");
				} else if (!ap.value()) {
					System.out.println(method.getName() + "(), value() is false");
				}
			}
		}
	}

}
