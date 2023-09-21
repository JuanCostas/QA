/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la
cadena no puede convertirse a entero, arroja una NumberFormatException y además, al 
dividir un número por cero surge una ArithmeticException. Manipule todas las posibles 
excepciones utilizando bloques try/catch para las distintas excepciones.
 */
package Entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String a;
    private int num2;
    
    public void division(){
        try{
            System.out.print("Ingrese el dividendo: ");
            a = read.next();
            System.out.print("Ingrese el divisor: ");
            num2 = read.nextInt();
            int num1 = Integer.parseInt(a);
            System.out.println("La división resultante es: " + (num1/num2));
        }catch(InputMismatchException e){
            System.out.println("El tipo de dato ingresado es incorrecto ingrese un entero.");
            System.out.println(e.getMessage()); // Muestra null
        }catch(NumberFormatException e){
            System.out.println("La cadena ingresada no corresponde a un número entero.");
            System.out.println(e.getMessage()); // Muestra For input string: "(Cadena ingresada)"
        }catch(ArithmeticException e){
            System.out.println("El denominador debe ser diferente de cero.");
            System.out.println(e.getMessage()); // Muestra / by zero
        }
    }
    
}
