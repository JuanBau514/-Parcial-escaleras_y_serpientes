package modelo;
import visual.*;

import visual.CajasMensaje;

public class Jugadores extends TableroModelo{

    private String nombre;
    private int posicionX;
    private int posicionY;
    private int turno;

    public void agregarJugador(String n) {
        this.nombre = n;
        this.posicionX = 0;
        this.posicionY = 0;
        this.turno = 0;
    }

    public void mostrarFigura() {
        System.out.println("Figura: " + nombre);
        System.out.println("Posicion X: " + posicionX);
        System.out.println("Posicion Y: " + posicionY);
        System.out.println("Turno: " + turno);
        System.out.println();

    }

    public Jugadores(String nombre, int posicionX, int posicionY, int turno) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.turno = turno;
    }

    public Jugadores() {
    }

    public Jugadores(String nombre) {
        this.nombre = nombre;
    }
    
   

    public void mover(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
        this.turno = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", turno=" + turno + '}';
    }
    
}
