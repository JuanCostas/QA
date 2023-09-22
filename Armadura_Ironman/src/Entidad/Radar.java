package Entidad;

import java.util.ArrayList;
import java.util.Random;

public class Radar {

    protected ArrayList<Objeto> objetos = new ArrayList();
    protected Random ran = new Random();
    
    public void altitud() {
    }

    public void detectar() {
        if(objetos.size()==10){
            destruyendoEnemigos();
        }
        for (int i = objetos.size(); i < 10; i++) {
            objetos.add(new Objeto((ran.nextInt(100)+1), (ran.nextInt(100)+1), (ran.nextInt(100)+1), (ran.nextInt(100)+0), true, "Tanque", true));
        }
    }

    public void simulador() {
        for (int i = 0; i < 10; i++) {
            objetos.add(new Objeto((ran.nextInt(100)+1), (ran.nextInt(100)+1), (ran.nextInt(100)+1), (ran.nextInt(100)+0), true, "Tanque", true));
        }
    }

    public void destruyendoEnemigos() { // Falta desarrollar, debe bajar la energía de la armadura
        int[] pos = new int[10];
        for (Objeto o : objetos) {
            while(o.getDureza()>0){
                
            }
            pos[objetos.indexOf(o)] = objetos.indexOf(o);
        }
    }

    public void accionesEvasivas() {
    }

    @Override
    public String toString() {
        return "Radar{" + "objetos=" + objetos.toString() + '}';
    }
    
}
