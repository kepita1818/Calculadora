package operaciones;

/**
 * Clase Operaciones que proporciona métodos para realizar operaciones matemáticas básicas.
 */
public class Operaciones {

    /**
     * Método que suma dos números enteros.
     *
     * @param valor1 El primer número a sumar.
     * @param valor2 El segundo número a sumar.
     * @return La suma de valor1 y valor2.
     */
    public int sumar(int valor1, int valor2) {
        int numero; // Variable para almacenar el resultado de la suma.
        numero = valor1 + valor2; // Realiza la suma de los dos valores.
        return numero; // Devuelve el resultado de la suma.
    }
    
    /**
     * Método que resta dos números enteros.
     *
     * @param valor1 El número del cual se restará.
     * @param valor2 El número que se restará.
     * @return La resta de valor1 menos valor2.
     */
    public int restar(int valor1, int valor2) {
        int numero; // Variable para almacenar el resultado de la resta.
        numero = valor1 - valor2; // Realiza la resta de los dos valores.
        return numero; // Devuelve el resultado de la resta.
    }
    
    /**
     * Método que multiplica dos números enteros.
     *
     * @param valor1 El primer número a multiplicar.
     * @param valor2 El segundo número a multiplicar.
     * @return El producto de valor1 y valor2.
     */
    public int multiplicar(int valor1, int valor2) {
        int numero; // Variable para almacenar el resultado de la multiplicación.
        numero = valor1 * valor2; // Realiza la multiplicación de los dos valores.
        return numero; // Devuelve el resultado de la multiplicación.
    }
    
    /**
     * Método que divide dos números enteros.
     *
     * @param valor1 El dividendo.
     * @param valor2 El divisor.
     * @return El cociente de valor1 dividido por valor2.
     * @throws ArithmeticException Si valor2 es cero.
     */
    public int dividir(int valor1, int valor2) {
        if (valor2 == 0) { // Comprobación para evitar la división por cero.
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        int numero; // Variable para almacenar el resultado de la división.
        numero = valor1 / valor2; // Realiza la división de los dos valores.
        return numero; // Devuelve el resultado de la división.
    }
    
    /**
     * Método que calcula el resto de la división de dos números enteros.
     *
     * @param valor1 El dividendo.
     * @param valor2 El divisor.
     * @return El resto de valor1 dividido por valor2.
     * @throws ArithmeticException Si valor2 es cero.
     */
    public int resto(int valor1, int valor2) {
        if (valor2 == 0) { // Comprobación para evitar la operación de resto con cero.
            throw new ArithmeticException("No se puede calcular el resto con divisor cero.");
        }
        int numero; // Variable para almacenar el resultado del resto.
        numero = valor1 % valor2; // Realiza la operación de resto.
        return numero; // Devuelve el resultado del resto.
    }
}
