package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ModeloAhorcado extends ModeloJuego {
    private Palabra palabraSecreta;
    private Map<Character, Boolean> letrasAdivinadas;
    private Map<Character, Boolean> letrasIncorrectas;
    private List<Palabra> palabras;

    public ModeloAhorcado() {
        this.palabras = new ArrayList<>();
        this.letrasAdivinadas = new HashMap<>();
        this.letrasIncorrectas = new HashMap<>();
        this.intentosRestantes = 6;
        cargarPalabras();
        seleccionarPalabra();
    }

    private void cargarPalabras() {
        palabras.add(new Palabra("programacion"));
        palabras.add(new Palabra("java"));
        palabras.add(new Palabra("consola"));
        palabras.add(new Palabra("ahorcado"));
        palabras.add(new Palabra("codigo"));
    }

    private void seleccionarPalabra() {
        int indice = (int) (Math.random() * palabras.size());
        this.palabraSecreta = palabras.get(indice);
    }

    @Override
    public String getPalabraOculta() {
        StringBuilder palabraOculta = new StringBuilder();
        for (char letra : palabraSecreta.getPalabra().toCharArray()) {
            if (letrasAdivinadas.getOrDefault(letra, false)) {
                palabraOculta.append(letra);
            } else {
                palabraOculta.append('_');
            }
        }
        return palabraOculta.toString();
    }

    @Override
    public boolean adivinarLetra(char letra) {
        if (palabraSecreta.getPalabra().contains(String.valueOf(letra))) {
            letrasAdivinadas.put(letra, true);
            return true;
        } else {
            letrasIncorrectas.put(letra, true);
            intentosRestantes--;
            return false;
        }
    }

    @Override
    public boolean esVictoria() {
        for (char letra : palabraSecreta.getPalabra().toCharArray()) {
            if (!letrasAdivinadas.getOrDefault(letra, false)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean esDerrota() {
        return intentosRestantes <= 0;
    }

    @Override
    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    @Override
    public Set<Character> getLetrasAdivinadas() {
        return letrasAdivinadas.keySet();
    }

    public Set<Character> getLetrasIncorrectas() {
        return letrasIncorrectas.keySet();
    }

    @Override
    public String getPalabraSecreta() {
        return palabraSecreta.getPalabra();
    }
}
