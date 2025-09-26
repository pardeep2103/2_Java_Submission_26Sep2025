package Method;

public class Q1_Method_Odd {


public static boolean Even(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int[][] a = {
            {3, 3, 6},
            {7, 8, 3}
        };

        int sum = 0;

        System.out.print("Even numbers in the a: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) { 
                if (Even(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];
                }
            }
        }

        System.out.println("\nSum even numbers: " + sum);
    }



	}


