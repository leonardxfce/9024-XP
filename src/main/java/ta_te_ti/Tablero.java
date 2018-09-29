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
        return this.jugador;
    }

    //en este metodo se verifica si la posicion elegida esta marcada
    public boolean verificadorDePosicionOcupada(int posicionIngresadoPorJugador) {
        String contenidoPosicionTablero = this.campoDeTablero[posicionIngresadoPorJugador];
        String valorDelTablero = Integer.toString(posicionIngresadoPorJugador + 1);
        if (contenidoPosicionTablero.equals(valorDelTablero)) {
            this.banderaPosicionOcupada = false;
        } else {
            if (contenidoPosicionTablero.equals("J1") || (contenidoPosicionTablero.equals("J2"))) {
                this.banderaPosicionOcupada = true;
            }
        }
        return this.banderaPosicionOcupada;
    }

    //en este metodo se carga la marca del jugador en la posicion que eligio
    public String marcaDeCadaJugadorEnTablero(int posicionIngresadoPorJugador) {
        String marcaDeCadaJugador = "";
        if (this.jugador == 1) {
            marcaDeCadaJugador = this.marca[0];
        }
        if (this.jugador == 2) {
            marcaDeCadaJugador = this.marca[1];
        }
        this.campoDeTablero[posicionIngresadoPorJugador] = marcaDeCadaJugador;
        return marcaDeCadaJugador;
    }

    //metodo que cambia el jugador actual para que el otro pueda participar
    public int cambioDeJugador() {
        boolean banderaEntrada = false;
        if (this.jugador == 1) {
            this.jugador = 2;
            banderaEntrada = true;
        }

        if (this.jugador == 2 && !banderaEntrada) {
            this.jugador = 1;
        }
        return this.jugador;
    }

    //metodo para devolver el vector con las marcas de los jugadores
    public String[] devolverVector() {
        return this.campoDeTablero;
    }

    //metodo para verificar el ganador
    public String lineaCompletada() {
        String retorno = null;
        int cont = 0;
        while (cont < 2) {
            if (this.campoDeTablero[0] == this.marca[cont] && this.campoDeTablero[1] == this.marca[cont] && this.campoDeTablero[2] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[3] == this.marca[cont] && this.campoDeTablero[4] == this.marca[cont] && this.campoDeTablero[5] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[6] == this.marca[cont] && this.campoDeTablero[7] == this.marca[cont] && this.campoDeTablero[8] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[0] == this.marca[cont] && this.campoDeTablero[3] == this.marca[cont] && this.campoDeTablero[6] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[1] == this.marca[cont] && this.campoDeTablero[4] == this.marca[cont] && this.campoDeTablero[7] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[2] == this.marca[cont] && this.campoDeTablero[5] == this.marca[cont] && this.campoDeTablero[8] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[0] == this.marca[cont] && this.campoDeTablero[4] == this.marca[cont] && this.campoDeTablero[8] == this.marca[cont]) {
                retorno = this.marca[cont];
            }
            if (this.campoDeTablero[6] == this.marca[cont] && this.campoDeTablero[4] == this.marca[cont] && this.campoDeTablero[2] == this.marca[cont]) {
                retorno = this.marca[cont];
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
        System.err.println("|    " + this.campoDeTablero[0] + "    |    " + this.campoDeTablero[1] + "    |    " + this.campoDeTablero[2] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");
        System.err.println("|          |          |          |");
        System.err.println("|    " + this.campoDeTablero[3] + "    |    " + this.campoDeTablero[4] + "    |    " + this.campoDeTablero[5] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");
        System.err.println("|          |          |          |");
        System.err.println("|    " + this.campoDeTablero[6] + "    |    " + this.campoDeTablero[7] + "    |    " + this.campoDeTablero[8] + "    |");
        System.err.println("|          |          |          |");
        System.err.println("----------------------------------");

    }

}
