/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armadura_ironman;

import Entidad.Radar;

/**
 *
 * @author Usuario
 */
public class Armadura_Ironman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radar r = new Radar();
        r.simulador();
        System.out.println(r.toString());
    }
    
}
