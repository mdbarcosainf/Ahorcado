package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author soledadbarco
 * 
 * CLASE PARA EL TABLERO DEL JUEGO
 */

public class TableroJuego extends TableroPlantilla {
    private Map<String, Integer> victorias = new HashMap<>();

    public TableroJuego() {
        super(3); //para que sea un tablero de 3 por 3.
    }

     //Comprobamos que se ha hecho tres en raya
    @Override
    public boolean tresEnRaya() {
        for (int i = 0; i < 3; i++) {
            if (casillas[i][0] == casillas[i][1] && casillas[i][0] == casillas[i][2] && casillas[i][0] != ' ') return true;
            if (casillas[0][i] == casillas[1][i] && casillas[0][i] == casillas[2][i] && casillas[0][i] != ' ') return true;
        }
        if (casillas[0][0] == casillas[1][1] && casillas[0][0] == casillas[2][2] && casillas[0][0] != ' ') return true;
        if (casillas[0][2] == casillas[1][1] && casillas[0][2] == casillas[2][0] && casillas[0][2] != ' ') return true;
        return false;
    }
    
 
    //Añade la victoria al jugador que ha ganado
    public void aniadirVictoria(String nombre) {
        victorias.put(nombre, victorias.getOrDefault(nombre, 0) + 1);
    }
    
    //Recibe las victorias
    public Map<String, Integer> getVictorias() {
        return victorias;
    }

}
