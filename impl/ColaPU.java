package impl;

import apis.ColaTDA;

public class ColaPU implements ColaTDA {
    int []a;
    int indice;

    @Override
    public void inicializarCola() {
        a = new int [100];
        indice = 0;

    }

    @Override
    public void acolar(int x) {
        for (int i = indice - 1; i >= 0; i--) {// Corrimiento a derecha
            a[i +1] = a[i];
        }
        a[0] = x;
        indice++;
    }

    @Override
    public void desacolar() {
        indice--;

    }

    @Override
    public boolean colaVacia() {
        return (indice == 0);
    }

    @Override
    public int primero() {
        return a[indice - 1];
    }
}
