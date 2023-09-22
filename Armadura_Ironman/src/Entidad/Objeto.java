package Entidad;

import static java.lang.Math.sqrt;

public class Objeto {

    protected double x;

    protected double y;

    protected double z;

    protected int dureza;

    protected boolean hostilidad;

    protected String tipoObjeto;

    protected boolean estatico;
    
    protected int distancia;

    public Objeto() {
    }

    public Objeto(double x, double y, double z, int dureza, boolean hostilidad, String tipoObjeto, boolean estatico) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dureza = dureza;
        this.hostilidad = hostilidad;
        this.tipoObjeto = tipoObjeto;
        this.estatico = estatico;
        this.distancia = (int) sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public boolean isHostilidad() {
        return hostilidad;
    }

    public void setHostilidad(boolean hostilidad) {
        this.hostilidad = hostilidad;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public boolean isEstatico() {
        return estatico;
    }

    public void setEstatico(boolean estatico) {
        this.estatico = estatico;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    @Override
    public String toString() {
        return "Objeto{" + "x=" + x + ", y=" + y + ", z=" + z + ", dureza=" + dureza + ", hostilidad=" + hostilidad + ", tipoObjeto=" + tipoObjeto + ", estatico=" + estatico + ", distancia=" + distancia + '}';
    }
    

}
