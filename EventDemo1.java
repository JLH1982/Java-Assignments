/*Justin L. Hinkel
 * MidTerm pt. 2
 * 2023SP-COSC-1436-72201
 * Professor Martinez
 */

// Importing Scanner package to use
import java.util.Scanner;

public class EventDemo {
    // Main Method
    public static void main(String[] args) {
        // Declaring variables
        String eventNum;
        int numOfGuests;
        int eventType = 0;
        Event[] events = new Event[3];
        // Method of getting Event Number
        eventNum = getEventNumber();
        // Method of getting the number of guest
        numOfGuests = getGuests();

        // Event one constructor calls Event with default variables
        Event eventOne = new Event();
        // Event two constructor calls Event with arguments for event number number
        // of guest and event type
        Event eventTwo = new Event(eventNum, numOfGuests, eventType);
        // Event three constructor calls Event with arguments for event number number
        // of guest and event type
        Event eventThree = new Event(eventNum, numOfGuests, eventType);

        // Calling methods for Event 2
        System.out.println("Event Two");
        eventTwo.setEventNumber(getEventNumber());
        eventTwo.setGuests(getGuests());
        eventTwo.setEventType(getType());

        // Calling methods for Event 3
        System.out.println("Event Three");
        eventThree.setEventNumber(getEventNumber());
        eventThree.setGuests(getGuests());
        eventThree.setEventType(getType());

        // Calling methods to print event information
        displayEventDetails(eventOne);
        displayEventDetails(eventTwo);
        displayEventDetails(eventThree);
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
    public static void displayEventDetails(Event eventOne) {
        System.out.println("\n*Carly's Catering*");
        System.out.println("Event number is: " + eventOne.getEventNumber());
        System.out.println("Number of guests is: " + eventOne.getNumberOfGuests());
        System.out.println("The event is type " + eventOne.getEventType() + " which is the following type: "
                + eventOne.getEventTypeString());
        System.out.println(eventOne.getPricePerGuest() + ". The total cost is: $" + eventOne.getPrice());
    }
}