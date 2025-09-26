package Array;

public class Q1_Practice_Array_odd_matric2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a = {
		{21, 15, 32},
		{21, 12, 42},
		{21, 29, 42}
};
int sum  = 0;
System.out.println("Enter odd Number a:");
	
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			if(a[i][j] % 2 != 0) {
				System.out.print(a[i][j] + " ");
				sum += a[i][j];
				
			}
				
		}
}  
	System.out.println("\nSum of  odd Number: " + sum);
	}

}
