package extendsAbstract;


abstract class Graph {
	
	String name;
	
	public Graph(){}
	
	public Graph(String name) {
		this.name = name;
	}
	
	public void show() throws Exception {
		System.out.println("I'm a graph");
	}
	
	public abstract double area();
}