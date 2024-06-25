package modelo;

/**
 *
 * @author soledadbarco
 */

public class Jugador {
    private String nombre;
    private char pieza;

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






