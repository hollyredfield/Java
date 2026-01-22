// Explico: inicio del fichero Java, nombre del paquete. En Python no hace falta paquete, sería solo un .py.
package es.ejercicio1;
 
// Explico: importo la clase Scanner para leer por teclado. En Python usaría input(), sin importar nada.
import java.util.Scanner;
 
// Explico: declaro la clase pública que contiene todo el programa; en Python no hace falta clase obligatoria.
public class GestionArrayTest {
    // Explico: comentario que describe lo que viene a continuación.
    // Explico: creo un array de 10 enteros de forma fija. En Python sería: datos = [0]*10
    // Explico: "public static" hace que la variable exista para todos los métodos sin crear objetos.
    public static int [] datos = new int [10]; // lo pongo de manera pública
    // Explico: variable que indica si ya se rellenaron los valores del array. En Python: rellenado = False
    public static boolean rellenado = false; //Pongo por defecto una variable para determinar si está rellenado el campo.
    // Explico: creo un lector de teclado una sola vez para usar en todo el programa. En Python no hace falta.
    public static Scanner sc = new Scanner(System.in);
    
    
    // Explico: comentario indicando que el menú estará en el main.
    // Explico: método main es el punto de entrada; en Python sería: if __name__ == "__main__":
    public static void main (String[]args) {
        
        // Explico: bucle infinito que muestra el menú hasta que el usuario elija salir.
        while (true) {
            // Explico: muestro texto en pantalla. En Python usaría print().
            System.out.println(" Menú");
            System.out.print("1. Introducir: \n" );
            System.out.print("2. Mostrar: \n" );
            System.out.print("3. Obtener Mayor: \n " );
            System.out.print("4. Obtener Menor:  \n " );
            System.out.print("5. Obtener Suma:  \n" );
            System.out.print("6. Obtener Media:   \n" );
            System.out.print("7. Salir " );
            
            
            // pido al usuario que elija una opción; sc.nextLine() devuelve una línea de texto.
            System.out.println("\n Elige una opción, chato: ");
            String linea = sc.nextLine(); // Realizo el input al usuario y lo paso a texto
            // declaro la variable que contendrá la opción convertida a número entero.
            int opcion; //declaro la variable opcion como entero
            
            try {
                // intento convertir la línea de texto a número entero; en Python sería int(linea)
                opcion = Integer.parseInt(linea); //Convierto el texto a int y lo guardo como opción
                
            } catch (NumberFormatException e ) {
                //si la conversión falla, aviso y vuelvo al principio del menú.
                System.err.println("Haz el favor de introducir un número, por favor: ");
                continue ;
                
            }
                // estructura switch que elige la acción según la opción (como if/elif en Python).
                switch (opcion ) {
                case 1: 
                    //  llamo al método introducir() que pedirá 10 números al usuario.
                    introducir();
                    break;
                case 2:
                    // llamo al método mostrar() que enseña el contenido del array.
                    mostrar();
                    break;
                case 3:
                    // si no hay datos, aviso; si hay, calculo y muestro el mayor.
                    if(!rellenado ) {
                        System.out.println("Primero Introduce los datos. ");
                        
                    } else {
                        System.out.println("Mayor: " + obtenerMayor());
                        
                    }
                    break;
                case 4:
                    // igual que la opción 3 pero para el menor.
                    if(!rellenado ) {
                        System.out.println("Primero Introduce los datos. ");
                        
                    } else {
                        System.out.println("Menor: " + obtenerMenor());
                        
                    }
                    break;
                case 5:
                    //  si hay datos, calculo la suma con obtenerSuma().
                    if(!rellenado ) {
                        System.out.println("Primero Introduce los datos. ");
                        
                    } else {
                        System.out.println("Suma: " + obtenerSuma());
                        
                    }
                    break;
                case 6:
                    //si hay datos, calculo la media usando obtenerMedia().
                    if(!rellenado ) {
                        System.out.println("Primero Introduce los datos. ");
                        
                    } else {
                        System.out.println("Aquí tienes la media: " + obtenerMedia());
                        
                    }
                    break;
                case 7:
                    // cierro el Scanner y salgo del programa (return sale del main).
                    System.out.println("Hasta la próxima, vampiro. ");
                    sc.close (); //Cierro la entrada del usuario
                    return; 
                default: 
                    //opción no válida, vuelvo a mostrar menú.
                    System.out.println("La opción introducida no es válida, campeón. ");
                    
                }
                
        }
    }
    
