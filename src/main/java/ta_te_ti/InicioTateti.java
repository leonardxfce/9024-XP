package ta_te_ti;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class InicioTateti {

    public void jugar(Logger logger, Scanner tecladoDelUsuario) {
        Scanner tecla = tecladoDelUsuario;
        Tablero miTablero = new Tablero();
        int contador = 0;
        boolean bandera = false;
        //comienza el algoritmo
        System.out.println("¿Jugara contra la maquina o contra otra persona?");
        System.out.println("responda 1 para jugar contra la maquina y 2 para jugar con alguien mas:");
        int respuesta = tecla.nextInt();

        if (respuesta == 1) {
            this.todoAleatorio(contador, bandera, miTablero, tecla);
        }

        if (respuesta == 2) {
            this.todo(contador, bandera, miTablero, tecla);
        }

    }

    private void todoAleatorio(int contador, boolean bandera, Tablero miTablero, Scanner tecla) {
        IA tuIA = new IA();
        String ganador = null;
        while (contador != 9 && bandera == false) {
            miTablero.tablero();
            String jugadorActual = miTablero.escribirElJugadorActual(miTablero.jugadorActual());
            boolean salida = false;
            boolean intermedio = false;
            do {
                int ingreso = 0;
                String ocupado = "";
                if (jugadorActual.equals("Juega el segundo jugador")) {
                    ingreso = tuIA.alatoriedad();
                } else {
                    ingreso = tecla.nextInt();
                }
                intermedio = miTablero.verificadorDePosicionOcupada(ingreso - 1);
                ocupado = miTablero.escribirPosicionOcupadaDesocupada(intermedio);

                if (intermedio == false) {
                    miTablero.marcaDeCadaJugadorEnTablero(ingreso - 1);
                    salida = true;
                }
            } while (salida == false);
            miTablero.cambioDeJugador();
            ganador = miTablero.lineaCompletada();
            if (ganador != null) {
                bandera = true;
            }
            contador++;
        }
        miTablero.tablero();
        miTablero.escribirJugadorGanador(miTablero.lineaCompletada());
    }

    private void todo(int contador, boolean bandera, Tablero miTablero, Scanner tecla) {
        String ganador = null;
        while (contador != 9 && bandera == false) {
            miTablero.tablero();
            miTablero.escribirElJugadorActual(miTablero.jugadorActual());
            boolean salida = false;
            boolean intermedio = false;
            do {
                String ocupado = "";
                int ingreso = tecla.nextInt();
                intermedio = miTablero.verificadorDePosicionOcupada(ingreso - 1);
                ocupado = miTablero.escribirPosicionOcupadaDesocupada(intermedio);

                if (intermedio == false) {
                    miTablero.marcaDeCadaJugadorEnTablero(ingreso - 1);
                    salida = true;
                }
            } while (salida == false);
            miTablero.cambioDeJugador();
            ganador = miTablero.lineaCompletada();
            if (ganador != null) {
                bandera = true;
            }
            contador++;
        }
        miTablero.tablero();
        miTablero.escribirJugadorGanador(miTablero.lineaCompletada());
    }
}
