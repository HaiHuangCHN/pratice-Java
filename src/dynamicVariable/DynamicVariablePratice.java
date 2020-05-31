package dynamicVariable;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DynamicVariablePratice {
	
//	public int sum(int...is) {
//		int result = 0;
//		for (int i : is) {
//			result += i;			
//		}
//		return result;
//	}
//	
//	@Test
//	public void testSum() {
//		Assert.assertEquals(5, sum(1,2,3));
//	}
//	
	public List<Object> dynamicVar() {
		List<Object> list1 = Arrays.asList("1","2","3");
		System.out.println(list1);
		return list1;
	}
	
	@Test
	public void TestDynamicVar() {
		String[] list2 = {"1","2","3"};
		System.out.println(list2);
		Assert.assertEquals(list2.toString(), dynamicVar());
	}

}
