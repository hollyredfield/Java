
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = " Shirt";

        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 100, tax = 1.21;
        int quantity =1;
        double totaL;
        
        String message = custName+" wants to purchase a "+ quantity + itemDesc;
        
        totaL= price * quantity * tax;
        System.out.print("El total es " + totaL);
        
        // Modify message to include quantity 
        
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        

        
    }    
}
