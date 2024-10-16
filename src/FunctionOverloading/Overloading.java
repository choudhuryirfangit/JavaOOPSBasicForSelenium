package FunctionOverloading;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.getData(2);
		o.getData("Hello");
		o.getData(3, 4);

	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a, int b) {
		System.out.println(a+" "+b);
	}

}
