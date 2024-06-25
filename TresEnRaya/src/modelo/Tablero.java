package modelo;

/**
 *
 * @author soledadbarco
 * 
 * INTERFAZ PARA LOS MÉTODOS DEL TABLERO
 */

public interface Tablero {
    void ver();
    boolean poner(Posicion pos, char pieza);
    void limpiar();
    //boolean quitar(Posicion pos, char pieza);
    boolean tresEnRaya();
    boolean lleno();
}
