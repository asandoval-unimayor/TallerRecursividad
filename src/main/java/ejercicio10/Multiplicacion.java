package ejercicio10;

public class Multiplicacion {

    // Complejidad algoritmica: O(n) 
    public int calcular(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            return -a + calcular(a, b + 1); 
        }
        return a + calcular(a, b - 1);
    }
}
