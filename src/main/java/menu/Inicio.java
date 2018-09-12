package menu;

import ahorcado.InicioAhorcado;
import java.util.Scanner;
import numero_magico.InicioNumeroMagico;
import org.apache.log4j.Logger;
import piedra_papel_tijera.InicioPiedraPapelTijera;
import ta_te_ti.InicioTateti;

public class Inicio {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Inicio.class);
        Scanner numUsuario = new Scanner(System.in);
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
            userN = numUsuario.nextInt();
            if (userN == 1) {
                InicioNumeroMagico numeroMagico = new InicioNumeroMagico();
                numeroMagico.jugar(logger);
            }
            if (userN == 2) {
                InicioTateti tateti = new InicioTateti();
                tateti.jugar(logger);
            }
            if (userN == 3) {
                InicioPiedraPapelTijera piedraPapelTijera = new InicioPiedraPapelTijera();
                piedraPapelTijera.jugar(logger);
            }
            if (userN == 4) {
                InicioAhorcado ahorcado = new InicioAhorcado();
                ahorcado.jugar(logger);
            }
        } while (userN != 0);
    }

}


    