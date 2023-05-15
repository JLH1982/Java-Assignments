import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class listNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listNumbers = {15, 31, 5, 58, 14, 46, 59, 25, 19, 27};
		int length = listNumbers.length;
		
		// Write to file
		try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\Justin\\eclipse-workspace\\LAB6PART1_3\\src\\listNumbers.txt");
		      for (int i = 0; i < length; i++)
		      {
		    	  myWriter.write("Numbers " + i + " = " + listNumbers[i] +"\n");
		    	  System.out.println("Numbers " + i + " = " + listNumbers[i]);
		      }
		      myWriter.close();
		      System.out.println("\nSuccessfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		}