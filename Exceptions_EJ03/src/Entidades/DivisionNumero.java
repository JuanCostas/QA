/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de 
tipo int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
 */
package Entidades;

import java.util.Scanner;

public class DivisionNumero {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String a;
    private String b;
    
    public void division(){
        System.out.print("Ingrese el dividendo: ");
        a = read.next();
        System.out.print("Ingrese el divisor: ");
        b = read.next();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        try{
            System.out.println("La división es: " + (num1/num2));
        } catch(Exception e){
            System.out.println("No es posible la división en cero");
        }
    }
}
