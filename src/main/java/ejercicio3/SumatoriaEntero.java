package ejercicio3;

public class SumatoriaEntero {

    //Complejidad Algortimica O(n)
    public double calcular(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + calcular(n - 1);
    }
}
