package ejercicio11;

public class SumaArreglo {

    // Complejidad algoritmica: O(n)
    public int calcular(int[] arreglo, int n) {
        if (n <= 0) {
            return 0;
        }
        return calcular(arreglo, n - 1) + arreglo[n - 1];
    }
}
