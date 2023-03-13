import java.util.Scanner;

public class Inbetween
{
    public static void main(String args[])
    {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int x, y, X, Y;
        System.out.println("Enter an integer >> ");
        X = input.nextInt();
        System.out.println("Enter another integer >> ");
        Y = input.nextInt();
        if (Y+1 == X || X+1 == Y )
        { 
            System.out.print("There are no integers between " + X + " and " + Y);                   
        }
        else if (Y>X)
        {
            for(x=X+1; x<Y; ++x)
                System.out.print(x+" "); 
        }
        else if (X>Y){
            for(y=Y+1; y<X; ++y)
                System.out.print(y+" ");
        }
    }
}