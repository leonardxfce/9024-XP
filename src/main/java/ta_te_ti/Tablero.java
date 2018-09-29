/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

/**
 * @author ikariRules
 */
public class Tablero {

    String[] campoDeTablero = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String marca[] = {"J1", "J2"};
    boolean banderaPosicionOcupada;
    int jugador = 1;

    //este metodo define el jugador actual
    public int jugadorActual() {
        return jugador;
    }

    //en este metodo se verifica si la posicion elegida esta marcada
    public boolean verificadorDePosicionOcupada(int posicionIngresadoPorJugador) {
        String contenidoPosicionTablero = campoDeTablero[posicionIngresadoPorJugador];
        String valorDelTablero = Integer.toString(posicionIngresadoPorJugador + 1);
        if (contenidoPosicionTablero.equals(valorDelTablero)) {
            banderaPosicionOcupada = false;
        } else {
            if (contenidoPosicionTablero.equals("J1") || (contenidoPosicionTablero.equals("J2"))) {
                banderaPosicionOcupada = true;
            }
        }
        return banderaPosicionOcupada;
    }

    //en este metodo se carga la marca del jugador en la posicion que eligio
    public String marcaDeCadaJugadorEnTablero(int posicionIngresadoPorJugador) {
        String marcaDeCadaJugador = "";
        if (jugador == 1) {
            marcaDeCadaJugador = marca[0];
        }
        if (jugador == 2) {
            marcaDeCadaJugador = marca[1];
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

        if (jugador == 2 && !banderaEntrada) {
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
        int cont = 0;
        while (cont < 2) {
            if (campoDeTablero[0] == marca[cont] && campoDeTablero[1] == marca[cont] && campoDeTablero[2] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[3] == marca[cont] && campoDeTablero[4] == marca[cont] && campoDeTablero[5] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[6] == marca[cont] && campoDeTablero[7] == marca[cont] && campoDeTablero[8] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[0] == marca[cont] && campoDeTablero[3] == marca[cont] && campoDeTablero[6] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[1] == marca[cont] && campoDeTablero[4] == marca[cont] && campoDeTablero[7] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[2] == marca[cont] && campoDeTablero[5] == marca[cont] && campoDeTablero[8] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[0] == marca[cont] && campoDeTablero[4] == marca[cont] && campoDeTablero[8] == marca[cont]) {
                retorno = marca[cont];
            }
            if (campoDeTablero[6] == marca[cont] && campoDeTablero[4] == marca[cont] && campoDeTablero[2] == marca[cont]) {
                retorno = marca[cont];
            }
            cont++;
        }
        return retorno;
    }

    //metodo que imprime en pantalla el metodo actual
    public String escribirElJugadorActual(int dato) {
        String retorno = "";
        if (dato == 1) {
            retorno = "Juega el primer jugador";
        }
        if (dato == 2) {
            retorno = "Juega el segundo jugador";
        }
        System.err.println(retorno);
        return retorno;
    }

    public String escribirElJugadoVsPC(int dato) {
        String retorno = "";
        if (dato == 1) {
            retorno = "Juega el primer jugador";
        }
        if (dato == 2) {
            retorno = "Juega el segundo jugador";
        }
        System.err.println(retorno);
        return retorno;
    }

    //metodo que en vase a lo que no dice el metodo verificadorDePosicionOcupada 
    //imprimira en pantalla el metodo correspondiente
    public String escribirPosicionOcupadaDesocupada(boolean dato) {
        String retorno = "";
        if (dato) {
            retorno = "La posicion elegida esta ocupada";
        }
        System.err.println(retorno);
        return retorno;
    }

    //metodo que imprime en pantalla el jugador ganador
    public String escribirJugadorGanador(String dato) {
        String retorno = "";
        if (dato == "J1") {
            retorno = "Gano el jugador 1";
        }
        if (dato == "J2") {
            retorno = "Gano el jugador 2";
        }
        System.err.println(retorno);
        return retorno;
    }

    //metodo que muestra el tablero en la consola
    public void tablero() {
        System.err.println("----------------------------------");
        System.err.println("|          |          |          |");
        System.err.println("|    " + campoDeTablero[0] + "    |    " + campoDeTablero[1] + "    |    " + campoDeTablero[2] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");
        System.err.println("|          |          |          |");
        System.err.println("|    " + campoDeTablero[3] + "    |    " + campoDeTablero[4] + "    |    " + campoDeTablero[5] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");
        System.err.println("|          |          |          |");
        System.err.println("|    " + campoDeTablero[6] + "    |    " + campoDeTablero[7] + "    |    " + campoDeTablero[8] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");

    }

}
