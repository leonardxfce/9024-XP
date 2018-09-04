package ta_te_ti;

public class Tateti {

    public static void main(String[] args) {
        //objetos
        Jugada jugadas = new Jugada();
        Tablero miTablero = new Tablero();
        
        //se comienza el algoritmo
        int contador = 0;
        while (contador == 9) {
            int valor = jugadas.pedirNumero();
            boolean posicionOcupada = miTablero.verificadorDePosicionOcupada(valor);
            if(posicionOcupada == false){
                miTablero.marcaDeCadaJugadorEnTablero(valor);
                miTablero.cambioDeJugador();
            } else {
                System.out.println("la posicion esta ocupada");
            }
            contador++;
        }
        
        String[] tablero = miTablero.devolverVector();
        for(int n = 0; n < 9; n++){
            System.out.println(tablero[n]);
        }

    }
}
