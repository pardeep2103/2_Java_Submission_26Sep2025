package Method;

public class Q1_MethodTwo {
       public static void main(String[] args) {
	        int x = 10;
	        int y = 20;
	        int z = add(x, y); // Calling the method
	        System.out.println(z);
	 }

      public static int add (int a, int b) {
      int c = a + b;
      return c; 
    }
}
