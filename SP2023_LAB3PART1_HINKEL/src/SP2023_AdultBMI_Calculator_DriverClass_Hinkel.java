// SP2023_AdultBMI_Calculator_DriverClass_Hinkel

import java.util.Scanner;

public class SP2023_AdultBMI_Calculator_DriverClass_Hinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String n = input.nextLine();
		System.out.println("Enter the height: ");
		int h = input.nextInt();
		System.out.println("Enter the weight: ");
		int w = input.nextInt();
		input.close();
		
		// Constructors
		// Null data
		SP2023_Adult_Hinkel data0 = new SP2023_Adult_Hinkel();
		// User input BMI
		SP2023_Adult_Hinkel data1 = new SP2023_Adult_Hinkel(n, h, w);
		// Outputs
		System.out.println(data0.toString());
		System.out.println(data1.toString());
	}

}
