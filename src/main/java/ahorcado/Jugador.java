package ahorcado;

import java.util.Scanner;

public class Jugador {

    String nombre;
    int vidas;
    Scanner read;

    public Jugador(Scanner tecladoDelUsuario) {
        this.read = tecladoDelUsuario;
        this.vidas = 10;
    }

    String ingresarLetra() {
        String letra = this.read.next();
        return letra;
    }

    void restarVida(boolean z) {
        if (!z) {
            this.vidas--;
        }
    }

    boolean comprobarVidas() {
        boolean estado = true;
        if (this.vidas == 0) {
            estado = false;
        }
        return estado;
    }

}
