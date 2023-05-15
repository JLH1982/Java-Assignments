// SP2023_DriverLicenseComputerTest_Hinkel.java
import java.util.Scanner;

public class SP2023_DriverLicenseComputerTest_Hinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variables
		SP2023_DriverCadidate_Hinkel data = new SP2023_DriverCadidate_Hinkel();
		Scanner input = new Scanner(System.in);
		final char keySet[] = { 'A', 'C', 'A', 'A', 'B', 'A', 'A', 'C', 'B', 'A', 'B', 'A', 'D', 'A', 'B',  'A', 'A', 'D', 'A', 'C', 'C', 'B', 'A', 'D', 'A' };
		
		//String firstNam, lastName, ssNumber, address;
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		System.out.print("Enter your last name: ");
		String lastName = input.next();
		System.out.print("Enter your Social Security number: ");
		String ssNumber = input.next();
		System.out.print("Enter your address: ");
		String addr = "";
		addr = input.nextLine();
		addr += input.nextLine();
		String address = addr;
		//input.nextLine();
		data.candidateInfo(firstName, lastName, ssNumber, address, keySet);
		
		// Ready for test
		int x = 0;
		String ready = "";
		do {
			System.out.println("\nAre you ready to take the test (Y or N): ");
			ready = input.next();
			if (ready.equalsIgnoreCase("Y")) {
				break;
			}
		} while (x == 0);		
		data.testQuestions();
		data.gradingTest();
		System.out.print(data.toString());
		input.close();
	}

}
