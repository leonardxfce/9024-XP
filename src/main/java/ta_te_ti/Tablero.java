/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

/**
 *
 * @author ikariRules
 */
public class Tablero {

    String[] campoDeTablero = new String[9];
    int jugador = 1;

    //este metodo define el jugador actual
    public int jugadorActual() {
        return jugador;
    }

    //en este metodo se verifica si la posicion elegida esta marcada
    public boolean verificadorDePosicionOcupada(int posicionIngresadoPorJugador) {
        String contenidoPosicionTablero = campoDeTablero[posicionIngresadoPorJugador];
        boolean banderaPosicionOcupada = false;
        if (contenidoPosicionTablero == null) {
            banderaPosicionOcupada = false;
        } else {
            if (contenidoPosicionTablero.equals("J1")) {
                banderaPosicionOcupada = true;
            }
            if (contenidoPosicionTablero.equals("J2")) {
                banderaPosicionOcupada = true;
            }
        }
        return banderaPosicionOcupada;
    }

    //en este metodo se carga la marca del jugador en la posicion que eligio
    public String marcaDeCadaJugadorEnTablero(int posicionIngresadoPorJugador) {
        String marcaDeCadaJugador = "";
        if (jugador == 1) {
            marcaDeCadaJugador = "J1";
        }
        if (jugador == 2) {
            marcaDeCadaJugador = "J2";
        }
        campoDeTablero[posicionIngresadoPorJugador] = marcaDeCadaJugador;
        return marcaDeCadaJugador;
    }

    //metodo que cambia el jugador actual para que el otro pueda participar
    public int cambioDeJugador() {
        boolean banderaEntrada = false;
        if (jugador == 1) {
            jugador = 2;
            banderaEntrada = true;
        }

        if (jugador == 2 && banderaEntrada == false) {
            jugador = 1;
        }
        return jugador;
    }

    //metodo para devolver el vector con las marcas de los jugadores
    public String[] devolverVector() {
        return campoDeTablero;
    }

    //metodo para verificar el ganador
    public String lineaCompletada() {
        String retorno = null;
        if (campoDeTablero[0] == "J1" && campoDeTablero[1] == "J1" && campoDeTablero[2] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[0] == "J2" && campoDeTablero[1] == "J2" && campoDeTablero[2] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[3] == "J1" && campoDeTablero[4] == "J1" && campoDeTablero[5] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[3] == "J2" && campoDeTablero[4] == "J2" && campoDeTablero[5] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[6] == "J1" && campoDeTablero[7] == "J1" && campoDeTablero[8] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[6] == "J2" && campoDeTablero[7] == "J2" && campoDeTablero[8] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[0] == "J1" && campoDeTablero[3] == "J1" && campoDeTablero[6] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[0] == "J2" && campoDeTablero[3] == "J2" && campoDeTablero[6] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[1] == "J1" && campoDeTablero[4] == "J1" && campoDeTablero[7] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[1] == "J2" && campoDeTablero[4] == "J2" && campoDeTablero[7] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[2] == "J1" && campoDeTablero[5] == "J1" && campoDeTablero[8] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[2] == "J2" && campoDeTablero[5] == "J2" && campoDeTablero[8] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[0] == "J1" && campoDeTablero[4] == "J1" && campoDeTablero[8] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[0] == "J2" && campoDeTablero[4] == "J2" && campoDeTablero[8] == "J2") {
            retorno = "J2";
        }

        if (campoDeTablero[6] == "J1" && campoDeTablero[4] == "J1" && campoDeTablero[2] == "J1") {
            retorno = "J1";
        }
        if (campoDeTablero[6] == "J2" && campoDeTablero[4] == "J2" && campoDeTablero[2] == "J2") {
            retorno = "J2";
        }
        return retorno;
    }

}
