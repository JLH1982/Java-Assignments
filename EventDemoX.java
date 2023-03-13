/*Justin L. Hinkel
 * MidTerm pt. 2
 * 2023SP-COSC-1436-72201
 * Professor Martinez
 */

// Importing Scanner package to use
import java.util.Scanner;

public class EventDemoX {
    // Main Method
    public static void main(String[] args) {
        // Declaring variables
        String eventNum;
        int numOfGuests, guests, eType, eventType, z;
        // Creating array for 3 Event objects
        Event[] events = new Event[3];
        // A FOR loop to cycle through the array just created
        for (z = 0; z < events.length; ++z) {
            // Calling the methods for entering the Event Number
            eventNum = getEventNumber();
            // Calling the method for getting the number of guests
            numOfGuests = getGuests();
            // A constructor to 
            events[z] = new Event(eventNum, numOfGuests);
            events[z].setEventType(getType());
        }
        for (z = 0; z < events.length; ++z) {
            displayEventDetails(events[z]);
        }
    }

    // Method to get the event number
    public static String getEventNumber() {
        String num;
        System.out.print("Enter the event number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextLine();
        return num;
    }

    // Method to get the number of guest
    public static int getGuests() {
        int guests;
        final int maxGuest = 50;
        System.out.print("Enter the amount of guests: ");
        Scanner input = new Scanner(System.in);
        guests = input.nextInt();
        input.nextLine();
        // If guest number is larger than 50 then number is set back to 50
        if (guests > maxGuest) {
            guests = maxGuest;
        }
        // returning the number of guest to Main method
        return guests;
    }

    // FINAL - Get Event Type
    public static int getType() {
        int eType;
        Scanner input = new Scanner(System.in);
        System.out.println("Event types are");
        for (int x = 0; x < Event.EVENT_TYPES.length; ++x) {
            System.out.println("    " + x + " " + Event.EVENT_TYPES[x]);
        }
        System.out.print("Enter event type >> ");
        eType = input.nextInt();
        return eType;
    }

    // Method to print out the results
    public static void displayEventDetails(Event events) {
        System.out.println("\n*Carly's Catering*");
        System.out.println("Event number is: " + events.getEventNumber());
        System.out.println("Number of guests is: " + events.getNumberOfGuests());
        System.out.println("The event is type " + events.getEventType() + " which is the following type: "
                + events.getEventTypeString());
        System.out.println(events.getPricePerGuest() + ". The total cost is: $" + events.getPrice());
    }
}