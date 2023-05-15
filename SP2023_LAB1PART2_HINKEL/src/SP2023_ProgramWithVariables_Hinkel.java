// SP2023_ProgramWithVariables_Hinkel
import java.util.Scanner;
public class SP2023_ProgramWithVariables_Hinkel {

	public static void main(String[] args) {
		//add the code here below this line
		//User input for 2 words and 3 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 words and 3 numbers.");
		System.out.println("Enter word1: ");
		String word1 = input.nextLine();
		System.out.println("Enter Word 2: ");
		String word2 = input.nextLine();
		System.out.println("Enter number 1: ");
		float num1 = input.nextFloat();
		System.out.println("Enter number 2: ");
		float num2 = input.nextFloat();
		System.out.println("Enter number 3: ");
		float num3 = input.nextFloat();
		
		// Calculate average of num1, num2, num3
		float avg = (num1 + num2 + num3) / 3;
		
		//Output Program heading
		System.out.println("----------------------------------------------------------------------");
		System.out.println("File SP2023_programWithVariables_Hinkel.java");
		System.out.println("Spring 2023 Semester - JUSTIN HINKEL");
		System.out.println("----------------------------------------------------------------------");
		// Output user input and average
		System.out.println("Word 1: " + word1);
		System.out.println("Word 2: " + word2);
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		System.out.println("Thrid number: " + num3);
		System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avg);
	}

}
