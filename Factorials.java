public class Factorials {
    public static void main(String args[]) {
        // Write your code here
        int x = 1, num = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d.\n", x, num);
            if (2147483647 / num < (x + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (x + 1));
                break;
            }
            x++;
            num *= x;
        }
    }
}