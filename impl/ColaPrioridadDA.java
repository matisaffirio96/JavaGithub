package impl;

import apis.ColaPrioridadTDA;
import apis.ColaTDA;

public class ColaPrioridadDA implements ColaPrioridadTDA {
    int [] elementos;
    int [] prioridades;
    int indice;

    @Override
    public void inicializarCola() {
        elementos = new int[100];
        prioridades = new int[100];
        indice = 0;
    }

    @Override
    public void acolarPrioridad(int x, int prioridad) {
        int j = indice;
// Encuentra lugar donde acolar al nuevo elemento desplazando a derecha
        for (; j > 0 && prioridades[j - 1] >= prioridad; j--) {
            elementos[j] = elementos[j - 1];// Desplazo a derecha
            prioridades[j] = prioridades[j - 1];// Desplazo a derecha }
            elementos[j] = x;
            prioridades[j] = prioridad;
            indice++;
        }
    }

    @Override
    public void desacolar() {
        indice--;
    }

    @Override
    public boolean colaVacia() {
        return (indice==0);
    }

    @Override
    public int primero() {
        return elementos[indice-1];
    }

    @Override
    public int prioridad() {
        return prioridades[indice-1];
    }
}
