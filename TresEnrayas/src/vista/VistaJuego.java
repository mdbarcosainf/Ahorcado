package vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author soledadbarco
 *
 *CLASE PARA LA INTERACCIÓN DEL JUGADOR    
 */

public class VistaJuego {
    private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    //Enseña el mensaje
    public void verMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    //Recibe los distintos tipos de entrada:
    //Entrada para los números
     public int recibeEntrada(String mensaje) throws IOException {
        verMensaje(mensaje);
        return Integer.parseInt(lector.readLine());
    }
    
    //Entrada para el texto
     public String recibeEntradaTexto(String mensaje) throws IOException {
        verMensaje(mensaje);
        return lector.readLine();
    }
}






