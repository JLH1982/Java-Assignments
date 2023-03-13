public class NumbersDemo {
    public static void main(String args[]) {
        // Write your code here
        int num1 = 4, num2 = 33;
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }

    public static void displayTwiceTheNumber(int n) {
        // Write your code here
        final int twiceNum = 2;
        System.out.println(n + " times " + twiceNum + " is " + (n * twiceNum));
    }

    public static void displayNumberPlusFive(int n) {
        // Write your code here
        final int plusNum = 5;
        System.out.println(n + " plus " + plusNum + " is " + (n + plusNum));
    }

    public static void displayNumberSquared(int n) {
        // Write your code here
        System.out.println(n + " squared is " + (n * n));

    }
}
