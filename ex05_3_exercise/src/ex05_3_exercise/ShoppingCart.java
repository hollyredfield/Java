
package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
       // Iterate through and print out the items from the items array
       for (int num = 0; num < items.length; num++) {
    	   System.out.println("Items purchased " + num + ": " + items[num]);
       }

       //Este es otro ejemplo sin contar la longitud de los archivos. 
        
       for (String item: items) {
    	   System.out.println("Items purchased: " + item);
       }
    }    
}
