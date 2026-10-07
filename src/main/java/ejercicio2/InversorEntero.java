package ejercicio2;

public class InversorEntero {

    //Complejidad algoritmica O(long n)
    private int invertir(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return invertir(n / 10, reversed * 10 + n % 10);
    }

    public int numeroInvertido(int n) {
        return invertir(n, 0);
    }
}
