package modelo;

import java.util.Set;

public abstract class ModeloJuego {
    protected int intentosRestantes;
    protected Set<Character> letrasAdivinadas;

    public abstract String getPalabraOculta();
    public abstract boolean adivinarLetra(char letra);
    public abstract boolean esVictoria();
    public abstract boolean esDerrota();
    public abstract int getIntentosRestantes();
    public abstract Set<Character> getLetrasAdivinadas();
    public abstract String getPalabraSecreta();
}