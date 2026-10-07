package ejercicio12;

public class SumaMatriz {

    // Complejidad algoritmica: O(m * n) 
    public int calcular(int[][] matriz, int i, int j) {
        if (i == matriz.length) {
            return 0;
        }
        if (j == matriz[i].length) {
            return calcular(matriz, i + 1, 0); // Pasar a la siguiente fila
        }
        return matriz[i][j] + calcular(matriz, i, j + 1);
    }
}
