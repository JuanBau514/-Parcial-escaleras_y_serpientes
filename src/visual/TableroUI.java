package visual;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

import modelo.Jugadores;
import modelo.TableroModelo;

public class TableroUI extends JFrame {

    private JPanel panel;
    private JTable tabla;
    private JScrollPane scrollPane;
    private JButton botonLanzarDados;

    public TableroUI() {

        super("Tablero de serpientes y escaleras"); // Titulo de la ventana
        
        panel = new JPanel(); // Creamos un panel
        panel.setLayout(new BorderLayout()); // Establecemos el layout del panel
        add(panel); // Añadimos el panel a la ventana


        TableroModelo modeloTabla = new TableroModelo(); // Creamos el modelo de la tabla
        tabla = new JTable(modeloTabla); // Creamos la tabla
        tabla.setDefaultRenderer(Object.class, new TableroRenderer()); // Establecemos el renderizador de la tabla
        tabla.setRowHeight(80); // Establecemos el alto de las filas
        
        tabla.setShowGrid(false); // Ocultamos las lineas de la tabla
        
        scrollPane = new JScrollPane(tabla); // Creamos el scrollpane
        tabla.setTableHeader(null); // Ocultamos la cabecera de la tabla
        panel.add(scrollPane, BorderLayout.CENTER); // Añadimos el scrollpane al panel

        botonLanzarDados = new JButton("Lanzar dados");
        panel.add(botonLanzarDados, BorderLayout.SOUTH);

        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    // Crear panel adicional para mostrar información del jugador
    JFrame frame = new JFrame(" Ventana principal");
    JPanel infoPanel = new JPanel(new BorderLayout());
    JLabel infoLabel = new JLabel(" Información del jugador");

    public void mostrarInfoJugador() {
        frame.add(infoPanel);
        infoPanel.add(infoLabel, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setVisible(true);
        //mostrando informacion del jugador en el panel
        infoLabel.setText("Informacion del jugador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // colocando el caracter en la posicion del jugador
    public void colocarFigura(int posicionX, int posicionY) {
        tabla.setValueAt("X", posicionX, posicionY); // colocando el caracter en la posicion del jugador
        tabla.setValueAt("O", posicionX, posicionY + 1); // colocando el caracter en la posicion del jugador
        tabla.setValueAt("X", posicionX, posicionY + 2); // colocando el caracter en la posicion del jugador
        tabla.setValueAt("O", posicionX, posicionY + 3); // colocando el caracter en la posicion del jugador
    }

    // Obtener el modelo de la tabla
    
    // Obtener la posición de la ficha del jugador
 

    // Actualizar el valor de la celda correspondiente


}
