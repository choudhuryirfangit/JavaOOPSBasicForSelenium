
public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k=1;
//		for(int i=3;i>=0;i--) {
//			
//			for(int j=1;j<=4-i;j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println(" ");
//		}
		
		int m=1;
		for(int i=3;i>=0;i--) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print(m*3);
				System.out.print("\t");
				m++;
			}
			System.out.println(" ");
		}

	}

}
