// SP2023_BiWeeklySalaryOfEmployee_Hinkel

import java.util.Scanner;

public class SP2023_BiWeeklySalaryOfEmployee_HINKEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float gross = 0;
		// User Input
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter Employee's ID: ");
	    String id = input.nextLine();
	    System.out.println("Enter employee's name: ");
	    String names = input.nextLine();
	    System.out.println("Enter hourly pay rate: ");
	    float pay = input.nextFloat();
	    System.out.println("Enter hours worked over 2 week period: ");
	    int hourW = input.nextInt();
	    input.close();
		
	    // Constructor for user input
		SP2023_Employee_HINKEL data = new SP2023_Employee_HINKEL(id, names, pay, hourW, gross);
		
		// Output
		System.out.print(data.toString());
	}

}
