package Oops_Class_object;
import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Customer_login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Customer login
        System.out.println("Customer Login Page");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals("Deep") && password.equals("1234")) {
            System.out.println("\nLogin Successful!");

            // Products
            Product p1 = new Product("Samsung Mobile", 14999.00);
            Product p2 = new Product("Iphone", 75000.00);

            int choice;
            int qty1 = 0, qty2 = 0;

            while (true) {
                System.out.println("\nProduct Menu:");
                System.out.println("1. Samsung Mobile - 14999.00");
                System.out.println("2. Iphone - 75000.00");
                System.out.println("3. Checkout");

                System.out.print("Select the product: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter quantity: ");
                        qty1 += sc.nextInt();
                        break;
                    case 2:
                        System.out.print("Enter quantity: ");
                        qty2 += sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Checkout...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                if (choice == 3) break;
            }

            // Bill
            double total1 = p1.price * qty1;
            double total2 = p2.price * qty2;
            double total = total1 + total2;

            System.out.println("\nItems Purchased:");
            int count = 1;
            if (qty1 > 0) {
                System.out.println(count + ". " + p1.name + "  " + p1.price + "  " + qty1 + "  " + total1);
                count++;
            }
            if (qty2 > 0) {
                System.out.println(count + ". " + p2.name + "  " + p2.price + "  " + qty2 + "  " + total2);
                count++;
            }

            // Discount
            double discount = 0;
            if (total > 25000) {
                discount = total * 0.10;
                total -= discount;
                System.out.println("Discount Applied: -" + discount);
            }

            // Tax
            double tax = total * 0.18;
            total += tax;
            System.out.println("Tax (18%): +" + tax);
            System.out.println("Grand Total: " + total);

        } else {
            System.out.println("Login Failed!");
        }

        sc.close();
    }
}
