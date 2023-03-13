/*Justin L. Hinkel
 * MidTerm pt. 2
 * 2023SP-COSC-1436-72201
 * Professor Martinez
 */

public class Rental {
    public final static int Min_In_Hour = 60;
    public final static int hourPrice = 40;

    private String contractNumber;
    private double rentalHours;
    private double rentalMinutes;
    private double price;

    public void setHoursAndMinutes(double minutes) {
        this.rentalHours = (minutes / Min_In_Hour);
        this.rentalMinutes = (minutes - (this.rentalHours * Min_In_Hour));
        this.price = (this.rentalHours * hourPrice + this.rentalMinutes);
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public short getRentalHours() {
        return rentalHours;
    }

    public void setRentalHours(short rentalHours) {
        this.rentalHours = rentalHours;
    }

    public short getRentalMinutes() {
        return rentalMinutes;
    }

    public void setRentalMinutes(short rentalMinutes) {
        this.rentalMinutes = rentalMinutes;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

}