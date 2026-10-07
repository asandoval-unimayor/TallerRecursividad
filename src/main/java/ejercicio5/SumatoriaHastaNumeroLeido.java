package ejercicio5;

public class SumatoriaHastaNumeroLeido {
    
//complejidad algoritmica O(n)    
    public int calcular(int n) {
        if (n <= 0) return 0;
        return n + calcular(n - 1);
    }
}
