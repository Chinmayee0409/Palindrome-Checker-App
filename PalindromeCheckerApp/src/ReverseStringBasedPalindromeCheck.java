import java.util.Scanner;

public class ReverseStringBasedPalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Display original and reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Check palindrome (case-sensitive)
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}