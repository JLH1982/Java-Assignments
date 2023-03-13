/*Justin L. Hinkel
 * MidTerm pt. 2
 * 2023SP-COSC-1436-72201
 * Professor Martinez
 */

class Event {
    // Declaring variables
    // Static variables for price per guest and max number of guest
    public static int PRICE_PER_GUEST = 35;
    // Event number variable
    private String eventNumber;
    // Number of guests
    private int guests;
    // Price for total guest
    private double price;
    // Price per guest
    private double pricePerGuest;
    // The selection of event type
    private int eventType;
    // Array for types of events
    public final static String[] EVENT_TYPES = { "wedding", "baptism", "birthday", "corporate", "other" };

    // Default constructor that passes default variables
    public Event() {
        this("Aooo", 0);
    }

    // Constructor accepting the event number and number of guest
    public Event(String eventNum, int guestAmount) {
        // Calling the eventNum method
        setEventNumber(eventNum);
        // Calling the guestAmount method
        setGuests(guestAmount);
    }

    // Set Method for Event Number
    public void setEventNumber(String eventNum) {
        eventNumber = eventNum;
    }

    // Set Method for Guest and computing the price of the event
    public void setGuests(int guestAmount) {
        guests = guestAmount;
        pricePerGuest = PRICE_PER_GUEST;
        price = guests * pricePerGuest;
    }

    // Getting the Event number
    public String getEventNumber() {
        return eventNumber;
    }

    // Getting the Number of guests
    public int getNumberOfGuests() {
        return guests;
    }

    // Getting the Price per guest
    public double getPricePerGuest() {
        return pricePerGuest;
    }

    // Getting the total price of the event
    public double getPrice() {
        return price;
    }

    // Setting the event type
    public void setEventType(int ev) {
        if (ev < EVENT_TYPES.length)
            eventType = ev;
        else
            eventType = 4; // If larger then selection then equals "other" type
    }

    // Getting the event type
    public int getEventType() {
        return eventType;
    }

    // Getting the Event Types array for selection of type
    public String getEventTypeString() {
        return EVENT_TYPES[eventType];
    }
}