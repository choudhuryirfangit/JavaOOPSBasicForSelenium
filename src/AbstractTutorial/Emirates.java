package AbstractTutorial;

public class Emirates extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emirates e=new Emirates();
		e.engine();
		e.safety();
		e.color();

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Choose teh color of the aircraft body");
	}

}
