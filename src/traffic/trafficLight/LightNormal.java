package traffic.trafficLight;

public class LightNormal {
	public String Red;
	public String Green;
	public String Yellow;
	public LightOther lightOther;
	public String getRed() {
		return Red;
	}
	public void setRed(String red) {
		Red = red;
	}
	public String getGreen() {
		return Green;
	}
	public void setGreen(String green) {
		Green = green;
	}
	public String getYellow() {
		return Yellow;
	}
	public void setYellow(String yellow) {
		Yellow = yellow;
	}
	public LightOther getLightOther() {
		return lightOther;
	}
	public void setLightOther(LightOther lightOther) {
		this.lightOther = lightOther;
	}
	
}
