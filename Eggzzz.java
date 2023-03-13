import java.util.Scanner;

public class Eggzzz {

    public static void main(String[] args) {

        final int DOZEN = 12;

        final double PRIZE_DOZEN = 3.25;

        final double PRICE_EACH = 0.45;

        int eggs;

        int dozens;

        int leftover;

        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("How many eggs would you like? ");

        eggs = input.nextInt();

        dozens = eggs / DOZEN;

        leftover = eggs % DOZEN;

        total = dozens * PRIZE_DOZEN + leftover * PRICE_EACH;

        System.out.printf("you ordered " + eggs + " eggs, which is " + dozens + " dozens at $3.25 per dozen and "
                + leftover + " single eggs at 45 cents each for a total of $%.2f\n", total);

    }

}