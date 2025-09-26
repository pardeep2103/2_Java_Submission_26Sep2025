package Oops_Class_object;

import java.util.Scanner;

public class VowelQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String v1 = sc.nextLine();




int nonVowelCount = 0;

for(int i=0; i<v1.length(); i++) {
	char ch=v1.charAt(i);
	 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		 System.out.print("");
		 System.out.print(ch + " ");
	 } else if(Character.isLetter(ch)) {
		 nonVowelCount++;
	 }
}

System.out.println("\n" + nonVowelCount);
			 
		 	}

}
