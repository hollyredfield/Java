
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        
        String [] people = {"Juan", "pepe", "Antonio", "Gerardo", "Juana"};
        System.out.println(people[0]);
        System.out.println(people);
        
        


        // Change message to show the number of items purchased.
        System.out.println("Estas " + people.length + " cinco personas quieren comprarlo. ");
        //The way to change the message 
        message = custName + "Wants to purchase " + people.length + " articulos";
        System.out.println(message);
        // Print an element from the items array.  
        
        
    }

}
