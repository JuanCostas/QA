package org.example;

import Entity.DisplayMatrix;
import ServiceDisplay.ServicioDisplay;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DisplayMatrix m = new DisplayMatrix();
        m.Mostrat_Matriz();
        ServicioDisplay s = new ServicioDisplay();
        s.ChargeNumbers();
        System.out.println("La cantidad de Switchs a cambiar es de: "+s.ChangesSwitch());
        System.out.println("La cantidad de Switchs a cambiar es de: "+s.ChangesSwitchver2());
    }
}