

package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
    	 //Uso las instancias para declarar y crear un nuevo objeto
    	 Item item1 = new Item();
    	 item1.itemID = 1;
    	 item1.desc = "Orange Shirt";
    	 item1.price = 2.83;
    	 item1.quantity = 2;
    	 
    	 Item item2 = new Item();
    	 item1.itemID = 2;
    	 item1.desc = "Green Shirt";
    	 item1.price = 7-9;
    	 item1.quantity = 1;
    	 System.out.println("Item ID: " + item1.itemID);
    	 System.out.println("Item Desc: " + item1.desc);
    	 System.out.println("Item Price: " + item1.price);
    	 System.out.println("Item Quantity: " + item1.quantity);
    	 System.out.println("-----------------------------------------------------------------");
    	 item1 = item2;
    	 System.out.println("Item ID: " + item2.itemID);
    	 System.out.println("Item desc: " + item2.desc);
    	 System.out.println("Item price: " + item2.price);
    	 System.out.println("Item quantity: " + item2.quantity);

	// Print both item descriptions and run code.


	// Assign one item to another and run it again.

     }
 
} 
