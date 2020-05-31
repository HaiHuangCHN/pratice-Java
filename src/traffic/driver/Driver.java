package traffic.driver;

import traffic.car.Car;

public class Driver {  
    
    public static void main(String[] args) {
        Car car = new Car();
        car.color = 0xffffff;  //change the value of color of car object
        int color = car.color; //call the value of color of car object, and assign the value to other variable 
        System.out.println(car.color); //color as argument and print out
    }
    
}
