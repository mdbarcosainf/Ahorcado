package modelo;

/**
 *
 * @author soledadbarco
 * 
 * JUGADOR DEL JUEGO DE TRES EN RAYAS CON SUS RESPECTIVOS GETTERS
 */

public class Jugador {
    private String nombre;
    private char pieza;// Pieza X o O

    public Jugador(String nombre, char pieza) {
        this.nombre = nombre;
        this.pieza = pieza;
    }

    public String getNombre() {
        return nombre;
    }

    public char getPieza() {
        return pieza;
    }
}






