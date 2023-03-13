import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number >> ");
        int number = scanner.nextInt();
        isEven(number);
    }

    public static boolean isEven(int number) {
        int numb = number % 2;
        boolean evenNum;

        if (numb == 0) {
            evenNum = true;
            System.out.println(number + " is even");
        } else {
            evenNum = false;
            System.out.println(number + " is odd");
        }
        return evenNum;
    }
}