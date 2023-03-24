package modelo;

import javax.swing.table.AbstractTableModel;

public class TableroModelo extends AbstractTableModel {

    private int filas = 8;
    private int columnas = 8;
    private int[][] valores = new int[filas][columnas];

    public TableroModelo() {
        // Inicializamos los valores del tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                valores[i][j] = i * columnas + j + 1;
            }
        }
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
