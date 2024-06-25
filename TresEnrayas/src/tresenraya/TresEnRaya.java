package tresenraya;

import modelo.TableroJuego;
import vista.VistaJuego;

/**
 *
 * @author soledadbarco
 */

public class TresEnRaya{
    public static void main(String[] args) throws IOException {
        VistaJuego vista = new VistaJuego();
        Menu menu = new Menu(vista);
        menu.verMenuPrincipal();
        
        TableroJuego tablero = new TableroJuego();
    }
}
