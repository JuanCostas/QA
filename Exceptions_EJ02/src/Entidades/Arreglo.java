/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException 
(índice de arreglo fuera de rango).
 */
package Entidades;

public class Arreglo {

    private final int v[] = {1, 2, 3, 4, 5};

    public void mostrar() throws Exception_Array {
        try {
            int n = 5;
            for (int i = 0; i < n; i++) {
                if (i > 4) {
                    throw new Exception_Array("El indice se pasó de 4");
                }
                if (i < 0) {
                    throw new Exception_Array("El indice es menor que 0");
                }
                System.out.println(v[i]);
            }
        } catch (Exception_Array e) {
            throw e;
        }
    }
}
