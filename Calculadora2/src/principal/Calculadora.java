package principal;

import menu.Menu;
import operaciones.Operaciones;

/**
 * Clase Calculadora que permite realizar operaciones matemáticas básicas mediante un menú interactivo.
 */
public class Calculadora {
    
    /**
     * Método principal que inicia la aplicación de la calculadora.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {   
        int resultado = 0; // Variable para almacenar el resultado de las operaciones.
        String operacion = ""; // Variable para almacenar la operación seleccionada.
        int[] operandos = new int[2]; // Array para almacenar los operandos ingresados por el usuario.
        
        // Creación de instancias de las clases Menu y Operaciones.
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do {
            // Solicita al usuario los operandos y la operación a realizar.
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            // Evalúa la operación seleccionada y realiza la correspondiente operación matemática.
            if (operacion.equalsIgnoreCase("+")) {
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")) {
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")) {
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")) {
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")) {
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operación no válida"); // Mensaje de error para operaciones no válidas.
            }
        } while (menu.repetir()); // Pregunta al usuario si desea realizar otra operación.
    }
}
