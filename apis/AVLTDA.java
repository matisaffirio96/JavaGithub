package apis;

import impl.NodoAVL;


public interface AVLTDA {
    AVLTDA hijoIzq();

    AVLTDA hijoDer();

    boolean arbolVacio();

    void inicializarArbol();

    void agregarElem(int var1);

    void eliminarElem(int var1);

    int altura();

    int raiz();

    int getFE();

    NodoAVL getNodo();

    void setNodo(NodoAVL var1);
}