/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la
cadena no puede convertirse a entero, arroja una NumberFormatException y además, al 
dividir un número por cero surge una ArithmeticException. Manipule todas las posibles
excepciones utilizando bloques try/catch para las distintas excepciones.
 */
package exceptions_ej04;

import Entity.Division;

public class Exceptions_EJ04 {

    public static void main(String[] args) {
        Division d = new Division();
        d.division();
    }
}
