/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

//La excepción BufferUnderflowException es un término comúnmente utilizado para describir una situación en la que se intenta extraer más 
//elementos de los que contiene un búfer, lo que resulta en un desbordamiento hacia el lado inferior o "underflow" del búfer. Esta situación 
//generalmente se presenta en el contexto de operaciones de lectura de datos desde un búfer o una estructura de datos similar.
public class BufferUnderflowException {
    public static void main(String[] args) {
        try {
            int[] buffer = new int[5];
            // Intentamos acceder a un índice que está fuera del rango del buffer
            for (int i = 0; i < 10; i++) {
                int value = buffer[i]; // Intentamos acceder a un índice que está fuera del rango
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.err.println("¡Subdesbordamiento de búfer!");
            e.printStackTrace();
        }
    }
}