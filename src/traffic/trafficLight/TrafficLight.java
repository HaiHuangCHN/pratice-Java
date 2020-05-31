package traffic.trafficLight;

public class TrafficLight {

	public static void main(String[] args) {

		LightEnum lightEnum = LightEnum.RED;
		//If comment ".getDescription()", will display "RED"
		System.out.println(lightEnum.getId());
		System.out.println(lightEnum.getDescription());
		//If comment ".getDescription()", will display "RED"
		lightEnum.setDescription("Change the description of RED");
		System.out.println(lightEnum.getDescription());
		LightEnum a = LightEnum.valueOf("RED");
		LightEnum[] b = LightEnum.values();
		System.out.println(a);
        System.out.println(b);
		
//		//Accomplish via non-enum way 
//		LightNormal light = new LightNormal();
//		LightOther lightOther = new LightOther();
//		lightOther.setBlack(null);
//		light.setLightOther(lightOther);
//		//If comment ".getRed()", will display com.hai.light.LightNormal@7852e922
//		System.out.println(light.getLightOther().getBlack());
		
	}
}


