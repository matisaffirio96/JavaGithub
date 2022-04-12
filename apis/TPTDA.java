package apis;

import impl.ConjuntoLD;

public interface TPTDA {
    void InicializarDiccionario();

    void Agregar(int var1, int var2);

    void Eliminar(int var1);

    void EliminarValor(int var1, int var2);

    void Recuperar(int var1);

    ColaTDA Claves();

    float PromedioValores(int var1);

    boolean DiccionarioVacio();

    TPTDA HijoIzq();

    TPTDA HijoDer();

    int Raiz();

    void AgregarValor(int var1, int var2);

    ConjuntoLD MoverValores(int var1);
}