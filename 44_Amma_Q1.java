package Palindrome;


import java.util.Scanner;

public class Amma_Q1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string to be reversed: ");
        String original = obj.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Print reversed string
        System.out.println("The reverse of string = " + reversed);

        // Check if it's a palindrome
        if (original.equals(reversed)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is Not Palindrome");
        }
    }
}

