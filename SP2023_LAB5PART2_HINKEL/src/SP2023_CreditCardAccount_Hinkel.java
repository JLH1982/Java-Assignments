//SP2023_CreditCardAccount_Hinkel.java

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SP2023_CreditCardAccount_Hinkel {
    private final String cardNumber;
    private final String csvNumber;
    private String name;
    private float availableAmount, currentBalance, statementBalance;
    private final float INTEREST_RATE;
    Scanner input = new Scanner(System.in);

    public SP2023_CreditCardAccount_Hinkel(String name, float CREDIT_LINE, float INTEREST_RATE) {
        this.cardNumber = generateCreditCardNumber();
        this.csvNumber = generateCsvNumber();
        this.availableAmount = CREDIT_LINE;
        this.name = name;
        this.setAvailableAmount(availableAmount);
        this.setCurrentBalance(currentBalance);
        this.statementBalance = 0f;
        this.INTEREST_RATE = INTEREST_RATE;
    }
    
    // Current balance getter and setter
    public void setCurrentBalance(float currentBalance) {
    	this.currentBalance = currentBalance;
    }
    
    public float getCurrentBalance() {
    	return currentBalance;
    }
    
    // Available Amount getter and setter
    public void setAvailableAmount(float availableAmount) {
    	this.availableAmount = availableAmount;

    }
    
    public float getAvailableAmount() {
    	return availableAmount;
    }
    
    // Credit card generator
    public static String generateCreditCardNumber()
    {
    	Random rand = new Random();
    	int value1 = rand.nextInt(9000) + 1000;
    	int value2 = rand.nextInt(9000) + 1000;
    	int value3 = rand.nextInt(9000) + 1000;
    	int value4 = rand.nextInt(9000) + 1000;
    	return String.valueOf(value1) + String.valueOf(value2) +  
               String.valueOf(value3) + String.valueOf(value4);
    }
    
    //CSV number generator
    public static String generateCsvNumber()
    {
    	Random rand = new Random();
    	int value5 = rand.nextInt(900) + 100;
    	return String.valueOf(value5);
    }
    
    // Get current Date
    public String getCurrentDate()
    {  
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        Date date = new Date();  
        return formatter.format(date);
    }

    // Verifying credit card number
    public boolean verifyAccountNumber(String accountNumber) {
        return accountNumber.equals(cardNumber);
    }

    //Verifying CSV number
    public boolean verifycsvNumber(String securityNumber) {
        return securityNumber.equals(csvNumber);
    }

    // Open new account, enter card name
    public void openNewAccount() {
    	System.out.print("Enter customer name: ");
        name = input.nextLine();
    	System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("PROCESS TRANSACTION CREDIT CARD ACCOUNT - JUSTIN HINKEL");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14s\n", "Name: ", name);
        System.out.println("Card Number:                  " + cardNumber);
        System.out.println("CSV:                                       " + csvNumber);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14.2f\n","Available Amount: ", availableAmount);
        System.out.printf("%-32s%14.2f\n","Current Balance: ", currentBalance);
        System.out.printf("%-32s%14.2f\n","Statement Balance: ", statementBalance);
        System.out.printf("Interest Rate:                           %.2f%%\n", INTEREST_RATE);
    }
    
    // Process transaction
    public void processTransaction(float availableAmount, float currentBalance) {
    	System.out.print("Enter transaction amount: ");
        float amount = input.nextFloat();
    	if (amount > availableAmount) {
            System.out.println("Invalid transaction amount");
            return;
        }
        this.availableAmount -= amount;
        this.currentBalance += amount;
        
        System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("PROCESS TRANSACTION CREDIT CARD ACCOUNT - JUSTIN HINKEL");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14s", "Name: ", name);
        System.out.println("\nCard Number:                  " + cardNumber);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14.2f\n","Transaction Amount: ", amount);
        System.out.printf("%-32s%14.2f\n","Current Balance: ", getCurrentBalance());
        System.out.printf("%-32s%14.2f\n","Available Amount: ", getAvailableAmount());
        
    }

    // Reading current balance
    public void readCurrentBalance() {
        System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("CREDIT CARD SERVICE - JUSTIN HINKEL");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%20s", "Name: ", name);
        System.out.println("\nCard Number:                        " + cardNumber);
        System.out.printf("%-32s%20.2f\n", "Current Balance: ", getCurrentBalance());
    }

    // Reading the interest rate
    public void readInterestRate() {
        System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("CREDIT CARD SERVICE - JUSTIN HINKEL");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14s", "Name: ", name);
        System.out.println("\nCard Number:                  " + cardNumber);
        System.out.printf("\nInterest Rate:                           %.2f%%\n", INTEREST_RATE);
    }

    // Printing out a credit card statement
    public void printStatement() {
        System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("CREDIT CARD SERVICE STATEMENT - JUSTIN HINKEL");
        System.out.println("Date:                              " + getCurrentDate());
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%13s\n", "Name: ", name);
        System.out.println("Card Number:                 " + cardNumber);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%13.2f\n","Available Amount: ", getAvailableAmount());
        System.out.printf("%-32s%13.2f\n","Current Balance: ", getCurrentBalance());
    }

    // Payment processing
    public void processPayment(float paymentAmount) {
        System.out.println("Enter the payment amount: ");
        paymentAmount = input.nextFloat();
    	statementBalance = currentBalance;
    	float balanceLeft = (float) statementBalance - paymentAmount;
        float interestAmount = balanceLeft * INTEREST_RATE / 100;
        this.currentBalance = balanceLeft + interestAmount;
        this.availableAmount += paymentAmount;
        
        System.out.println("\nFile: SP2023_CreditCardService_Hinkel.java");
        System.out.println("PROCESS TRANSACTION CREDIT CARD ACCOUNT - JUSTIN HINKEL");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14s", "Name: ", name);
        System.out.println("\nCard Number:                  " + cardNumber);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-32s%14.2f\n","Statement Amount: ", statementBalance);
        System.out.printf("%-32s%14.2f\n","Payment Amount: ", paymentAmount);
        System.out.printf("%-32s%14.2f\n","Interest Amount: ", interestAmount);
        System.out.printf("%-32s%14.2f\n","Current Balance: ", getCurrentBalance());
        System.out.printf("%-32s%14.2f\n","Available Amount: ", getAvailableAmount());
    }
}
