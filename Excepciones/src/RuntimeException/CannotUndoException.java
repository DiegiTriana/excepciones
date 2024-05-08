/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

//La excepción CannotRedoException se utilizaría para indicar que una operación de "rehacer" no puede llevarse a cabo en un contexto 
//específico de una aplicación. Esta excepción se lanza cuando, por alguna razón, no es posible realizar una acción de "rehacer" en 
// estado dado del programa.
class CannotRedoException extends RuntimeException {
    // Constructor con un mensaje personalizado
    public CannotRedoException(String message) {
        super(message);
    }
}

class TextEditor {
    private String content;
    private boolean canRedo;

    public TextEditor() {
        this.content = "";
        this.canRedo = false;
    }

    public void addText(String text) {
        this.content += text;
        this.canRedo = true;
    }

    public void undo() {
        // Simulamos la operación de "deshacer"
        // En una implementación real, aquí revertiríamos el cambio en el contenido
        System.out.println("Operación de deshacer realizada.");
        this.canRedo = true;
    }

    public void redo() {
        if (!canRedo) {
            throw new CannotRedoException("No se puede rehacer la operación.");
        }
        // Lógica para realizar la operación de "rehacer"
        System.out.println("Operación de rehacer realizada.");
        this.canRedo = false;
    }
}

class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Simulamos la adición de texto
        editor.addText("Hola ");
        editor.addText("Mundo");

        // Realizamos una operación de "deshacer"
        editor.undo();

        // Intentamos rehacer sin haber realizado ninguna operación de "deshacer"
        try {
            editor.redo();
        } catch (CannotRedoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}