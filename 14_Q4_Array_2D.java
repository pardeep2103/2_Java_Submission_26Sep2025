package Array;

public class Q4_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int A[][] = {
		 {3,4,5,4},
		 {6,4,3,3}
 };
 int B[][] = {
		 {5,6,7,8},
		 {4,8,9,3}
 };
 
 int C[][] = new int[2][4];
 for (int i = 0; i < 2; i++)
 {
	 for (int j = 0; j < 4; j++)
	 {
		 C[i][j] = A[i][j] + B[i][j];
		 System.out.print(C[i][j] + " ");
	 }
	 System.out.println();

 }
	}

}
