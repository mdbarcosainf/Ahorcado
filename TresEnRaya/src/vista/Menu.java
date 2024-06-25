package vista;

import java.io.IOException;

/**
 *
 * @author soledadbarco
 *
 * CLASE PARA EL MENÚ E INSTRUCIONES
 */

public class Menu {
    private VistaJuego vista;

    public Menu(VistaJuego vista) {
        this.vista = vista;
    }
    
    //MENU:
    public void verMenuPrincipal() throws IOException {
        while (true) {
            vista.verMensaje("--------------------------------------");
            vista.verMensaje("      Bienvenido al Tres en Raya");
            vista.verMensaje("--------------------------------------");
            vista.verMensaje("1. Ver Instrucciones");
            vista.verMensaje("2. Jugar");
            vista.verMensaje("3. Salir");
            vista.verMensaje("--------------------------------------");

            int opcion = vista.recibeEntrada("Elige una opción (1-3): ");
            switch (opcion) {
                case 1:
                    verInstrucciones();//nos enseña las intrucciones
                    break;
                case 2:
                    return;//salimos del menú para empezar a jugar
                case 3:
                    System.exit(0);//salimos del juego
                default:
                    vista.verMensaje("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
     
    //INRUCCIONES:
    private void verInstrucciones() {
        vista.verMensaje("Instrucciones del juego:");
        vista.verMensaje(" El juego es para dos jugadores, uno sera X y oto será O ."
                + "\nLos jugadores se turnarán para colocar sus piezas en el tablero."
                + "\n El primer jugador en colocar tres de sus piezas en línea (horizontal, vertical o diagonal) ganará la partida."
                + "\n También se podrá hacer empate, si el tablero se llena y nadie ha ganado. ");
    }
}
