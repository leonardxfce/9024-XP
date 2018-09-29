package ahorcado;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class InicioAhorcado {

    public void jugar(Logger logger, Scanner tecladoDelUsuario) {

        Ahorcado ahorcado = new Ahorcado();
        Jugador jugador = new Jugador(tecladoDelUsuario);
        ahorcado.agregarPalabras();

        do {
            String palabra = ahorcado.elegirPalabra();
            ahorcado.palabra = palabra;
            ahorcado.letrasRestantes = ahorcado.palabra.length();
            ahorcado.datosAhorcado(); //le asigna valor necesarios a atributos de la clase

            logger.debug("Tienes: " + jugador.vidas + " vidas");

            while (!ahorcado.adivinoLaPalabra() && jugador.comprobarVidas()) {
                logger.debug(">>>>" + ahorcado.mostrarJuego() + " <<<<");
                logger.debug("Ingrese una letra: ");
                String letraIngresada = jugador.ingresarLetra();

                boolean comprobacion = ahorcado.comprobarExistenciaDeLetra(letraIngresada);

                if (comprobacion) {
                    char letraSeleccionada = letraIngresada.charAt(0);
                    boolean letraPresente = ahorcado.comprobarLetra(letraSeleccionada);

                    if (letraPresente) {
                        logger.debug("¡la letra está presente! :)");
                        logger.debug("Tienes: " + jugador.vidas + " vidas");
                        ahorcado.adivinoLaPalabra();
                    } else {
                        logger.debug("la letra no está presente :(");
                        jugador.restarVida(letraPresente);
                        logger.debug("Tienes: " + jugador.vidas + " vidas");
                    }
                } else {
                    logger.debug("ya ingresó esta letra");
                }
            }
            if (ahorcado.adivinoLaPalabra()) {
                logger.debug(">>>>" + ahorcado.palabra + "<<<<");
                logger.debug("HAS ADIVINADO LA PALABRA!! 7w7");
            }
            if (!jugador.comprobarVidas()) {
                logger.debug("La palabra era: " + ahorcado.palabra);
                logger.debug("TE HAS QUEDADO SIN VIDAS (˘_˘٥)");
            }
        } while (!ahorcado.conjuntoDePalabras.isEmpty() && jugador.comprobarVidas());
    }
}
