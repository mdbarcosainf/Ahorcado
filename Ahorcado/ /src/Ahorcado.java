import controlador.ControladorAhorcado;
import modelo.ModeloAhorcado;
import vista.VistaAhorcado;

public class Ahorcado {
    public static void main(String[] args) {
        ModeloAhorcado modelo = new ModeloAhorcado();
        VistaAhorcado vista = new VistaAhorcado();
        ControladorAhorcado controlador = new ControladorAhorcado(modelo, vista);
        controlador.iniciar();
    }
}
