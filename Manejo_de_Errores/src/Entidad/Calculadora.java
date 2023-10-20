/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    private double a;
    private double b;
    
    public double suma(){
        Scanner read = new Scanner(System.in);
        try{
            a = read.nextDouble();
            b = read.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("no es un number");
        }
        return a+b;
    }
}
