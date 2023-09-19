/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

public class Calculadora {
    private double a;
    private double b;
    
    public double suma(){
        Scanner read = new Scanner(System.in);
        
        try{
            a = read.nextDouble();
        } catch(Exception e){
            System.out.println("no es un number");
            a = 3;
        }
        
        b = read.nextDouble();
        return a+b;
    }
}
