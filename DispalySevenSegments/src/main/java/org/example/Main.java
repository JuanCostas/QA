package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        servicioDisplay();
    }

    public static void servicioDisplay(){
    /*Numero de filas de la matriz que para este caso son 10 numero por lo que se definen 10 filas*/
    int n = 10;
    /*Cantidad de columnas de la matriz que para este caso son 7 segmentos por lo que se definen 7 columnas*/
    int m = 7;
    /*Matriz definida commo: cada fila es el numero a representar y cada columna es el estado de cada segmento para lograrlo*/
                      /*   a  b  c  d  e  f  g  */
    int[][] matrix7Seg = {{1, 1, 1, 1, 1, 1, 0},/* 0*/
                          {0, 1, 1, 0, 0, 0, 0},/* 1*/
                          {1, 1, 0, 1, 1, 0, 1},/* 2*/
                          {1, 1, 1, 1, 0, 0, 1,},/* 3*/
                          {0, 1, 1, 0, 0, 1, 1,},/* 4*/
                          {1, 0, 1, 1, 0, 1, 1},/* 5*/
                          {1, 0, 1, 1, 1, 1, 1},/* 6*/
                          {1, 1, 1, 0, 0, 0, 0},/* 7*/
                          {1, 1, 1, 1, 1, 1, 1},/* 8*/
                          {1, 1, 1, 1, 0, 1, 1}/* 9*/
    };
        /*Declaracion de la variable que dara dimension al vector de numeros ingresados por el usuario*/
        int o;
        /*Vector de numeros que almacenara los ingresados por el usuario*/
        int[] number;
        /*Define la variable para leer por teclado usando la nueva linea como delimitador*/
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        /*Variable para el número de casos a testear*/
        int testcase;
        System.out.print("Ingrese la cantidad de test case que desea: ");
        testcase = scan.nextInt();

        int[] output = new int[testcase];
        for(int i = 0; i<testcase; i++){
            /*Define el vector que representa el estado inicial de todos los segmentos apagados y que ira variando conforme se ejecute la funcion que compara los segmentos*/
            int[] sevenseg = {0, 0, 0, 0, 0, 0, 0};
            /*Lee la cantidad de numeros a ingresar*/
            System.out.print("Ingrese la cantidad de números: ");
            o = scan.nextInt();
            /*Define el tamaño del vector de numeros*/
            number = new int[o];
            /*Lee un String de numeros separados por espacios*/
            System.out.print("Ingrese los números separados por un espacio: ");
            String aux = scan.next();
            chargeNumbers(number, aux);
            output[i] = changesSwitch(number,sevenseg,matrix7Seg,m);
        }

        for(int i = 0; i<testcase; i++) {
            System.out.println(output[i]);
        }

    }

    /*Funcion para cargar los numeros, faltarian los controles de la cantidad de test entre 1 y 1000, la cantidad de numeros y que estos esten entre 0 y 9*/
    public static void chargeNumbers(int[] number, String aux) {
        /*Define el indice del vector para cargar los numeros*/
        int j = 0;

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

    /*Funcion para mostrar la matriz que contiene en cada fila el estado de cada segmento del display*/
    public void mostratMatriz(int[][] matrix7Seg, int n, int m){
        for (int i=0; i < n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix7Seg[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int changesSwitch(int[] number, int[] sevenseg, int[][] matrix7Seg, int m) {
        /*Define el contador de los cambios de switch*/
        int c = 0;
        /*Se va posicionando en cada elemento del vector de numeros ingresados por el usuario para fijar la fila a recorrer*/
        for (int i = 0; i < number.length; i++) {
            /*Recorre la fila por columnas y el vector*/
            for (int j = 0; j < m; j++) {
                /*Compara cada elemento de la fila con cada elemento del vector buscando cambios*/
                if (sevenseg[j] != matrix7Seg[number[i]][j]) {
                    /*Si encuentra un cambio lo aplica en el vector para guardar el registro de cambio del switch*/
                    sevenseg[j] = matrix7Seg[number[i]][j];
                    /*Cuenta uno más en el cambio*/
                    c = c + 1;
                }
            }
        }
        /*Retorna la cantidad total de cambios*/
        return c;
    }

}