import java.util.Scanner;

public class NumbersDemo2 {
    // Modify the code below
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer >> ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter another integer >> ");
        int num2 = scanner.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }

    public static void displayTwiceTheNumber(int n) {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }

    public static void displayNumberPlusFive(int n) {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }

    public static void displayNumberSquared(int n) {
        System.out.println(n + " squared is " + (n * n));
    }
}
