package modelo;

/**
 *
 * @author soledadbarco
 */

public class Posicion {
    int[] lugar;

    public Posicion(int tam) {
        lugar = new int[tam];
    }

    public int[] getLugar() {
        return lugar;
    }

    public void setLugar(int[] lugar) {
        this.lugar = lugar;
    }
}
