// SP2023_SP23Product_Hinkel.java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SP2023_SP23Product_Hinkel {
    // Declaring variables
    final String[] productName;
    final String[] productSize;
    final float[] productPrice;
    private int[] orderArray;
    private int[] theArray;
    float TAX_RATE;
    Scanner input = new Scanner(System.in);

    // Passing Array and variables
    public SP2023_SP23Product_Hinkel(int[] orderArray, String[] productName, String[] productSize, float[] productPrice, float TAX_RATE) {
        this.orderArray = orderArray;
        this.productName = productName;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.TAX_RATE = TAX_RATE;
    }

    // Current Date
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatterF = new SimpleDateFormat("ddMMyyy");
    Date date = new Date();

    // Create File for receipt
    public void createFile(int[] orderArray) {
        String dayFileName = "dayfile_" + formatterF.format(new Date()) + ".txt";
        File dayFile = new File(dayFileName);
        try {
            if (dayFile.createNewFile()) {
                System.out.println("File created: " + dayFileName);
            } else {
                System.out.println("File already exist!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // Writing to file
            FileWriter writer = new FileWriter(dayFile);
            for (int k = 0; k < orderArray.length; k++) {
                writer.write(orderArray[k] + "\t" + "");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Print Receipt
    public void printReceipt() {
        createFile(orderArray);
        System.out.println("\n");
        //Output Title
        System.out.printf("File: SP2023_SaleProductSP23_Application_Hinkel.cpp\n" +
                "RECEIPT  -  SP23PRODUCT COMPANY  -  JUSTIN HINKEL\n" +
                "Today:                                 " + formatter.format(date) +
                "\nSales Transaction:                           " + String.format("%04d",
                orderArray[0]) +
                        "\n----------------------------------------------------\n" +
        		"PRODUCT NAME    UNIT PRICE     UNITS        MONEY\n");
        // Output Report Body
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < orderArray.length; i++) {
                if (orderArray[i] > 0) {
                    sb.append(productName[(i - 1) / 3]).append(" ").append(productSize[(i - 1) % 3]).append("         ")
                            .append(String.format("%.2f",productPrice[i - 1])).append(" ")
                            .append(String.format("%9s",orderArray[i])).append(" ").append(String.format("%12.2f",productPrice[i - 1] * orderArray[i])).append("\n");
            }
        }
        // Output Totals
        sb.append("----------------------------------------------------");
        sb.append("\nSubtotal: ").append(String.format("%39.2f", getSubtotal())).append("\n");
        sb.append("Tax: ").append(String.format("%44.2f", getTaxes())).append("\n");
        sb.append("Total: ").append(String.format("%42.2f", getTotal())).append("\n");
        System.out.print(sb);
    }

    // Calculating Sub Total
    public float getSubtotal() {
        int j = 0;
        float subtotal = 0;
        for (int i = 1; i < orderArray.length; i++) {
            subtotal += orderArray[i] * productPrice[j];
            j++;
        }
        return subtotal;
    }

    // Calculating Taxes
    public float getTaxes() {
        return getSubtotal() * TAX_RATE;
    }

    // Calculating Total
    public float getTotal() {
        return getSubtotal() + getTaxes();
    }

    public void printReport(String type) {
        // Asking for file to open and reading from it
        System.out.println("Enter the file path: ");
        String fileName = input.next();
        File file = new File(fileName);
        int[] monthArray = new int[310];
        int[] theArray = new int[10];

        // Check if file exists
        if (file.exists()) {
            try {
                Scanner fileScan = new Scanner(file);
                int m = 0;
                while (fileScan.hasNextInt()) {
                    monthArray[m++] = fileScan.nextInt();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // Pulling and Adding up the products
            int aSm = 0, aMed = 0, aLg = 0, bSm = 0, bMed = 0, bLg = 0, cSm = 0, cMed = 0, cLg = 0;
            // Loop SP23A Small
            for (int i = 1; i <= monthArray.length;) {
                int num = monthArray[i];
                aSm = aSm + num;
                i += 10;
            }
            // Loop SP23A Med
            for (int i = 2; i <= monthArray.length;) {
                int num = monthArray[i];
                aMed = aMed + num;
                i += 10;
            }
            // Loop SP23A Large
            for (int i = 3; i <= monthArray.length;) {
                int num = monthArray[i];
                aLg = aLg + num;
                i += 10;
            }
            // Loop SP23B Small
            for (int i = 4; i <= monthArray.length;) {
                int num = monthArray[i];
                bSm = bSm + num;
                i += 10;
            }
            // Loop SP23B Med
            for (int i = 5; i <= monthArray.length;) {
                int num = monthArray[i];
                bMed = bMed + num;
                i += 10;
            }
            // Loop SP23B Large
            for (int i = 6; i <= monthArray.length;) {
                int num = monthArray[i];
                bLg = bLg + num;
                i += 10;
            } // Loop SP23C Small
            for (int i = 7; i <= monthArray.length;) {
                int num = monthArray[i];
                cSm = cSm + num;
                i += 10;
            }
            // Loop SP23C Med
            for (int i = 8; i <= monthArray.length;) {
                int num = monthArray[i];
                cMed = cMed + num;
                i += 10;
            }
            // Loop SP23C Large
            for (int i = 9; i <= monthArray.length;) {
                int num = monthArray[i];
                cLg = cLg + num;
                i += 10;
            }
            // Assembling theArray from product counts
            theArray[1] = aSm;
            theArray[2] = aMed;
            theArray[3] = aLg;
            theArray[4] = bSm;
            theArray[5] = bMed;
            theArray[6] = bLg;
            theArray[7] = cSm;
            theArray[8] = cMed;
            theArray[9] = cLg;
            
            // Copy theArray over to orderArray
            for (int i = 0; i < orderArray.length; i++)
            {
            	orderArray[i] = theArray[i];
            }

            // Output of Report
            System.out.println("\n");
            // Output Title
            System.out.printf("File: SP2023_SaleProductSP23_Application_Hinkel.cpp\n" +
                    type + "REPORT  - SP23PRODUCT COMPANY - JUSTIN HINKEL\n" +
                    "Today:                                   " + formatter.format(date) +
                    "\n----------------------------------------------------\n" +
                    "PRODUCT NAME    UNIT PRICE     UNITS        MONEY\n");
            // Output Report Body
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < orderArray.length; i++) {
                    if (orderArray[i] > 0) {
                        sb.append(productName[(i - 1) / 3]).append(" ").append(productSize[(i - 1) % 3]).append("         ")
                                .append(String.format("%.2f",productPrice[i - 1])).append(" ")
                                .append(String.format("%9s",orderArray[i])).append(" ").append(String.format("%14.2f",productPrice[i - 1] * orderArray[i])).append("\n");
                }
            }
            // Output Totals
            sb.append("----------------------------------------------------");
            sb.append("\nSubtotal: ").append(String.format("%41.2f", getSubtotal())).append("\n");
            sb.append("Tax: ").append(String.format("%46.2f", getTaxes())).append("\n");
            sb.append("Total: ").append(String.format("%44.2f", getTotal())).append("\n");
            System.out.print(sb);
        } else {
            System.out.println("File does not exist!");
        }
    }
} // EOF
