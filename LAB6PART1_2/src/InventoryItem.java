//DATA TYPE CLASS
public class InventoryItem {
	     String itemID;
	     float unitItemPrice;
	     int itemCount;

	     //constructor
	     public InventoryItem()
	     {
	          itemID = null;
	          unitItemPrice = 0.0f;
	          itemCount = 0;
	     }
	     //accessor method
	     public String getItemID()
	     {
	          return itemID;
	     }
	     public float getUnitItemPrice()
	     {
	          return unitItemPrice;
	     }

	     public int getItemCount()
	     {
	          return itemCount;
	     }
	     //method  mutator
	     public void setItemID(String id)
	     {
	          itemID = id;
	     }
	     public void setUnitItemPrice(float newItemPrice)
	     {
	          unitItemPrice = newItemPrice;
	     } 
	     //method mutator setUnitItemPrice      
	     public void setUnitItemCount(int count)
	     {
	          int unitItemCount = count;
	     } 
	     public String toString()
	      { 
	    	   return "ITEM: " + itemID + " - " + unitItemPrice + " -" + itemCount;
	      }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	     }