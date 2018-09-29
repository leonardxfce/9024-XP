package menu;

import ahorcado.InicioAhorcado;
import numero_magico.InicioNumeroMagico;
import org.apache.log4j.Logger;
import piedra_papel_tijera.InicioPiedraPapelTijera;
import ta_te_ti.InicioTateti;

import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Inicio.class);
        Scanner scanner = new Scanner(System.in);
        int userN;
        do {
            logger.debug("---------------------------------------");
            logger.debug("Bienvenido a los juegos del IES 9024:");
            logger.debug("Elija su juego preferido");
            logger.debug("1 - Numero Magico");
            logger.debug("2 - Ta-Te-Ti");
            logger.debug("3 - Piedra Papel Tijera");
            logger.debug("4 - Ahorcado");
            logger.debug("0 - Salir");
            userN = scanner.nextInt();
            chooseGame(userN, logger, scanner);
        } while (userN != 0);
    }

    private static void chooseGame(int userN, Logger logger, Scanner tecladoDelUsuario) {
        if (userN == 1) {
            InicioNumeroMagico numeroMagico = new InicioNumeroMagico();
            numeroMagico.jugar(logger, tecladoDelUsuario);
        }
        if (userN == 2) {
            InicioTateti tateti = new InicioTateti();
            tateti.jugar(logger, tecladoDelUsuario);
        }
        if (userN == 3) {
            InicioPiedraPapelTijera piedraPapelTijera = new InicioPiedraPapelTijera();
            piedraPapelTijera.jugar(logger, tecladoDelUsuario);
        }
        if (userN == 4) {
            InicioAhorcado ahorcado = new InicioAhorcado();
            ahorcado.jugar(logger, tecladoDelUsuario);
        }
    }

}


    