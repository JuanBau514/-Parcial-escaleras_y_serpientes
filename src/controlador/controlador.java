package controlador;
import modelo.*;
import visual.Menu;

public class controlador {

    public Menu menu;
    public Dados dados;

    public controlador() {
        menu = new Menu();
    }

    public void inicio() {

        menu.menuPrincipal();
   
    }
    
}
