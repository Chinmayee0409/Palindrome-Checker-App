// Use Case 1 – Application Entry & Welcome Message

import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("===========================================");
        System.out.println("  WELCOME TO COMMUNITY FOOD DONATION APP  ");
        System.out.println("===========================================");
        System.out.println();

        // Asking user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Personalized greeting
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("Thank you for supporting the Community Food Waste Reduction Platform.");
        System.out.println("Together we can reduce food waste and help the needy.");
        System.out.println();

        // Menu Display
        System.out.println("Please select your role:");
        System.out.println("1. Donor");
        System.out.println("2. Volunteer");
        System.out.println("3. Admin");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("You selected Donor.");
                break;
            case 2:
                System.out.println("You selected Volunteer.");
                break;
            case 3:
                System.out.println("You selected Admin.");
                break;
            case 4:
                System.out.println("Thank you for using the application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please restart the application.");
        }

        scanner.close();
    }
}
