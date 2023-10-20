/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException 
(índice de arreglo fuera de rango).
 */
package Entidades;

public class Exception_Array extends Exception {

    public Exception_Array() {
    }

    public Exception_Array(String msg) {
        super(msg);
    }
}
