package ejercicio4;

public class SumaDigitos {

    //Complejidad Algoritmica O(long n)
    public int sumarDigitos(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumarDigitos(n / 10);
    }

}
