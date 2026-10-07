package Utilidades;

public class EsperaDeConsola {

    public static void esperarYLimpiar(int segundos) {
        try {
            // Pausa el programa por la cantidad de segundos especificada
            Thread.sleep(segundos * 1000);

            // Simula una limpieza de consola imprimiendo saltos de línea
            // (Funciona de forma universal en todas las consolas e IDEs)
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
