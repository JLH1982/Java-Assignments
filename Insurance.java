import java.util.Scanner;

class Insurance {
    public static void main(String args[]) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year >> ");
        int curr = scanner.nextInt();
        System.out.print("Enter the birth year >> ");
        int birth = scanner.nextInt();
        int premium = calculatePremium(curr, birth);
    }

    public static int calculatePremium(int curr, int birth) {
        // Write your code here
        int age = (curr - birth) / 10;
        int premium = (age + 15) * 20;
        System.out.println("The premium is $" + premium);
        return premium;
    }
}
