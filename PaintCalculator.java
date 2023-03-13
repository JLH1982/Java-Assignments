import java.util.Scanner;

public class PaintCalculator {
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length >> ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width >> ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height >> ");
        double height = scanner.nextDouble();
        double area = computeArea(length, width, height);
        double price = computeGallons(area);

        System.out.println("The price to paint the room is $" + price);
    }

    public static double computeArea(double length, double width, double height) {
        // Write your code here
        double area = width * height;
        return area;
    }

    public static double computeGallons(double area) {
        // Write your code here
        double gallonsNeeded = area / 100;
        System.out.println("You will need " + gallonsNeeded + " gallons");
        double price = gallonsNeeded * 32;
        return price;
    }
}
