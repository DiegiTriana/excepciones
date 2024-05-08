/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;
//es una excepción que se lanza cuando se intenta almacenar un objeto de tipo incorrecto en un arreglo en tiempo de ejecución. 
//Esta excepción ocurre cuando el tipo de objeto que se está tratando de almacenar en el arreglo no es compatible con el tipo 
//de elementos que el arreglo puede contener.
public class ArrayStoreException {
    public static void main(String[] args) {
        try {
            Object[] array = new Integer[10];
            array[0] = "String"; // Intentar almacenar una cadena en un arreglo de enteros
        } catch (java.lang.ArrayStoreException e) {
            System.err.println("Intento de almacenar un objeto en un tipo de arreglo incorrecto.");
            e.printStackTrace();
        }
    }
}