package ejercicio8;

public class CopiadorCadena {

    // Complejidad algoritmica: O(n) donde n es la longitud de la cadena
    public String copiar(String original, int indice) {
        if (indice == original.length()) {
            return "";
        }
        return original.charAt(indice) + copiar(original, indice + 1);
    }
}
