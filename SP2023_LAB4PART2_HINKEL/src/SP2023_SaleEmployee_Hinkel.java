//SP2023_SaleEmployee_Hinkel.java
//LAB 4 PART 2

public class SP2023_SaleEmployee_Hinkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = null, name =  null;
		float sales = 0;
		int cycle = 0;
		
		do {
			// Switch of employee information.
			switch(cycle)
			{
			case 0:
				id = "123456";
				name = "Justin Hinkel";
				sales = 15870.00f;
				break;
			case 1:
				id = "123456";
				name = "Justin Hinkel";
				sales = 12550.00f;
				break;
			case 2:
				id = "123456";
				name = "Justin Hinkel";
				sales = 8750.00f;
				break;
			case 3:
				id = "123456";
				name = "Justin Hinkel";
				sales = 3570.00f;
				break;
			}
			
			// Construct for employee information.
			SP2023_SaleEmployeeInfo_Hinkel data = new SP2023_SaleEmployeeInfo_Hinkel(id, name, sales);
		
			//Output
			System.out.print(data.toString());
			cycle += 1;
		}while (cycle < 4);		
	}
}