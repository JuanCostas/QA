package org.example;

import Entity.DisplayMatrix;
import ServiceDisplay.ServicioDisplay;

/*El ejercicio resulto es el de la página https://www.codechef.com/CEL22021/problems-old/SEGDIS*/
public class Main {
    public static void main(String[] args) {
        ServicioDisplay s = new ServicioDisplay();
        /*Muestra la matriz que tiene los segmentos a encender para visualizar cada número en el display 7 segmentos*/
        s.MostratMatriz();
        /*Permite al usuario cargar la cantidad de numeros y los numeros propiamente dichos*/
        s.ChargeNumbers();
        /*Ejecuta la funcion que realiza el calculo y lo muestra por pantalla*/
        System.out.println("La cantidad de Switchs a cambiar es de: " + s.ChangesSwitch());
    }
}