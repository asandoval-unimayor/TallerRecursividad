package ejercicio6;

public class Potencia {

    // Complejidad algoritmica: O(n) donde n es el exponente
    public long calcular(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            throw new IllegalArgumentException("No se admiten exponentes negativos en esta implementacion entera");
        }
        return base * calcular(base, exponente - 1);
    }
}
