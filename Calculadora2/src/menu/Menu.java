package menu;

import java.util.Scanner;

/**
 * Clase Menu que gestiona la interacción del usuario con un menú de operaciones
 * de una calculadora.
 */
public class Menu {
    // Creamos un objeto Scanner para leer la entrada del usuario.
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * Método que pide dos números al usuario.
     *
     * @return Un array de enteros que contiene los dos números ingresados.
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2]; // Inicializamos un array de enteros con dos posiciones.
        System.out.print("Operando 1: "); // Solicita al usuario el primer operando.
        ret[0] = teclado.nextInt(); // Lee el primer número y lo almacena en la primera posición del array.
        System.out.print("Operando 2: "); // Solicita al usuario el segundo operando.
        ret[1] = teclado.nextInt(); // Lee el segundo número y lo almacena en la segunda posición del array.
        return ret; // Devuelve el array con los dos números.
    }
    
    /**
     * Método que presenta un menú de opciones y pide al usuario seleccionar una operación.
     *
     * @return La operación seleccionada por el usuario como una cadena.
     */
    public String menuOpciones() {
        String ret = ""; // Inicializamos una variable para almacenar la opción elegida.
        do {
            System.out.print("Operaciones [+, -, *, /, %]: "); // Muestra las operaciones disponibles.
            ret = teclado.next(); // Lee la opción ingresada por el usuario.
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))));
        return ret; // Devuelve la operación seleccionada.
    }
    
    /**
     * Método que pregunta al usuario si desea continuar usando la calculadora.
     *
     * @return true si el usuario desea continuar, false en caso contrario.
     */
    public boolean repetir(){
        boolean ret = false; // Inicializamos la variable de retorno en falso.
        String respuesta; // Variable para almacenar la respuesta del usuario.
        do {
            System.out.print("¿Desea continuar trabajando con la calculadora? [s / n]"); // Pregunta si desea continuar.
            respuesta = teclado.next(); // Lee la respuesta del usuario.
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))));
        
        if (respuesta.equalsIgnoreCase("s")){ // Si la respuesta es 's', se cambia el valor de retorno a verdadero.
            ret = true;
        }
        return ret; // Devuelve verdadero o falso según la respuesta del usuario.
    }
}