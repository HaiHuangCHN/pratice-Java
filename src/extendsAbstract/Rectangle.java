package extendsAbstract;

/*
 * "this": call the current type object
 * "super": call the father type object
 */

public class Rectangle extends Graph {
	
	int width;
	int height;
	
	public Rectangle(){ 
		super();
	}
	
	public Rectangle(String name) {
		super(name);
	}
	
	public Rectangle(int width, int height, String name) {
		this(name);
		System.out.println("My width is:" + width + "my height is :"+ height);
	}
	/*
	 * If override a method, should throw the same exception or sub-type exception to coordinate with that father method
	 * @see pratice.extendsAbstract.Graph#show()
	 */
	public void show() throws Exception {
		super.show();
		System.out.println("at the same time I'm a Rectangle");
	}
	
	public double area() {
		return width * height;
	}
}