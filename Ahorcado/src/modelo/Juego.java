package modelo;

import java.util.Set;

public interface Juego {
    void iniciar();
    void mostrarInstrucciones();
    void mostrarEstadoJuego();
    char solicitarLetra();
    void mostrarMensajeVictoria();
    void mostrarMensajeDerrota();
    boolean jugarNuevamente();
    boolean esVictoria();
    boolean esDerrota();
    String getPalabraOculta();
    int getIntentosRestantes();
    Set<Character> getLetrasAdivinadas();
    String getPalabraSecreta();
}