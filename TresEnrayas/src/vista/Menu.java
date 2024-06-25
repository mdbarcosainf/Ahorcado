package vista;

import java.io.IOException;

/**
 *
 * @author soledadbarco
 */

public class Menu {
    private VistaJuego vista;

    public Menu(VistaJuego vista) {
        this.vista = vista;
    }

    public void verMenuPrincipal() throws IOException {
        while (true) {
            vista.verMensaje("--------------------------------------");
            vista.verMensaje("      Bienvenido al Tres en Raya");
            vista.verMensaje("--------------------------------------");
            vista.verMensaje("1. Ver Instrucciones");
            vista.verMensaje("2. Jugar");
            vista.verMensaje("3. Salir");
            vista.verMensaje("--------------------------------------");

            int opcion = vista.obtenerEntrada("Elige una opción (1-3): ");
            switch (opcion) {
                case 1:
                    verInstrucciones();
                    break;
                case 2:
                    return; // salir del menú para iniciar el juego
                case 3:
                    System.exit(0);
                default:
                    vista.verMensaje("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private void verInstrucciones() {
        vista.verMensaje("Instrucciones del juego:");
        vista.verMensaje("El juego es para dos jugadores, uno sera X y oto será O ."
                + "\nLos jugadores se turnarán para colocar sus piezas en el tablero."
                + "\n El primer jugador en colocar tres de sus marcas en línea (horizontal, vertical o diagonal) ganará la partida."
                + "\n También se podrá hacer empate, si el tablero se llena y nadie ha ganado. ");
    }
}
