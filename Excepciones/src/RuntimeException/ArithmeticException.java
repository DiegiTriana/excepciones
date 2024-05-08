/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;
//En Java, operaciones aritméticas como la división por cero, el desbordamiento de enteros o el desbordamiento de coma flotante pueden
//resultar en situaciones excepcionales que deben manejarse adecuadamente en un programa. ArithmeticException se utiliza para manejar tales situaciones.

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.err.println("¡División por cero!");
            e.printStackTrace();
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}