package impl;

import apis.ColaTDA;

public class ColaPI implements ColaTDA {
    int [] a;
    int indice;
    @Override
    public void inicializarCola() {
        a = new int[100];
        indice = 0;
    }
    public void acolar(int x) {
        a[indice] = x;
        indice++;
    }
    public void desacolar() {
        for(int i = 0;i<indice-1;i++) {//Corrimiento a izquierda
            a[i] = a[i+1];
        }
        indice--;
    }
    public boolean colaVacia(){
        return (indice == 0);
    }
    public int primero() {
        return a[0];
    }
}
