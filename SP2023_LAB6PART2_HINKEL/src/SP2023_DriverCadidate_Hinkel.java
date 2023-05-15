//SP2023_DriverCadidate_Hinkel.java
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class SP2023_DriverCadidate_Hinkel {
	// Declaring variables
	private String lastName;
	private String firstName;
	private String ssNumber;
	private String address;
    char answerSet[] = new char[25];
    char keySet[] = new char[25];
    int missed[] = new int[25];
    private String results;
    Scanner input = new Scanner(System.in);
    
    // Date
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();

	// Generate drive license number
	public static String generateDriverLicense() {
    	Random rand = new Random();
    	int value1 = rand.nextInt(9000) + 1000;
    	int value2 = rand.nextInt(9000) + 1000;
    	return String.valueOf(value1) + String.valueOf(value2);
    }
	
	// Passing user information input in
	public void candidateInfo(String firstName, String lastName, String ssNumber, String address, char keySet[]) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNumber = ssNumber;
		this.address = address;
		this.keySet = keySet;
	}
	
	// Taking the test
	public void testQuestions() {
		int question = 0, questNum = 1;
		System.out.println("\nDRIVER LICESNSE TESET");
		System.out.println("THERE ARE 25 MULTIPLE CHOICE QUESTIONS");
		System.out.println("YOU HAVE TO GET AT LEAST 20 CORRECT ANSWERS TO GET PASED");
		System.out.println("-------------------------------------------------------\n");
		do {
			System.out.println("Question " + questNum +": ");
			String answer = input.next();
			String answerUp = answer.toUpperCase();
			if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C") || answer.equalsIgnoreCase("D")) {
				char ans = answerUp.charAt(0);
				answerSet[question] = ans;
			}
			else { // Loop for invalid key
				System.out.println("Invalid key - Retype");
				question--;
				questNum--;
			}
			question++;
			questNum++;
		} while (question < 25);
	}
	
	// Grading test
	public String gradingTest() {
		int x = 0, len = 0, correct = 0, incorrect = 0;
		String results;
		do {
			if (keySet[x] == answerSet[x]) {
				correct++;
			} else {
				missed[len] = x + 1;
				incorrect++;
				len++;
			}
		x++;
		} while (x < 25);
		
		// Pass or Fail
		if (incorrect > 5) {
			results = "FAILED";
		} else {
			results = "PASSED";
		}
		return results;
	}
	
	public String toString() {
		String name = (lastName + ", " + firstName);
		String finalSet = Arrays.toString(missed).replace("[", "").replace("]", "");
		String finalList = finalSet.replace("0,", "").replace("0", "");
		
		return "\nSP2023_DriverLicenseComputerTest_Hinkel.java" +
				"\nDRIVER TEST RESULT - JUSTIN HINKEL" +
				"\n---------------------------------------------------\n" +
				String.format("%-32s%18s\n", "Driver's name:", name) +
				String.format("%-32s%18s\n", "SS Number:", ssNumber) +
				String.format("%-22s%10s\n", "Address:", address) +
				String.format("%-32s%18s\n", "Driver's License:", generateDriverLicense()) +
				String.format("%-32s%18s\n", "Test date:", formatter.format(date)) +
				String.format("%-32s%18s\n", "Results:", gradingTest()) +
				String.format("%-32s%41s\n", "Missed Questions: ", finalList);
	}
}