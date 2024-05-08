/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

// Cuando se utilizan anotaciones en Java, los elementos de la anotación pueden tener tipos específicos, como String, int, Class, etc. 
// Si se intenta asignar un valor a un elemento de la anotación que no es del tipo esperado, se lanzará una AnnotationTypeMismatchException.

import java.lang.annotation.*;

// Definición de una anotación simple
@interface MyAnnotation {
    String value();
}

public class AnnotationTypeMismatchException {
    // Método que utiliza la anotación
    @MyAnnotation("test")
    public static void myMethod() {
        // Intentar obtener la anotación
        try {
            // Obtener la anotación de MyAnnotation en este método
            MyAnnotation annotation = AnnotationTypeMismatchException.class.getDeclaredMethod("myMethod").getAnnotation(MyAnnotation.class);
            // Imprimir el valor de la anotación
            System.out.println(annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.annotation.AnnotationTypeMismatchException e) {
            // Capturar la excepción de tipo AnnotationTypeMismatchException
            System.err.println("Excepción de tipo de anotación incorrecta: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Llamar al método que utiliza la anotación
        myMethod();
    }
}