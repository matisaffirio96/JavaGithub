package impl;

import apis.ConjuntoTDA;

import java.util.Random;

public class ConjuntoTA implements ConjuntoTDA {
    int[] a;
    int cant;

    public void inicializarConjunto() {
        a = new int[100];
        cant = 0;
    }

    public void agregar(int x) {
        if (!this.pertenece(x)) { //this reemplaza por el nombre del objeto
            a[cant] = x;
            cant++;
        }
    }

    public void sacar(int x) {
        int i = 0;// Busco el elemento
        while (i < cant && a[i] != x) {
            i++;
        }
        if (i < cant) {
// Si lo encuentra lo reemplazo por el ultimo y decremento el cant
            a[i] = a[cant - 1];
            cant--;
        }
    }

    public boolean conjuntoVacio() {
        return (cant == 0);
    }

    public int elegir() {
        Random rand = new Random();
        int x;
        x = rand.nextInt(cant);
        return a[x];
    }

    public boolean pertenece(int x) {
        int i = 0;
        while (i < cant && a[i] != x) {
            i++;
        }
        return (i < cant);
    }
}
