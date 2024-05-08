/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

//Esta excepción podría utilizarse para representar cualquier error específico que ocurra en un contexto relacionado con la manipulación de datos 
//o cálculos en una aplicación.
public class CMMException extends RuntimeException {
    // Constructor con un mensaje personalizado
    public CMMException(String message) {
        super(message);
    }
}

class Calculadora {
    // Método para dividir dos números
    public static double dividir(double dividend, double divisor) {
        if (divisor == 0) {
            // Lanzar una excepción si el divisor es cero
            throw new CMMException("Divisor no puede ser cero");
        }
        return dividend / divisor;
    }
}

class Main {
    public static void main(String[] args) {
        double dividend = 10;
        double divisor = 0;
        
        try {
            double resultado = Calculadora.dividir(dividend, divisor);
            System.out.println("Resultado: " + resultado);
        } catch (CMMException e) {
            // Manejo de la excepción CMMException
            System.out.println("Error: " + e.getMessage());
        }
    }
}