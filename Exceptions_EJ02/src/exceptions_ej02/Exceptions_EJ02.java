/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException 
(índice de arreglo fuera de rango).
 */
package exceptions_ej02;

import Entidades.Arreglo;
import Entidades.Exception_Array;

public class Exceptions_EJ02 {

    public static void main(String[] args) {
        Arreglo a = new Arreglo();
        try{
        a.mostrar();
        } catch(Exception_Array e){
            System.out.println(e.getMessage());
        }
    }
    
}
