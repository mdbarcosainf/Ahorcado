package controlador;

import modelo.*;
import vista.VistaJuego;

import java.io.IOException;
import java.util.Map;

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

     public void iniciarJuego() throws IOException {
        while (true) {
            while (!tablero.lleno() && !tablero.tresEnRaya()) {
                tablero.ver();
                Jugador jugador = jugadores[turnoActual];
                vista.verMensaje("Turno de " + jugador.getNombre());

             

                if (tablero.tresEnRaya()) {
                    tablero.ver();
                    vista.verMensaje("El ganador es " + jugador.getNombre());
                    tablero.registrarVictoria(jugador.getNombre());
                    verVictorias();
                    break;
                }
                turnoActual = (turnoActual + 1) % 2;
            }

            if (tablero.lleno()) {
                vista.verMensaje("Empate");
            }

            String respuesta = vista.obtenerEntradaTexto("¿Quieres jugar otra vez al Tres en Raya? (s/n): ");
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
            tablero.limpiar();
        }
    }

    private void verVictorias() {
        Map<String, Integer> victorias = tablero.getVictorias();
        for (Map.Entry<String, Integer> entry : victorias.entrySet()) {
            vista.verMensaje("Jugador: " + entry.getKey() + " - Victorias: " + entry.getValue());
        }
    }
    
}
