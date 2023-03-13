import java.util.Scanner;

public class CountByAnything {
    // Modify the code below
    public static void main(String args[]) {
        final int START = 0;
        final int STOP = 500;
        final int NUMBER_PER_LINE = 10;
        int x = 0;
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = START; i <= STOP; i += count)
        {
            if(i>0)
            {
                System.out.print(i + "  ");
                x++;
                if (x == NUMBER_PER_LINE)
                {
                    x = 0;
                    System.out.println();
                }
            }
        }

    }
}
