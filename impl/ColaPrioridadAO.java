package impl;

import apis.ColaPrioridadTDA;

public class ColaPrioridadAO implements ColaPrioridadTDA {
    class Elemento {
        int valor;
        int prioridad;
    }

    Elemento[] elementos; // int[] elementos
    int indice;

    public void inicializarCola() {
        indice = 0;
        elementos = new Elemento[100]; // new int[100]
    }

    public void acolarPrioridad(int x, int prioridad) {
        int j = indice;
    //desplaza a derecha los eleentos de la cola mientras
    //estos tengan mayor o igual prioridad
        for (; j > 0 && elementos[j - 1].prioridad >= prioridad; j--) {
            elementos[j] = elementos[j - 1];
        }
        elementos[j] = new Elemento();
        elementos[j].valor = x;
        elementos[j].prioridad = prioridad;
        indice++;
    }

    public void desacolar() {
        elementos[indice - 1] = null;
        indice--;
    }

    public boolean colaVacia() {
        return (indice == 0);
    }

    public int primero() {
        return elementos[indice - 1].valor;
    }

    public int prioridad() {
        return elementos[indice - 1].prioridad;
    }
}
