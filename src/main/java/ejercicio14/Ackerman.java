package ejercicio14;

public class Ackerman {

    // Complejidad algoritmica: O(A(m,n)) exponencialmente anidada
    public long calcular(long m, long n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcular(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return calcular(m - 1, calcular(m, n - 1));
        }
        return 0;
    }
}
