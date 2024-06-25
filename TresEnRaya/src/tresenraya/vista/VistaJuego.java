package vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author soledadbarco
 */

public class VistaJuego {
    private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public void verMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerEntrada(String mensaje) throws IOException {
        verMensaje(mensaje);
        return Integer.parseInt(lector.readLine());
    }

    public String obtenerEntradaTexto(String mensaje) throws IOException {
        verMensaje(mensaje);
        return lector.readLine();
    }
}






