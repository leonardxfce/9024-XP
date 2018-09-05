package ta_te_ti;

import java.util.Scanner;

public class Tateti {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Tablero miTablero = new Tablero();
        int contador = 0;
        boolean bandera = false;
        //comienza el algoritmo
        String ganador = null;
        while (contador != 9 && bandera == false) {
            miTablero.escribirElJugadorActual(miTablero.jugadorActual());
            boolean salida = false;
            do {
                int ingreso = tecla.nextInt();
                String ocupado = miTablero.escribirPosicionOcupadaDesocupada(miTablero.verificadorDePosicionOcupada(ingreso - 1));
                if (ocupado == "") {
                    miTablero.marcaDeCadaJugadorEnTablero(ingreso - 1);
                    salida = true;
                }
            } while(salida == false);
            miTablero.cambioDeJugador();
            ganador = miTablero.lineaCompletada();
            if (ganador != null) {
                bandera = true;
            }
            contador++;
        }
        miTablero.escribirJugadorGanador(miTablero.lineaCompletada());

    }
}
