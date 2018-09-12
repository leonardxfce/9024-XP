package ahorcado;

public class JuegoAhorcado {

    public static void main(String[] args) {

        Ahorcado ahorcado = new Ahorcado();
        Jugador jugador = new Jugador();
        ahorcado.agregarPalabras();

        do {
            String palabra = ahorcado.elegirPalabra();
            ahorcado.palabra = palabra;
            ahorcado.letrasRestantes = ahorcado.palabra.length();
            ahorcado.datosAhorcado(); //le asigna valor necesarios a atributos de la clase

            System.out.println(ahorcado.conjuntoDePalabras);
            System.out.println("Tienes: " + jugador.vidas + " vidas");

            while (!ahorcado.adivinoLaPalabra() && jugador.comprobarVidas()) {
                System.out.println(">>>>" + ahorcado.mostrarJuego() + " <<<<<");
                System.out.print("Ingrese una letra: ");
                String letraIngresada = jugador.ingresarLetra();

                boolean comprobacion = ahorcado.comprobarExistenciaDeLetra(letraIngresada);

                if (comprobacion) {
                    char letraSeleccionada = letraIngresada.charAt(0);
                    boolean letraPresente = ahorcado.comprobarLetra(letraSeleccionada);

                    if (letraPresente) {
                        System.out.println("¡la letra está presente! :)");
                        System.out.println("Tienes: " + jugador.vidas + " vidas");
                        //System.out.println("letras restantes: " + ahorcado.letrasRestantes);
                        ahorcado.adivinoLaPalabra();
                    } else {
                        System.out.println("la letra no está presente :(");
                        jugador.restarVida(letraPresente);
                        //System.out.println("letras restantes: " + ahorcado.letrasRestantes);
                        System.out.println("Tienes: " + jugador.vidas + " vidas");
                    }
                } else {
                    System.out.println("ya ingresó esta letra");
                }
            }
            if (ahorcado.adivinoLaPalabra()) {
                ahorcado.mostrarJuego();
                System.out.println("HAS ADIVINADO LA PALABRA!! 7w7");
            }
            if (!jugador.comprobarVidas()) {
                System.out.println("La palabra era: " + ahorcado.palabra);
                System.out.println("TE HAS QUEDADO SIN VIDAS (˘_˘٥)");
            }
        } while (!ahorcado.conjuntoDePalabras.isEmpty() && jugador.comprobarVidas());
    }
}