    //método para introducir los 10 números. En Python sería def introducir():
    public static void introducir () {
        System.out.println("Introduce 1o números enteros: ");
        // Bucle for que recorre las posiciones del array desde 0 hasta 9.
        // Empieza en 0; i < datos.length significa "mientras i sea menor que 10";
        // (i + 1): i almacena índice que comienza en 0 pero para mostrar al usuario se suma 1 para que empiece en 1. //Lo muestro para que el usuario pueda verlo en formato
        //decimal o humano y para no confundirlo. 
        for(int i = 0 ; i < datos.length; i++) {
            // bucle interno que repite la petición hasta recibir un número válido.
            while (true) {
                System.out.println("Número " + (i + 1) + ": ");
                // pido la línea de texto con el número.
                String linea = sc.nextLine();
                try {
                    //  convierto la línea a entero; si no se puede, salta al catch.
                    int valor = Integer.parseInt(linea);
                    //guardo el número en la posición i del array.
                    datos [i] = valor;
                    // Explico: si todo bien, salgo del while y paso al siguiente i.
                    break;
                    
                } catch (NumberFormatException e ) {
                    // en caso de error pido al usuario que introduzca un número válido y repito.
                    System.out.println("Introduce el número válido: ");
                }
            }
        }
        
        // marco que el array ya está rellenado para permitir operaciones posteriores.
        rellenado = true;
    }
    //  método para mostrar el contenido del array.
    public static void mostrar() {
        //si no está rellenado, aviso y no muestro nada.
        if(!rellenado) {
            System.err.println("Por favor, introduce datos para poder verlos: ");
            return;
        }
        System.out.println("Contenido del Array");
        // recorro el array e imprimo cada posición y su valor.
        for (int i = 0; i < datos.length; i++) {
            System.err.println("Pos " + i + " -> " + datos[i]);
        }
    }
    
    //  método que devuelve el mayor valor del array.
    public static int obtenerMayor() {
        //  inicio el mayor con el primer elemento del array (posición 0).
        int mayor = datos [0];
        // recorro desde la segunda posición (i = 1) comparando para encontrar el mayor.
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                //si el valor actual es mayor que "mayor", actualizo "mayor".
                mayor = datos [i];
            }
        }
        // devuelvo el mayor encontrado.
        return mayor;
    }
    
    // método que devuelve el menor valor del array.
    public static int obtenerMenor () {
        //inicio el menor con el primer elemento del array.
        int menor = datos [0];
        //recorro todas las posiciones y comparo para encontrar el menor.
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < menor) {
                //si el valor actual es menor que "menor", actualizo "menor".
                menor = datos [i];
            }
        }
        // devuelvo el menor encontrado.
        return menor;
    }
    // Explico: método que suma todos los elementos y devuelve la suma como long.
    public static long obtenerSuma() {
        long suma = 0; 
        //recorro cada posición y voy acumulando en la variable suma.
        for (int i = 0; i < datos.length; i++ ) {
            suma += datos [i];
            //suma += datos[i] significa suma = suma + datos[i]
        }
        //  devuelvo la suma total.
        return suma;
    }
    
    // método que calcula la media aritmética: suma dividida entre número de elementos.
    public static double obtenerMedia() {
        long suma = obtenerSuma();
        // cast (double) convierte la suma a número con decimales antes de la división.
        // dividir por datos.length (10) da la media; si suma = 15 -> 15/10 = 1.5
        return (double) suma / datos.length;
    }
     
}
