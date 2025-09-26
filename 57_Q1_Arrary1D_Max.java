package Array;

public class Q1_Arrary1D_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// index : 0 to 4
		int[] numbers = {5, 21, 9, 101, 7};
		 
		
	//OR
		int[] n = new int[7]; // 7: index : 0 to 6
		n[0]= 100;
		n[2]= 300;
		n[1]= 66;
		
		int max = numbers[0], min = numbers[0];
		for (int num : numbers) {
		if (num > max) max = num;
		if (num < min) min = num;

	}
	System.out.println("Maximum : " + max);
	System.out.println("Minimum : " + min);


	}
}
