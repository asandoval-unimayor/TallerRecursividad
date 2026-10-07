package ejercicio13;

public class Fibonacci {

    // Complejidad algoritmica: O(2^n)
    public int calcular(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calcular(n - 1) + calcular(n - 2);
    }
}
