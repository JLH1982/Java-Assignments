import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        String name = scanner.nextLine();
        System.out.print("Enter your GPA >> ");
        double gpa = scanner.nextDouble();
        computeDiscount(name, gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        // Write your code here
        System.out.println(name + ", you GPA is " + gpa + ", so your credit is $" + (gpa * 10));
    }

}
