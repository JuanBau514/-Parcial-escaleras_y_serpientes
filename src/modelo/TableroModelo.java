package modelo;

import javax.swing.table.AbstractTableModel;

public class TableroModelo extends AbstractTableModel {

    private int filas = 8;
    private int columnas = 8;
    private int[][] valores = new int[filas][columnas];
    private char[][] casillas = new char[filas][columnas];

    public TableroModelo() {
        // Inicializamos los valores del tablero
        setHacerTablero(valores);
    }

    public void setHacerTablero (int[][] valores) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                valores[i][j] = i * columnas + j + 1;
            }
        }
    }

    public int[][] getMostrarTablero() {
        return valores;
    }

    public void colocarJugador(int x, int y) {
        valores[x][y] = 0;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public char [][] getCasillas( ) {
        return casillas;
    }

    public void setCasillas (char [][] casillas) {
        this.casillas = casillas;
    }

    public void getFilas () {
        System.out.println("Filas: " + filas);
    }

    public void getColumnas() {
        System.out.println("Filas: " + filas);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }



    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return columnas;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return valores[rowIndex][columnIndex];
    }
        
}
