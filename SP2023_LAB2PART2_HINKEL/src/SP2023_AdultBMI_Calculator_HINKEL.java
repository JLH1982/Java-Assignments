// SP2023_LAB2PART2_HINKEL
import java.util.Scanner;
public class SP2023_AdultBMI_Calculator_HINKEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter user input and declaring variables
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name = input.nextLine();
        System.out.println("Enter the height in inches: ");
        float height = input.nextFloat();
        System.out.println("Please enter the weight in pounds:");
        float weight = input.nextFloat();
        float BMI = (weight * 703) / (height * height);
        input.close();

        // Output heading
        System.out.println("--------------------------------------------------");
        System.out.println("File: SP2023_AdultBMI_Calculator_Hinkel.java");
        System.out.println("Spring 2023 Semester - JUSTIN HINKEL");
        System.out.println("Standard BMI:            18.5 - 24.9");
        System.out.println("--------------------------------------------------");

        // Lab Output
        System.out.printf("%-5s%37s", "User Name: ", name);
        System.out.print("\n");
        System.out.printf("%-5s%31.0f", "Height (inches): ", height);
        System.out.print("\n");
        System.out.printf("%-5s%31.0f", "Weight (pound):  ", weight);
        System.out.print("\n");
        System.out.println("--------------------------------------------------");
        System.out.printf("%1s%43.2f", "BMI: ", BMI);
	}

}
