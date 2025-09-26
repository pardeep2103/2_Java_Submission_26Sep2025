package Eco;
import java.util.Scanner;

public class Eco_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("E-com website Login Page");
		System.out.println("========================");
		System.out.println("E-com website Login Page");
		System.out.println("1. Admin login");
		System.out.println("2. Customer login");
		System.out.println("Select Options: ");
		int option = sc.nextInt();
	
		if (option == 1) {
			sc.nextLine();
			System.out.print("Username: ");
			String Username = sc.nextLine();
			System.out.print("Password: ");
			String Password = sc.nextLine();
	if(Username == "Admin" && Password =="admin");
	 int choice;
	 do {
		 System.out.println("\n Admin Dashboard");
		 System.out.println("                   ");
		 System.out.println("1. Add Product");
		 System.out.println("2. Display Product");
		 System.out.println("3. Exit");
		 System.out.println("Select Options: ");
		 choice = sc.nextInt();
		 
		 switch (choice) {
		 case 1: 
			 sc.nextLine();
                 System.out.print("Product Name: ");
                 String productName = sc.nextLine();
                 System.out.print("Brand Name: ");
                 String brandName = sc.nextLine();
                 System.out.print("Unit Price: ");
                 double price = sc.nextDouble();
                 System.out.print("Stock: ");
                 int stock = sc.nextInt();
                 System.out.print("Product added sucessfully");
                 break;
                 }

	 }		
	 while (choice != 2);
	 System.out.print("Product Name: ");
     String productName = sc.nextLine();
     System.out.print("Brand Name: ");
     String brandName = sc.nextLine();
     System.out.print("Unit Price: ");
     double price = sc.nextDouble();
     System.out.print("Stock: ");
     int stock = sc.nextInt();
		} 
		else {
            System.out.println("Invalid admin credentials!");
} 

	sc.close();
}
}


