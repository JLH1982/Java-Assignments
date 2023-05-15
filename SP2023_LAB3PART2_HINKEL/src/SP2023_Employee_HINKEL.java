// SP2023_Employee_Hinkel

public class SP2023_Employee_HINKEL {

	    // data members list
		private int hours;
	    private float fedIncomeTaxRate = .0874f, ssTaxRate = .0620f, medTaxRate = .0145f, salaryRate, grossPay;
	    private String empId, name;

	    // Employee Info Constructor
	    public SP2023_Employee_HINKEL(String id, String names, float pay, int hourW, float gross) {
	       empId = id;
	       name = names;
	       salaryRate = pay;
	       hours = hourW;
	       grossPay = salaryRate * hours;
	    }

	    // Tax Calculations methods
	    public float fedIncomeTax() {
	    	return (float) grossPay * fedIncomeTaxRate;
	    }
	    public float ssTax() {
	    	return (float) grossPay * ssTaxRate;
	    }
	    public float medTax() {
	    	return (float) grossPay * medTaxRate;
	    }
	    public float netPay(float fedIncomeTax, float ssTax, float medTax) {
	    	return (float) grossPay - (fedIncomeTax + ssTax + medTax);
	    }

	    // Method toString to create the output string
	    public String toString() {
	        return "-------------------------------------------------\n" +
	                "File: SP2023_BiWeeklySalaryOfEmployee_Hinkel.java \n" +
	                "Spring 2023 Semester - JUSTIN HINEKL\n" +
	                "-------------------------------------------------\n" +
	                String.format("%-39s%10s\n", "Employee ID:", empId) + //1234567
	                String.format("%-39s%10s\n", "Sale Employee Name:", name) + //Mary Lane
	                String.format("%-39s%10.2f\n", "Hour Salary:", salaryRate) + //18.75
	                String.format("%-36s%13d\n", "Number of work hours in 2 weeks:", hours) + // 80 hours
	                "-------------------------------------------------\n" +
	                String.format("%-39s%10.2f\n", "Gross Pay:", grossPay) + //1500
	                String.format("%-36s%13.2f\n", "Federal Income Tax (8.745%):", fedIncomeTax()) + // 131.00
	                String.format("%-36s%13.2f\n", "Social Security Tax (6.20%):", ssTax()) + // 93.00
	                String.format("%-36s%13.2f\n", "Medicare Tax (1.45%):", medTax()) + // 21.75
	                "--------------------------------------------------\n" +
	                String.format("%-36s%13.2f\n", "Net Pay:", netPay(fedIncomeTax(), ssTax(), medTax())); // 1254.15
	    }
}