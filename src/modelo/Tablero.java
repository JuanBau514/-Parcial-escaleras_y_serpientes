package modelo;

public class Tablero extends Casillas {


//crea un arreglo 8x8 de casillas
Casillas[][] tablero = new Casillas[8][8];

    public Tablero() {
        //la clase tablero hereda de la clase casillas
        // donde lo que hace el tablero es crear un tablero con un arreglo de casillas
        super();
    }

    public void crearTablero () {
        
        //crea un contador para asignarle un numero a cada casilla
        int contador = 1;

        //recorre el arreglo de casillas
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //asigna un numero a cada casilla
                tablero[i][j] = new Casillas(contador);
                contador++;
            }
        }
        //muestra el tablero
        mostrarTablero();
        System.out.println();

    }

    public int mostrarTablero() {
        //muestra el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
