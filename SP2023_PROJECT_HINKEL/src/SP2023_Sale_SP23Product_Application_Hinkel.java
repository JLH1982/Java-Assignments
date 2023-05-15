//SP2023_Sale_SP23Product_Application_Hinkel.java

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SP2023_Sale_SP23Product_Application_Hinkel {

	public static void main(String[] args) {
		// Declare variables
		int menu = 9, transNum = 0, a = 0, b = 0;		
		final String[] productName = { "SP23A", "SP23B", "SP23C" };
		final String[] productSize = { "SMALL ", "MEDIUM", "LARGE " };
		final float[] productPrice = { 11.5f, 12.5f, 13.5f, 21.5f, 22.5f, 23.5f, 31.5f, 32.5f, 33.5f };
		final float TAX_RATE = 0.0825f;
		String type = null;
		int[] orderArray = new int[10];
		
		// Create Object
        SP2023_SP23Product_Hinkel data = new SP2023_SP23Product_Hinkel(orderArray, productName, productSize, productPrice, TAX_RATE);

		// Current Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		// User input for menu
		while (menu != 0) {
			Scanner input = new Scanner(System.in);
			System.out.printf("\nFile: SP2023_SaleProductSP23_Application_Hinkel.cpp\n" +
					"COMPANY MENU - JUSTIN HINKEL\n" +
					"Today: " + formatter.format(date) +
					"\n----------------------------------------------------\n" +
					"1. Sale SP23 Product\n" +
					"2. Print Day Sale Report\n" +
					"3. Print Month Sale Report\n" +
					"4. Print Year Sale Report\n" +
					"0. Exit\n" +
					"Enter a number 1 to 4 to select a task or 0 to exit: ");
			menu = input.nextInt();

			switch (menu) {
				case 0: // Exit
				{
					System.out.println("EXIT");
					break;
				}
				case 1: // Sale SP23 Product
				{
					int model = 9, size = 9;
					transNum += 1;
					while (menu != 0) {
						System.out.printf("\n\nFile: SP2023_SaleProductSP23_Application_Hinkel.cpp\n" +
								"COMPANY MENU - JUSTIN HINKEL\n" +
								"Today: " + formatter.format(date) +
								"\n-------------------------------------------------------\n" +
								"SALE PRODUCT:\n" +
								"1. Model SP23A\n" +
								"2. Model SP23B\n" +
								"3. Model SP23C\n" +
								"0. Exit\n" +
								"Enter 1, 2, 3 to select the product model or 0 to exit: ");
						menu = input.nextInt();
						model = menu;
						
						// Position in orderArray
						if (model == 1)
						{
							a = 1;
						}
						else if (model == 2)
						{
							a = 4;
						}
						else
						{
							a = 7;
						}

						// 0 selected break from menu
						if (menu == 0)
						{
							break;
						}
						
						// Adjusting for productName Array
						model -= 1;				
						
						while (menu != 0) {
							System.out.printf("\n\nFile: SP2023_SaleProductSP23_Application_Hinkel.cpp\n" +
									"COMPANY MENU - JUSTIN HINKEL\n" +
									"Today: " + formatter.format(date) +
									"\n-------------------------------------------------------\n" +
									"PRODUCT MODEL: " + productName[model] + "\n" +
									"1. SMALL\n" +
									"2. MEDIUM\n" +
									"3. LARGE\n" +
									"0. Exit\n" +
									"Enter a number to select a size or 0 to exit: ");
							menu = input.nextInt();
							size = menu;

							// 0 selected break from menu
							if (menu == 0) {
								break;
							}
							
							// Marking position in orderArray
							if (size == 1)
							{
								b = a;
							}
							else if (size == 2)
							{
								b = a + 1;
							}
							else
							{
								b = a + 2;
							}
							
							// Adjusting for productSize Array
							size -= 1;	
							
							System.out.println("\nHow many " + productSize[size] + " " + productName[model]
									+ " would you like to order: ");
							int quantity = input.nextInt();
							orderArray[0] = transNum;
							orderArray[b] = quantity;
							break;
							}							
						}
					data.printReceipt();
					break;
				}
				case 2: // Print Day Sale Report
				{
					type = "DAY  ";
					data.printReport(type);
					break;
				}
				case 3: // Print Month Sale Report
				{
					type = "MONTH ";
					data.printReport(type);
					break;
				}
				case 4: // Print Year Sale Report
				{
					type = "YEAR  ";
					data.printReport(type);
					break;
				}
				default: 
				{
					System.out.println("Invalid Process");
					break;
				}
			}
			
		 }
		
	}
}