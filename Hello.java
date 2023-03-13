import java.util.*;
import java.time.*;

public class Hello {
    public static void main(String args[]) {
        Year thisYear = Year.now();
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();

        System.out.println(thisYear + "   " + month);
    }

}
