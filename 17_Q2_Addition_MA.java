package Method;

public class Q2_Addition_MA {

	public static boolean odd(int num) {
		 return num % 2 != 0;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   int[][] a = {
		   {3,15,32},
		   {332,7,8}
   };
   int sum = 0;
   System.out.println("Odd number in a: ");
   for (int i = 0; i < 2; i++) {
	   for (int j = 0; j < 3; j++) {
		   if (odd(a[i][j])) {
				System.out.print(a[i][j] + " ");
				sum += a[i][j];

		   }
		   }   
   }
   
       System.out.println("\nSum Odd numbers: " + sum);

   }
   }

  
	


	
	


