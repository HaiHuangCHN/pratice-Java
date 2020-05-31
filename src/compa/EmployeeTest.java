package compa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class to test sorting of Employee object on different parameters. each
 * test method will test each Comparator implementation.
 * 
 * {@link https://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html}
 */
public class EmployeeTest {

	@Test
	public void testEmployeeSortingAnonymous() {
		EmployeeAnonymousClazz e1 = new EmployeeAnonymousClazz(1, "A", 1000, 32, new Date(2011, 10, 1));
		EmployeeAnonymousClazz e2 = new EmployeeAnonymousClazz(2, "AB", 1300, 22, new Date(2012, 10, 1));
		EmployeeAnonymousClazz e3 = new EmployeeAnonymousClazz(3, "B", 10, 42, new Date(2010, 11, 3));
		EmployeeAnonymousClazz e4 = new EmployeeAnonymousClazz(4, "CD", 100, 23, new Date(2011, 10, 1));
		EmployeeAnonymousClazz e5 = new EmployeeAnonymousClazz(5, "AAA", 1200, 26, new Date(2011, 10, 1));

		List<EmployeeAnonymousClazz> listOfEmployees = new ArrayList<EmployeeAnonymousClazz>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		listOfEmployees.add(e5);
		System.out.println("Unsorted list: " + listOfEmployees);

		Collections.sort(listOfEmployees); // Sorting by natural order
		assertEquals(e1, listOfEmployees.get(0));
		assertEquals(e5, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeAnonymousClazz.NAME_COMPARATOR);
		assertEquals(e1, listOfEmployees.get(0));
		assertEquals(e4, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeAnonymousClazz.AGE_COMPARATOR);
		assertEquals(e2, listOfEmployees.get(0));
		assertEquals(e3, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeAnonymousClazz.SALARY_COMPARATOR);
		assertEquals(e3, listOfEmployees.get(0));
		assertEquals(e2, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeAnonymousClazz.DOJ_COMPARATOR);
		assertEquals(e3, listOfEmployees.get(0));
		assertEquals(e2, listOfEmployees.get(4));
	}

	@Test
	public void testEmployeeSortingLambda() {
		EmployeeLambda e1 = new EmployeeLambda(1, "A", 1000, 32, new Date(2011, 10, 1));
		EmployeeLambda e2 = new EmployeeLambda(2, "AB", 1300, 22, new Date(2012, 10, 1));
		EmployeeLambda e3 = new EmployeeLambda(3, "B", 10, 42, new Date(2010, 11, 3));
		EmployeeLambda e4 = new EmployeeLambda(4, "CD", 100, 23, new Date(2011, 10, 1));
		EmployeeLambda e5 = new EmployeeLambda(5, "AAA", 1200, 26, new Date(2011, 10, 1));

		List<EmployeeLambda> listOfEmployees = new ArrayList<EmployeeLambda>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		listOfEmployees.add(e5);
		System.out.println("Unsorted list: " + listOfEmployees);

		Collections.sort(listOfEmployees); // Sorting by natural order
		assertEquals(e1, listOfEmployees.get(0));
		assertEquals(e5, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeLambda.NAME_COMPARATOR);
		assertEquals(e1, listOfEmployees.get(0));
		assertEquals(e4, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeLambda.AGE_COMPARATOR);
		assertEquals(e2, listOfEmployees.get(0));
		assertEquals(e3, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeLambda.SALARY_COMPARATOR);
		assertEquals(e3, listOfEmployees.get(0));
		assertEquals(e2, listOfEmployees.get(4));

		Collections.sort(listOfEmployees, EmployeeLambda.DOJ_COMPARATOR);
		assertEquals(e3, listOfEmployees.get(0));
		assertEquals(e2, listOfEmployees.get(4));
	}

}
