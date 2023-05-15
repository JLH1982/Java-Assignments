//SP2023_SaleEmployeeInfo_Hinkel.java
//LAB 4 PART 2

import java.text.SimpleDateFormat;
import java.util.Date;

public class SP2023_SaleEmployeeInfo_Hinkel {
	// data members list
    private float saleAmt,commissionRate, bonusRate,
    bonusPay, commissionPay, grossPay, baseSalary = 2300f;
	private String empId, empName;

	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date date1 = new Date();
	
	// Employee Info Constructor
	public SP2023_SaleEmployeeInfo_Hinkel(String id, String name, float sales) {
		empId = id;
		empName = name;
		saleAmt = sales;
	}
	
	// Setting the commission rate.
	public float commissionPay()
	{
		   if (saleAmt >= 15000)
		   {
	 		   commissionRate = .0329f;
	 		   commissionPay = saleAmt * commissionRate;
		   }
		   else if (saleAmt < 5000)
	 	   {
			   commissionRate = 0f;
			   commissionPay = saleAmt * commissionRate;
		   }
		   else
		   {
	 		   commissionRate = .0279f;
	 		   commissionPay = saleAmt * commissionRate;
	  	   }   	   
		   return commissionPay;
	}
		       
	// Setting the bonus rate.
	public float bonusPay()
	{
	    if (saleAmt >= 10000)
	    {
	    	bonusRate = .0199f;
	    	bonusPay = (saleAmt - 10000) * bonusRate;
	    }
	    else
	    {
	    	bonusRate = 0;
	    	bonusPay = saleAmt * bonusRate;
	    }
	    return bonusPay;
	}
	
	// Calculating gross pay.
	public float grossPay()
	{
		return (float) baseSalary + commissionPay + bonusPay;
	}
	
	// method toString to create the output string
    public String toString() {
        return "File: SP2023_SaleEmployeeSalary_Hinkel.java\n" +
                "SP2023 Sale Company             JUSTIN HINEKL\n" +
                "Today                              " +
                String.format("%-32s\n", formatter.format(date1)) + 
                "---------------------------------------------\n"+
                String.format("%-32s%13s\n", "Employee Id:", empId) +
                String.format("%-32s%13s\n", "Employee Name:", empName) + 
                String.format("%-32s%13.2f\n", "Sale Amount:", saleAmt) +
                "---------------------------------------------\n" +
                String.format("%-32s%13.2f\n", "Base Salary:", baseSalary) +
                String.format("%-32s%13.2f\n", "Commission Amount:", commissionPay()) +
                String.format("%-32s%13.2f\n", "Bonus Amount:", bonusPay()) + 
                String.format("%-32s%13.2f\n", "Salary:", grossPay()) +
                "---------------------------------------------\n\n\n";
    }
}
