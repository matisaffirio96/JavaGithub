package impl;

import apis.PilaTDA;

public class PilaTI implements PilaTDA {
    int[] a;
    int indice;

    @Override
    public void inicializarPila() {
        a = new int[100];
        indice = 0;
    }

    @Override
    public void apilar(int x) {
        for(int i = indice -1;i>=0;i--){// Corriemiento a derecha
            a[i+1] = a[i];
        }
        a[0] = x;
        indice++;
    }

    @Override
    public void desapilar() {
        for(int i = 0;i<indice;i++) {// Corriemiento a izquierda
            a[i] = a[i+1];
        }
        indice--;
    }

    @Override
    public boolean pilaVacia() {
        return (indice==0);
    }

    @Override
    public int tope() {
        return a[0];
    }
}
