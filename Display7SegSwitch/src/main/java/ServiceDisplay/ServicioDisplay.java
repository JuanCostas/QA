package ServiceDisplay;

import Entity.DisplayMatrix;

import java.util.Scanner;

public class ServicioDisplay {
    private DisplayMatrix m = new DisplayMatrix();
    /**/
    private int n;
    /**/
    private int[] number;
    /**/
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    /**/
    private int[] sevenseg = {0, 0, 0, 0, 0, 0, 0};

    /*Funcion para cargar los numeros, faltarian los controles de la cantidad de test entre 1 y 1000, la cantidad de numeros y que estos esten entre 0 y 9*/
    public void ChargeNumbers() {
        /*Define el indice del vector para cargar los numeros*/
        int j = 0;
        /*Lee la cantidad de numeros a ingresar*/
        System.out.print("Ingrese la cantidad de números: ");
        n = scan.nextInt();
        /*Define el tamaño del vector de numeros*/
        number = new int[n];
        /*Lee un String de numeros separados por espacios*/
        System.out.print("Ingrese los números separados por un espacio: ");
        String aux = scan.next();

        for (int i = 0; i < aux.length(); i++) {
            /*Controla que el caracter seleccionado no sea un espacio*/
            if (aux.charAt(i) != ' ') {
                /*Carga el numero en el vector*/
                number[j] = Character.getNumericValue(aux.charAt(i));
                /*Cambia la posicion del indice para guardar el siguiente numero*/
                j++;
            }
        }
    }


    public int ChangesSwitch() {
        /*Define el contador de los cambios de switch*/
        int c = 0;
        /*Se va posicionando en cada elemento del vector de numeros ingresados por el usuario para fijar la fila a recorrer*/
        for (int i = 0; i < number.length; i++) {
            /*Recorre la fila por columnas y el vector*/
            for (int j = 0; j < m.getM(); j++) {
                /*Compara cada elemento de la fila con cada elemento del vector buscando cambios*/
                if (sevenseg[j] != m.getMatrix7Seg()[number[i]][j]) {
                    /*Si encuentra un cambio lo aplica en el vector para guardar el registro de cambio del switch*/
                    sevenseg[j] = m.getMatrix7Seg()[number[i]][j];
                    /*Cuenta uno más en el cambio*/
                    c = c + 1;
                }
            }
        }
        /*Retorna la cantidad total de cambios*/
        return c;
    }

    /*Funcion para mostrar la matriz que contiene en cada fila el estado de cada segmento del display*/
    public void MostratMatriz(){
        for (int i=0; i < m.getN(); i++){
            for (int j=0; j<m.getM(); j++){
                System.out.print(m.getMatrix7Seg()[i][j]+" ");
            }
            System.out.println();
        }
    }

}