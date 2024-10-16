package InterfaceTutorial;

public class trafficRules implements Trafficmandat,TrainTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trafficmandat a=new trafficRules();
		a.goGreen();
		a.stopRed();
		a.waitYellow();
		
		trafficRules tr=new trafficRules();
		tr.schoolAhead();
		
		TrainTraffic tt=new trafficRules();
		tt.trainSymbol();

	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("Green");
		
	}

	@Override
	public void stopRed() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void waitYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
		
	}
	
	public void schoolAhead() {
		System.out.println("School Ahead");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Stop when you see train");
		
	}

}
