package ahorcado;

import java.util.Scanner;

public class Jugador {

    String nombre;
    int vidas;
    Scanner read;

    public Jugador(Scanner tecladoDelUsuario) {
        read = tecladoDelUsuario;
        vidas = 10;
    }

    String ingresarLetra() {
        String letra = read.next();
        return letra;
    }

    void restarVida(boolean z) {
        if (!z) {
            vidas--;
        }
    }

    boolean comprobarVidas() {
        boolean estado = true;
        if (vidas == 0) {
            estado = false;
        }
        return estado;
    }

}
