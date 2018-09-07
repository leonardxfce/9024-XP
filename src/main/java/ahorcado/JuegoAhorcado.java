package ahorcado;

public class JuegoAhorcado {
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        Jugador jugador = new Jugador();
        String palabra = ahorcado.elegirPalabra();
        ahorcado.palabra = palabra ;
        String letra1 = jugador.ingresarLetra();
        char letraSeleccionada = letra1.charAt(0);
        ahorcado.comprobarLetra(letraSeleccionada);
        
        
    }
}
