/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

//La excepción CannotRedoException podría utilizarse para representar situaciones en las que no es posible realizar una operación de "rehacer" 
//en un contexto particular de una aplicación. La idea detrás de esta excepción es indicar que no se puede llevar a cabo una acción específica 
//de repetir una operación previamente deshecha.
public class CannotRedoException extends RuntimeException {
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

        // Intentamos rehacer sin haber realizado ninguna operación de "deshacer"
        try {
            editor.redo();
        } catch (CannotRedoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}