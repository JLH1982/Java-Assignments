import java.util.Scanner;

public class InchConversion2 {
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        double inches = scanner.nextDouble();
        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(double inches) {
        // Write your code here
        double feetConversion = inches / 12;
        String inch = String.format("%.0f", inches);
        System.out.printf(inch + " inches is %.2f feet\n", feetConversion);
    }

    public static void convertToYards(double inches) {
        // Write your code here
        double yardConversion = inches / 36;
        String inch = String.format("%.0f", inches);
        String num = String.format("%.3f", yardConversion);
        num = num.substring(0, num.length() - 1);
        System.out.printf(inch + " inches is " + num + " yards");
    }
}