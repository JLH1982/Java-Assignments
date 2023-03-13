import java.util.*;

public class EvenEntryLoop {
    public static void main(String args[]) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between:   999 to exit.");
        int num = input.nextInt();
        while (num != 999) 
        {
            if (num % 2 == 0) 
            {
                System.out.println("Good job!");
                System.out.println("Please enter a number: ");
                num = input.nextInt();
            }
            else
            {
            System.out.println(num + " is not an even number");
            System.out.println("Please enter a number: ");
            num = input.nextInt();
            }
        }
    }
}