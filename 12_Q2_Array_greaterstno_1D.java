package Array;

public class Q2_Array_greaterstno_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {5, 2, 9, 1, 7};
int greatest=numbers[0];

// a = 0, 1, 2, 3, 4,
// numbers[a] = 5, 2, 9, 1, 7
// if : f, f, t, f, f
// greatest = 5, remain same, 9, remain same, remain same
for(int a = 0; a<=4; a++) 
{
	if(numbers[a]>greatest)
		greatest = numbers[a];
}
System.out.println(" Greatest Number : " + greatest);

	}

}
