import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author soledadbarco
 */

public class TableroJuego implements Tablero {
    private char[][] casillas = new char[3][3];
    private List<Posicion> movimientos = new ArrayList<>();
    private Map<String, Integer> victorias = new HashMap<>();

    public TableroJuego() {
        limpiar();
    }

    @Override
    public void limpiar() {
        int i, j;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                casillas[i][j] = ' ';
        movimientos.clear();
    }

    @Override
    public void ver() {
        System.out.println("\n   |   |   ");
        System.out.println(" " + casillas[0][0] + " | " + casillas[0][1] + " | " + casillas[0][2]);
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + casillas[1][0] + " | " + casillas[1][1] + " | " + casillas[1][2]);
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + casillas[2][0] + " | " + casillas[2][1] + " | " + casillas[2][2]);
        System.out.println("   |   |   ");
    }

    @Override
    public boolean poner(Posicion pos, char c) {
        if (casillas[pos.getLugar()[0]][pos.getLugar()[1]] != ' ')
            return false;
        else {
            casillas[pos.getLugar()[0]][pos.getLugar()[1]] = c;
            movimientos.add(pos);
            return true;
        }
    }

    @Override
    public boolean quitar(Posicion pos, char c) {
        if (casillas[pos.getLugar()[0]][pos.getLugar()[1]] != c)
            return false;
        else {
            casillas[pos.getLugar()[0]][pos.getLugar()[1]] = ' ';
            movimientos.remove(pos);
            return true;
        }
    }

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

    @Override
    public boolean lleno() {
        int i, j;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                if (casillas[i][j] == ' ')
                    return false;
        return true;
    }

    public void registrarVictoria(String nombre) {
        victorias.put(nombre, victorias.getOrDefault(nombre, 0) + 1);
    }

    public Map<String, Integer> getVictorias() {
        return victorias;
    }
}
