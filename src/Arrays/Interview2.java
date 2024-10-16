package Arrays;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3 6 9
//		9 5 8
//		3 9 1
		
//		Minimum value
		int a[][]= {{3,6,9},{9,5,99},{3,9,1}};
	int min=a[0][0];
	int mincolumn=0;
	int k=0;
	int max=a[0][mincolumn];
	
	for(int i=0;i<3;i++) {
		
		for (int j=0;j<3;j++) {
			if(a[i][j]<min) {
				min=a[i][j];
				mincolumn=j;
			}
		}
	}
	while( k<3) {
		if(a[k][mincolumn]>max) {
			max=a[k][mincolumn];
		}
		k++;
	}
	System.out.println(max);

}
	}
