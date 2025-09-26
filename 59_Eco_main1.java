package Oops_Class_object;
import java.util.Scanner;
import java.util.*;

class Product {
    String productName;
    String brandName;
    double price;
    int stock;

    Product(String productName, String brandName, double price, int stock) {
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println(productName + " | " + brandName + " | " + price + " | " + stock);
    }
}

public class Eco_main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.println("E-com website Login Page");
        System.out.println("========================");
        System.out.println("1. Admin login");
        System.out.println("2. Customer login");
        System.out.println("3. Exit");

        
        System.out.print("Select Option: ");
        int option = sc.nextInt();

        if (option == 1) {
            sc.nextLine(); // consume newline
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            if (username.equals("Pardeep") && password.equals("Deep@2809")) {
                int choice;
                do {
                    System.out.println("\nAdmin Dashboard");
                    System.out.println("1. Add Product");
                    System.out.println("2. Display Product");
                    System.out.println("3. Exit");
                    System.out.print("Select Option: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            sc.nextLine(); // consume newline
                            System.out.print("Product Name: ");
                            String productName = sc.nextLine();
                            System.out.print("Brand Name: ");
                            String brandName = sc.nextLine();
                            System.out.print("Unit Price: ");
                            double price = sc.nextDouble();
                            System.out.print("Stock: ");
                            int stock = sc.nextInt();
                            productList.add(new Product(productName, brandName, price, stock));
                            System.out.println("Product added successfully!");
                            break;

                        case 2:
                            System.out.println("\nProduct Name | Brand Name | Unit Price | Stock");
                         
                          break;

                        case 3:
                            System.out.println("Exiting Admin Dashboard...");
                            break;
                       

                        default:
                            System.out.println("Invalid option. Try again.");
                    }
                } while (choice != 3);
            } else {
                System.out.println("Invalid admin Details!");
            }
        } else {
            System.out.println("Customer login Failed");
        }

        sc.close();
    }
}

