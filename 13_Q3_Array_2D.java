package Array;

public class Q3_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {
			{1,2,3},
			{3,4,6}
   };
     int[][] B = {
		   {5,6,9},
		   {7,8,10}
};
      int [][] C = new int[2][3];
      for (int i = 0; i < 2; i++)
      {
          for (int j = 0; j < 3; j++)
          {
        	  C[i][j] = A[i][j] + B[i][j];
        	  System.out.print(C[i][j] + " ");
        	  
          }
          System.out.println();
      }
   

}
}
