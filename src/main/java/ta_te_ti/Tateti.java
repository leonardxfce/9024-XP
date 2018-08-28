package ta_te_ti;

public class Tateti {

    public static void main(String[] args) {
        Jugada jugadas = new Jugada();
        Tablero miTablero = new Tablero();
        int contador = 0;
        while (contador == 9) {
            int valor = jugadas.pedirNumero();
            miTablero.elTablero(valor);
            contador++;
        }

    }
}
