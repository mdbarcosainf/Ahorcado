package vista;

import java.util.Scanner;
import java.util.Set;

public class VistaAhorcado {
    private Scanner scanner;

    public VistaAhorcado() {
        scanner = new Scanner(System.in);
    }

    public void mostrarInstrucciones() {
        System.out.println("Bienvenido al juego de Ahorcado.");
        System.out.println("Intenta adivinar la palabra secreta letra por letra.");
        System.out.println("Tienes 6 intentos para adivinar la palabra.");
        System.out.println("¡Buena suerte!");
    }

    public void mostrarEstadoJuego(String palabraOculta, int intentosRestantes, Set<Character> letrasAdivinadas, Set<Character> letrasIncorrectas) {
        System.out.println("Palabra: " + palabraOculta);
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.println("Letras adivinadas: " + letrasAdivinadas);
        System.out.println("Letras incorrectas: " + letrasIncorrectas);
    }

    public char solicitarLetra() {
        System.out.print("Adivina una letra: ");
        return scanner.next().charAt(0);
    }

    public void mostrarMensajeVictoria(String palabraSecreta) {
        System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
    }

    public void mostrarMensajeDerrota(String palabraSecreta) {
        System.out.println("¡Has perdido! La palabra era: " + palabraSecreta);
    }

    public boolean jugarNuevamente() {
        System.out.print("¿Quieres jugar otra vez? (s/n): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    public void cerrarScanner() {
        scanner.close();
    }

    public int mostrarMenu() {
        System.out.println("Menú Principal");
        System.out.println("1. Ver Instrucciones");
        System.out.println("2. Jugar");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }
}
