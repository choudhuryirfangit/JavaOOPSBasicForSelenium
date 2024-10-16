package Arrays;

public class InterviewMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3 6 9
//		2 5 8
//		3 9 10
		
//		Minimum value
		int a[][]= {{3,6,9},{9,5,8},{3,9,1}};
		int min=a[0][0];
		
		for(int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);

	
//	Max value
	int max=a[0][0];
	
	for(int i=0;i<3;i++) {
		
		for (int j=0;j<3;j++) {
			if(a[i][j]>max) {
				max=a[i][j];
			}
		}
	}
	System.out.println(max);

}}
