package Inheritance;

public class ChildClassDemo extends ParentClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo a=new ChildClassDemo();
		a.engine();
		a.color();
		a.brakes();
		a.audioSystem();
		a.transmission();
		

	}
	
	public void engine() {
		System.out.println("2000cc turbo diesel");
	}
	
	public void color() {
		System.out.println(color);
	}
	public void audioSystem() {
		System.out.println("New Boss speakers inside");
	}

}
