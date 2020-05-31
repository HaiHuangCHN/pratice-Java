package praticeInstance;

public class TestHouse {
	
	public static void main(String[] args) {
		House house1 = new House(1, 50);
		House house2 = (House) house1.clone();
		System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
		System.out.println(house1.getWhenBuilt());
		System.out.println(house2.getWhenBuilt());
	}
}
