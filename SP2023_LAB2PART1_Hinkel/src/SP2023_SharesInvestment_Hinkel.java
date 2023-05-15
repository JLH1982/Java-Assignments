// SP2023_LAB2PART1_HINKEL
import java.util.Scanner;

public class SP2023_SharesInvestment_Hinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investor's name: ");
        String name = input.nextLine();
        System.out.println("Enter the number of shares: ");
        int numShares = input.nextInt();
        System.out.println("Enter the purchase price of a share: ");
        float purchasePrice = input.nextFloat();
        System.out.println("Enter the sale price of a share: ");
        float salePrice = input.nextFloat();

        // Static variables for purchase
        float commission = 0.02F;
        float commissionFormat = commission * 100;
        float purchaseMoney = purchasePrice * numShares;
        float pCommissionFee = purchaseMoney * commission;
        float totalInvested = purchaseMoney + pCommissionFee;

        // Static variables for sale
        float saleMoney = salePrice * numShares;
        float sCommissionFee = saleMoney * commission;
        float returnInvestment = saleMoney - sCommissionFee;

        float profit = returnInvestment - totalInvested;
        input.close();

        // Output heading
        System.out.println("File: SP2023_SharesInvestment_Hinkel.java");
        System.out.println("Spring 2023 semester - JUSTIN HINKEL");
        System.out.println("-----------------------------------------------");

        // Output from lab
        System.out.printf("%1s%27s", "Name of investor: ", name);
        System.out.print("\n");
        System.out.printf("%1s%27d", "Number of shares: ", numShares);
        System.out.print("\n");
        System.out.printf("%1s%28.2f", "Commission Rate: ", commissionFormat);
        System.out.printf("%%");
        System.out.print("\n");
        System.out.printf("%1s%15.2f", "Purchase price of each share: ", purchasePrice);
        System.out.print("\n");
        System.out.printf("%1s%29.2f", "Money Invested: ", totalInvested);
        System.out.print("\n");
        System.out.printf("%1s%33.2f", "Sale Price: ", salePrice);
        System.out.print("\n");
        System.out.printf("%1s%29.2f", "Money Returned: ", returnInvestment);
        System.out.print("\n");
        System.out.printf("-----------------------------------------------\n");
        System.out.printf("%1s%17.2f", "Profit from the Investment: ", profit);
	}

}
