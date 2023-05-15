import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class LAB5PART1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.print("Enter balance: ");
        float balance = input.nextFloat();
        input.close();

        // Output to file
        try {
        	FileWriter writer = new FileWriter("C:\\Users\\Justin\\eclipse-workspace\\LAB5PART1\\src\\customer.txt");
        	writer.write(accountNumber + "-" + customerName + "-" + balance);
        	writer.close();
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
	}

}
