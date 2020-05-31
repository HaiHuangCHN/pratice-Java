package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	@Test
	public void testReflect1() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("reflect.Person");// package name + class name
		Constructor constructor = clazz.getConstructor();
		constructor.setAccessible(true);
		Person a = (Person) constructor.newInstance();
		Constructor constructor2 = clazz.getConstructor(String.class);
		Person b = (Person) constructor2.newInstance("arguement");
		Constructor constructor3 = clazz.getConstructor(Integer.class, String.class);
		Person c = (Person) constructor3.newInstance(1, "arguement");
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testReflect2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("reflect.Person");// package name + class name
		clazz.newInstance();// no args's constructor
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testReflect3() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("reflect.Person");

		Class[] classArray = null/* {Integer.class, String.class} */;
		Constructor constructor = clazz.getDeclaredConstructor(classArray);
		
		Person person = (Person) constructor.newInstance();
		Method methodDoSomething = clazz.getMethod("doSomething", null);
		methodDoSomething.invoke(person, null);
		
		Method methodDoSomething2 = clazz.getMethod("doSomething", String.class);
		methodDoSomething2.invoke(person, "arguement");
		
		/*
		 * getDeclaredMethod: it is used for private or protected
		 */
		Method methodDoSomething3 = clazz.getDeclaredMethod("doSomethingPrivate", String.class);
		methodDoSomething3.setAccessible(true);
		methodDoSomething3.invoke(person, "arguement");
		
		Method methodDoSomething4 = clazz.getDeclaredMethod("doSomethingprotected", String.class);
		methodDoSomething4.setAccessible(true);
		methodDoSomething4.invoke(person, "arguement");
		
		
	}

}
