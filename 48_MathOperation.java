package Polymorphism;

public class MathOperation {
	int add(int a, int b) {
		System.out.println("add method with 2 input parameters");
		return a + b;
	}
	int add(int a, int b, int c, int d) {
		System.out.println("add method with 4 input parameters");
		return a + b + c + d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MathOperation obj = new MathOperation();
     System.out.println(obj.add(5, 12)); 
     System.out.println(obj.add(5, 12, 14, 16)); 

    	 
     }
     
	}


