package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author soledadbarco
 *
 * CLASE PARA LA PLANTILLA DE UN TABLERO 
 */

public abstract class TableroPlantilla implements Tablero {
    protected char[][] casillas;
    protected List<Posicion> movimientos;

    //Tamaño(n columnas y filas)
      public TableroPlantilla(int tam) {
        casillas = new char[tam][tam];
        movimientos = new ArrayList<>();
        limpiar();
    }

@Override
    public void limpiar() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = ' ';
            }
        }
        movimientos.clear();
    }
       /*
    @Override
    public boolean quitar(Posicion pos, char c) {
        if (casillas[pos.getLugar()[0]][pos.getLugar()[1]] != c)
            return false;
        else {
            casillas[pos.getLugar()[0]][pos.getLugar()[1]] = ' ';
            movimientos.remove(pos);
            return true;
        }
    }*/

//muestra el tablero
@Override
    public void ver() {
      int i, j;
        System.out.println("\n   |   |   ");
        System.out.println(" "+casillas[0][0]+" | "+casillas[0][1]+" | "+casillas[0][2]);
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" "+casillas[1][0]+" | "+casillas[1][1]+" | "+casillas[1][2]);
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" "+casillas[2][0]+" | "+casillas[2][1]+" | "+casillas[2][2]);
        System.out.println("___|___|___");
    }

 @Override
    public boolean poner(Posicion pos, char pieza) {
        if (casillas[pos.getLugar()[0]][pos.getLugar()[1]] != ' ') {
            return false;
        } else {
            casillas[pos.getLugar()[0]][pos.getLugar()[1]] = pieza;
            movimientos.add(pos);
            return true;
        }
    }
//comprueba que hace 3 en raya
@Override
    public abstract boolean tresEnRaya();

 @Override
    public boolean lleno() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}