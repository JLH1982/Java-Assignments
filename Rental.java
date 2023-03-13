// Rental.java
public class Rental {

    private int hours;
    private int minutes;
    private String contract;

    Rental(String contract, int number_of_minutes) {
        this.contract = contract;
        hours = number_of_minutes / 60; // get the total number of hours by
                                        // dividing minutes by 60
        minutes = number_of_minutes % 60; // get the remaining minutes by
                                          // moduling minutes by 60

    }

    public double rentalPrice() {
        int m = minutes;
        int h = hours;
        if (m > 40) { // if minutes are greater than 40 minutes,
            h += 1; // count additional one hour
            m = 0; // and make minutes to 0
        }
        return h * 40 + m * 1;
    }

    public String getDuration() {
        return String.format("%02d:%02d", hours, minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getContract() {
        return contract;
    }

}