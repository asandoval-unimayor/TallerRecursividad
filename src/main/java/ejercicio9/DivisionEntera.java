package ejercicio9;

public class DivisionEntera {

    // Complejidad algoritmica: O(n)
    public int calcular(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + calcular(dividendo - divisor, divisor);
    }
}
