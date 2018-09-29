/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * @author caro_
 */
public class InicioPiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public void jugar(Logger logger, Scanner tecladoDelUsuario) {
        Scanner leer = tecladoDelUsuario;
        String dato;
        int numA;
        int puntos = 0;
        logger.debug("******** PIEDRA, PAPEL O TIJERA ********");
        logger.debug("----------------REGLAS------------------");
        logger.debug("#Ingresar todas las opciones(piedra,papel,tijera) en imprenta minuscula");
        logger.debug("----------------------------------------");
        Usuario c = new Usuario();
        JugadaComputadora nuevaJugada = new JugadaComputadora();

        ComprobarJugada comp = new ComprobarJugada();

        int rastrear;
        String result;
        String resultFinal = "";
        boolean bandera = false;
        String[] posibilidades = {"tijera", "piedra", "papel"};
        for (int i = 0; i < 3; i++) {
            numA = nuevaJugada.aleatorio();
            logger.debug("Ingrese su opción: ");
            dato = leer.nextLine();
            for (int j = 0; j < 3; j++) {
                if (dato.equals(posibilidades[j])) {
                    bandera = true;
                }
            }

            if (bandera == true) {
                String resultado1 = comp.computadoraResult(numA);
                logger.debug(resultado1);
                result = comp.comprobar(numA, dato);
                logger.debug("Usted " + result);

                if (result == "gano") {
                    puntos++;
                }
                rastrear = c.quitarVidas(i);
                logger.debug("vidas = " + rastrear);
                bandera = false;
            } else {
                logger.debug("La opción ingresada es incorrecta");
                i--;
            }
            logger.debug("*************************************");
        }
        logger.debug("Tiene " + puntos + " puntos");
        if (puntos >= 2) {
            resultFinal = "gano";
        } else {
            resultFinal = "perdio";
        }
        logger.debug("RESULTADO FINAL: " + resultFinal);

        BaseDeDatos nuevo = new BaseDeDatos();
        nuevo.conexionEjemplo(puntos);
    }

}
