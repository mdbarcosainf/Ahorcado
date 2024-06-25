package tresenraya;

import vista.VistaJuego;
import vista.Menu;
import controlador.ControladorJuego;
import modelo.*;

import java.io.IOException;

/**
 *
 * @author soledadbarco
 *
 * CLASE PRINCIPAL PARA INICIAR EL JUEGO
 */

public class TresEnRaya{
    public static void main(String[] args) throws IOException {
        VistaJuego vista = new VistaJuego();
        Menu menu = new Menu(vista);
        menu.verMenuPrincipal();
        
        TableroJuego tablero = new TableroJuego();
        Jugador[] jugadores = {
            new Jugador("Jugador 1", 'X'),
            new Jugador("Jugador 2", 'O')
        };
        ControladorJuego controlador = new ControladorJuego(tablero, vista, jugadores);
        controlador.iniciarJuego();
    }
}
