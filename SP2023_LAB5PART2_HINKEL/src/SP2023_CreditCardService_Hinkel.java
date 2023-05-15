//SP2023_CreditCardService_Hinkel.java
import java.util.Scanner;

public class SP2023_CreditCardService_Hinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userIn = 9;
		boolean actCheck = false;
		String name = null, csvNumber = null;
		final float CREDIT_LINE = 5000.00f, INTEREST_RATE = 14.29f;
		float availableAmount = CREDIT_LINE, currentBalance = 0f, paymentAmount = 0;
		SP2023_CreditCardAccount_Hinkel account = new SP2023_CreditCardAccount_Hinkel(name, CREDIT_LINE, INTEREST_RATE);
		// MENU
		while (userIn > 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("SP2023_CreditCardService_Hinkel.java\n" +
				"CREDIT CARD PAYMENT PROCESS - JUSTIN HINKEL\n" +
			"-------------------------------------------\n" +
			"1. Open new credit card account\n" +
			"2. Process One transaction\n" +
			"3. Read Current Balance\n" +
			"4. Read Interest Rate\n" +
			"5. Print Statement\n" +
			"6. Payment process\n" +
			"0. Exit\n");
			System.out.print("Enter your choice: ");
			userIn = input.nextInt();
		
			// Switch for user selection
			switch (userIn) {
			case 0: // Exit
				System.out.println("Exit");
				break;
			case 1: // Open new account
                input.nextLine();
				account.openNewAccount();
                actCheck = true;
                break;
            case 2: // Process one transaction
            	if (actCheck == false) {
                    System.out.println("You must select 1 to open credit account first.");
                    break;
                }
                System.out.print("Enter credit card number: ");
                String cardNumber = input.next();
                if (!account.verifyAccountNumber(cardNumber)) {
                    System.out.println("Invalid Credit Card Number\n");
                    break;
                }
                System.out.print("Enter csv number: ");
                csvNumber = input.next();
                if (!account.verifycsvNumber(csvNumber)) {
                    System.out.println("Invalid CSV\n");
                    break;
                }              
                account.processTransaction(availableAmount, currentBalance);
                break;
            case 3: // Read current Balance
                if (actCheck == false) {
                    System.out.println("You must select 1 to open credit account first.");
                    break;
                }
                System.out.print("Enter credit card number: ");
                cardNumber = input.next();
                if (!account.verifyAccountNumber(cardNumber)) {
                    System.out.println("Invalid Credit Card Number");
                    break;
                }
                account.readCurrentBalance();
                break;
            case 4: // Read interest rate
                if (actCheck == false) {
                    System.out.println("You must select 1 to open credit account first.");
                    break;
                }
                System.out.print("Enter credit card number: ");
                cardNumber = input.next();
                if (!account.verifyAccountNumber(cardNumber)) {
                    System.out.println("Invalid Credit Card Number");
                    break;
                }
                account.readInterestRate();
                break;
            case 5: // Print statement
                if (actCheck == false) {
                    System.out.println("You must select 1 to open credit account first.");
                    break;
                }
                System.out.print("Enter credit card number: ");
                cardNumber = input.next();
                if (!account.verifyAccountNumber(cardNumber)) {
                    System.out.println("Invalid Credit Card Number");
                    break;
                }
                account.printStatement();
                break;
            case 6: // Make a payment
            	if (actCheck == false) {
                    System.out.println("You must select 1 to open credit account first.");
                    break;
                }
                System.out.print("Enter credit card number: ");
                cardNumber = input.next();
                if (!account.verifyAccountNumber(cardNumber)) {
                    System.out.println("Invalid Credit Card Number");
                    break;
                }
                account.processPayment(paymentAmount);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
        System.out.println();
    }
  }
}