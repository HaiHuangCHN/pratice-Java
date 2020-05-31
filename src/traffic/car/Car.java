package traffic.car;

import java.util.ArrayList;

public class Car {
	public int color;
	private int speed;
	private Engine engine;
	
	public Car() {
	}
	
	public Car(int color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public Car(int color, int speed, Engine engine) {
		this.color = color;
		this.speed = speed;
		this.engine = engine;
	}
	public int getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	void startup() {
		System.out.println("Start up!");
	}
	
	void run() {
		startup();
		System.out.println("Go! The speed is: " + speed);
	}
}


class Engine {
	public double power;
	
	public Engine(double power) {
		this.power = power;
	}
}