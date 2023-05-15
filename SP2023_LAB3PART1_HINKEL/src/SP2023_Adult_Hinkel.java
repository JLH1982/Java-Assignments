// SP2023_Adult_Hinkel

public class SP2023_Adult_Hinkel {

    // data members list
    private String name;
    private int height;
    private int weight;

    // no-argument constructor
    public SP2023_Adult_Hinkel() {
        name = "";
        height = 0;
        weight = 0;
    }

    // parameterized constructor
    public SP2023_Adult_Hinkel(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    // method to calculate BMI rate
    public float BMI() {
        return (float) weight * 703 / (height * height);
    }

    // method toString to create the output string
    public String toString() {
        return "----------------------------------------------\n" +
                "File: SP2023_Adult_BMI_DriverClass_Hinkel.java \n" +
                "Spring 2023 Semester - JUSTIN HINEKL\n" +
                String.format("%-27s%12s\n", "Standard BMI:", "18.5 - 24.9") +
                "----------------------------------------------\n"+
                String.format("%-32s%10s\n", "Name:", name) + // Mary Lane
                String.format("%-32s%13d\n", "Height:", height) + // 6 feet 3 inches
                String.format("%-32s%13d\n", "Weight:", weight) + // 175 pounds
                "---------------------------------------------\n" +
                String.format("%-32s%13.2f\n", "BMI:", BMI());// 21.87
    }
}