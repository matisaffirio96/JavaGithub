package impl;

import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;

public class DicSimpleA implements DiccionarioSimpleTDA {
    class Elemento {
        int clave;
        int valor;
    }

    Elemento[] elementos;
    int cant;

    public void inicializarDiccionario() {
        cant = 0;
        elementos = new Elemento[100];
    }

    public void agregar(int clave, int valor) {
        int pos = Clave2Indice(clave);
        if (pos == -1) {// Si no está la clave, la agrega
            pos = cant;
            elementos[pos] = new Elemento();
            elementos[pos].clave = clave;
            cant++;
        }
        elementos[pos].valor = valor;//Actualizo valor
    }

    public void eliminar(int clave) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            elementos[pos] = elementos[cant - 1];
            cant--;
        }
    }

    public int recuperar(int clave) {
        int pos = Clave2Indice(clave);
        return elementos[pos].valor;
    }

    public ConjuntoTA claves() {
        ConjuntoTA c = new ConjuntoTA();
        c.inicializarConjunto();
        for (int i = 0; i < cant; i++) {
            c.agregar(elementos[i].clave);
        }
        return c;
    }

    private int Clave2Indice(int clave) {
        int i = cant - 1;
        while (i >= 0 && elementos[i].clave != clave) {
            i--;
        }
        return i;
    }
}
