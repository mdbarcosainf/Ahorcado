package controlador;

import modelo.ModeloAhorcado;
import vista.VistaAhorcado;

public class ControladorAhorcado {
    private ModeloAhorcado modelo;
    private VistaAhorcado vista;

    public ControladorAhorcado(ModeloAhorcado modelo, VistaAhorcado vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    vista.mostrarInstrucciones();
                    break;
                case 2:
                    jugar();
                    break;
                case 3:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private void jugar() {
        while (!modelo.esVictoria() && !modelo.esDerrota()) {
            vista.mostrarEstadoJuego(modelo.getPalabraOculta(), modelo.getIntentosRestantes(), modelo.getLetrasAdivinadas(), modelo.getLetrasIncorrectas());
            char letra = vista.solicitarLetra();
            modelo.adivinarLetra(letra);
        }
        if (modelo.esVictoria()) {
            vista.mostrarMensajeVictoria(modelo.getPalabraSecreta());
        } else {
            vista.mostrarMensajeDerrota(modelo.getPalabraSecreta());
        }
        if (vista.jugarNuevamente()) {
            modelo = new ModeloAhorcado();
            jugar();
        } else {
            vista.cerrarScanner();
        }
    }
}
