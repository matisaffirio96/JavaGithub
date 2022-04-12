package impl;

import apis.PilaTDA;

public class PilaTF implements PilaTDA {
    int[] a;
    int indice;

    @Override
    public void inicializarPila() {
        a = new int[100];
        indice = 0;
    }

    @Override
    public void apilar(int x) {
        a[indice] = x;
        indice++;
    }

    @Override
    public void desapilar() {
        indice--;
    }


    public boolean pilaVacia(){
        return (indice == 0);
    }

    @Override
    public int tope() {
        return (a[indice-1]);
    }
}
