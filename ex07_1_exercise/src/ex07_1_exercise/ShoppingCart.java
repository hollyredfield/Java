
package ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        String secondName; 
        
        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);
        
        
        

        // Use the substring method parse out the first name and print it.
        //Saco el nombre sin espacios, el primer nombre:
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        secondName = custName.substring (spaceIdx + 1); //Se identificaq primero el SpaceIdx porque va el espacio
        //Delante de la palabra que quiero sacar.
        System.out.println(secondName);

    }
}
