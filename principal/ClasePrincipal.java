package principal;

import apis.PilaTDA;
import impl.PilaTF;

public class ClasePrincipal {
    public static void main(String[] args) {
        PilaTDA pila = new PilaTF();
        pila.inicializarPila();
        pila.apilar(1);
        pila.apilar(4);

        while (!pila.pilaVacia()){
            System.out.println(pila.tope());
            pila.desapilar();
        }
    }
}
