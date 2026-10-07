package ejercicio7;

public class CalculadoraMCD {

    // Complejidad algoritmica: O(log(min(a, b)))
    public int calcular(int m, int n) {
        if (n == 0) {
            return m;
        }
        return calcular(n, m % n);
    }
}
