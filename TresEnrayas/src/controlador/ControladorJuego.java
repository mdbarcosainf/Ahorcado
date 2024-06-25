package controlador;
import vista.VistaJuego;
/**
 *
 * @author soledadbarco
 */

public class ControladorJuego {
    private TableroJuego tablero;
    private VistaJuego vista;
    private Jugador[] jugadores;
    private int turnoActual;

    public ControladorJuego(TableroJuego tablero, VistaJuego vista, Jugador[] jugadores) {
        this.tablero = tablero;
        this.vista = vista;
        this.jugadores = jugadores;
        this.turnoActual = 0;
    }
    
}
