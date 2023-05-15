import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LAB5PART1_4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

        // Read from file
        try {
        	FileReader reader = new FileReader("C:\\Users\\Justin\\eclipse-workspace\\LAB5PART1_4B\\src\\data.txt");
        	int data = reader.read();
        	while (data != -1) {
        		System.out.print((char)data);
        		data = reader.read();
        	}
        	System.out.println("End of the file data.txt");
        	reader.close();
        }
        catch (FileNotFoundException e) {
        	e.printStackTrace();
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
	}
}