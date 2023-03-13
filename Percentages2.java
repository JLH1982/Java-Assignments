import java.util.Scanner;

public class Percentages2 {
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double >> ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another double >> ");
        double num2 = scanner.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double x, double y) {
        // Modify the code below
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
