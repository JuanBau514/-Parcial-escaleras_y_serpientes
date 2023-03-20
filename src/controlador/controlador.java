package controlador;
import modelo.*;
import visual.Menu;

public class controlador {

    public Menu menu;
    public Jugador jugador;
    public Dados dados;

    public controlador() {
        menu = new Menu();
        jugador = new Jugador();
        dados = new Dados();
    }

    public void inicio() {
        menu.setVisible(true);
    }
    
}
