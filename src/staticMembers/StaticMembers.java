package staticMembers;

public class StaticMembers {
	public static void main(String[] args) {
		Demo a = new Demo();
		Demo b = new Demo();
	}
}



class Demo {
	private int i = 0;
	private static int j = 0;
	
	public Demo() {
		i++;
		j++;
		System.out.println("i=" + i + ":" + j + "=j");
	}
}
