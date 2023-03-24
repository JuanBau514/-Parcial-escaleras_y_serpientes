package modelo;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class Jugadores extends TableroModelo{

    private String nombre;
    private int posicionX;
    private int posicionY;
    private int turno;
    private char figura;
    private Color color; // color de la ficha

    public void agregarJugador(String n) {
        this.nombre = n;
        this.posicionX = 0;
        this.posicionY = 0;
        this.turno = 0;
        this.figura = 'X';
        this.color = Color.RED;
        
    }

    public void mostrarFigura() {
        System.out.println("Figura: " + figura);
        System.out.println("Posicion X: " + posicionX);
        System.out.println("Posicion Y: " + posicionY);
        System.out.println("Turno: " + turno);
        System.out.println();
    }

    public void mostrarInfoJugador() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posicion X: " + posicionX);
        System.out.println("Posicion Y: " + posicionY);
        System.out.println("Turno: " + turno);
        System.out.println();
    }

        // Crear panel adicional para mostrar información del jugador
        JFrame frame = new JFrame(" Datos del Jugador");
        JPanel infoPanel = new JPanel(new BorderLayout());
        JLabel infoLabel = new JLabel(" Información del jugador");
    
        public void mostrarInfoJugadorLabel() {
            frame.add(infoPanel); //agregando panel al frame
            infoPanel.add(infoLabel, BorderLayout.CENTER);//agregando label al panel
            frame.setSize(500, 100); //tamaño del frame
            frame.setVisible(true); //haciendo visible el frame
            //mostrando informacion del jugador en el panel
            // creando un objeto jugador para mostrar la informacion
            Jugadores jugador = new Jugadores(nombre);
            infoLabel.setText(jugador.toString());            
            // mostrando el nombre del jugador en el panel
            

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }

    public void setFicha(char ficha) {
        this.figura = ficha;
    }

    public char getFicha() {
        return figura;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void colocarFicha(int posicionX, int posicionY, TableroModelo tablero) {
        char[][] casillas = tablero.getCasillas();
        char ficha = this.getFicha();
        casillas[posicionX][posicionY] = ficha;
        tablero.setCasillas(casillas);
    }

    public void colocarJugador(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void mostrarFiguras() {
        System.out.println("Figura: " + figura);
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
        // Retornar la información del jugador con un salto de línea entre cada dato
        return "Nombre: " + nombre + "\n Posicion X: " + posicionX + "\n Posicion Y: " + posicionY + "\n Turno: " + turno;
    }
    
}
