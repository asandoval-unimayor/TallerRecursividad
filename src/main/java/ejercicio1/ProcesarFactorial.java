package ejercicio1;

public class ProcesarFactorial {

    //Complejidad algoritmica O(n)
    public long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No hay factorial para numeros negativos");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}
