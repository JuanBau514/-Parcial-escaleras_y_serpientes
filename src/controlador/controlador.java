package controlador;
import modelo.*;
import visual.*;

public class controlador {

    public Menu menu;
    public TableroUI tablero;

    public controlador() {
        menu = new Menu();
        tablero = new TableroUI();
    }


    public void inicio() {

        tablero.setVisible(true);
        
   
    }
    
}
