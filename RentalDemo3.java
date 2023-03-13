/*Justin L. Hinkel
 * MidTerm pt. 2
 * 2023SP-COSC-1436-72201
 * Professor Martinez
 */

import java.util.Scanner;

public class RentalDemo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int minutes = inputRentalTime(mins);
    }

    public static short inputRentalTime(int mins) {
        System.out.print("Enter for how many minutes you want to rent the equipment: ");
        mins = input.nextInt();
        return mins;
    }

    public static String getContractNumber() {
        String number;
        System.out.print("Enter a Contract Number: ");
        number = input.nextLine();
        return number;
    }

    public static void computePrice(Rental rent) {
        System.out.println("Contract Number:" + rent.getContractNumber() + "\nThe price for " + rent.getRentalHours()
                + " hour/s and " + rent.getRentalMinutes() + " minutes will be: " + rent.getPrice() + "$\n");
    }

    public static void getDumpInput() {
        input.nextLine();
    }

}

// public class RentalDemo {

// Rental rent1 = new Rental() ,rent2 = new Rental();

// rent1.setContractNumber(SammysRentalPriceWithMethods.getContractNumber());
// rent1.setHoursAndMinutes(SammysRentalPriceWithMethods.inputRentalTime());

// rent2.setContractNumber(SammysRentalPriceWithMethods.getContractNumber());
// rent2.setHoursAndMinutes(SammysRentalPriceWithMethods.inputRentalTime());

// SammysRentalPriceWithMethods.computePrice(rent1);
// SammysRentalPriceWithMethods.computePrice(rent2);
// }