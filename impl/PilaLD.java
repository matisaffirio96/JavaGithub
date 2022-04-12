package impl;

import apis.PilaTDA;

public class PilaLD implements PilaTDA {
    Nodo tope;

    public PilaLD() {

    }

    public void inicializarPila() {
        this.tope = null;
    }

    public void apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = this.tope;
        this.tope = nuevo;
    }

    public void desapilar() {
        this.tope = this.tope.sig;
    }

    public boolean pilaVacia() {
        return this.tope == null;
    }

    public int tope() {
        return this.tope.info;
    }
}
