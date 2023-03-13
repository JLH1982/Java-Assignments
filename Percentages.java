public class Percentages {
    public static void main(String args[]) {
        // Write your code here
        double num1 = 2.0, num2 = 5.0;
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double x, double y) {
        // Write your code here
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
