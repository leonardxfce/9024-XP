package ahorcado;

import java.util.ArrayList;

public class Ahorcado {

    public String palabra;
    int letrasRestantes;
    ArrayList<String> conjuntoDePalabra = new ArrayList<>();
    char[] vectorDeChar = new char[4];

    public Ahorcado() {
        this.letrasRestantes = 0;
        this.conjuntoDePalabra.add("buho");
        this.conjuntoDePalabra.add("caso");
        this.conjuntoDePalabra.add("auto");
        this.conjuntoDePalabra.add("gato");
    }

    String elegirPalabra() {
        int tamano = this.conjuntoDePalabra.size() - 1;
        int indice = (int) (Math.random() * tamano);
        String palabraElegida = this.conjuntoDePalabra.get(indice);
        this.conjuntoDePalabra.remove(indice);
        return palabraElegida;
    }

    boolean comprobarLetra(char letra) {
        boolean z = false;

        for (int i = 0; i < this.palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                z = true;
                this.letrasRestantes--;
                this.vectorDeChar[i] = letra;
            }
        }
        return z;
    }

    boolean adivinoLaPalabra() {
        boolean z = false;
        if (this.letrasRestantes == 0) {
            z = true;
        }
        return z;
    }

    String mostrarJuego(String palabra) {
        String acumulador = "";
        for (int i = 0; i < palabra.length(); i++) {
            
                acumulador += "_ ";
            
        }
        return acumulador;
    }

}
