/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

//La excepción BufferOverflowException no es una excepción estándar en Java. Sin embargo, en otros contextos de programación, 
//especialmente en lenguajes como C y C++, una BufferOverflowException es una excepción que se lanza cuando se produce un desbordamiento de búfer,
//es decir, cuando se intenta escribir más datos en un búfer de los que puede contener.

//El desbordamiento de búfer es una situación peligrosa que puede conducir a vulnerabilidades de seguridad, ya que un atacante podría 
//aprovecharse de esta situación para sobrescribir datos en áreas de memoria adyacentes, causando comportamientos inesperados o incluso 
//permitiendo la ejecución de código malicioso.


public class BufferOverflowException {
    public static void main(String[] args) {
        try {
            int[] buffer = new int[5];
            // Intentamos agregar más elementos de los que el buffer puede contener
            for (int i = 0; i < 10; i++) {
                buffer[i] = i;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.err.println("¡Desbordamiento de búfer!");
            e.printStackTrace();
        }
    }
}
