/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_magico;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * @author lautaro
 */
public class InicioNumeroMagico {

    public void jugar(Logger logger, Scanner tecladoUsuario) {

        System.out.println("Seleccione 1 para jugar a Numeros Magicos");
        System.out.println("Seleccione 2 para jugar a Numeros Magicos inversos");
        Scanner option = new Scanner(System.in);
        String userOp = option.nextLine();   //leer Numero de Usuario = userN
        int userIn = Integer.parseInt(userOp);
        if (userIn == 1) {
            NumeroMagico numM = new NumeroMagico(); //llamamos la clase numMagicos
            numM.crearNumeroMagico();//llama al metodo que crea el numero magico
            Jugador jugV = new Jugador(); //llamamos la clase jugador
            int vidas;
            int conter = 1;
            String resultado;
            System.out.println("Bienvenidos a Numeros Magicos");
            System.out.println("OBJETIVOS DEL JUEGO");
            System.out.println("*Usted debe adivinar el número magico");
            System.out.println("*El número está entre 1 y 100");
            do {
                vidas = jugV.getVidas();
                jugV.quitarVida();
                System.out.println("*Usted tiene un total de " + vidas + " vidas");
                Scanner numUsuario = new Scanner(System.in);    //funcion q crea el scanner del NumUser
                String userN = numUsuario.nextLine();   //leer Numero de Usuario = userN
                int userInt = Integer.parseInt(userN);  //Transforma el dato StringUser a Integer
                resultado = numM.compararNumeros(userInt);   //llama al metodo que Compara numeroUser con NumeroMagicoAleatorio
                System.out.println("el numero mágico es " + resultado);
            } while (resultado != "Igual" && vidas != 1);
            System.out.println("El juego a terminado :D");
            baseDeDatos obj = new baseDeDatos();
            obj.conexionEjemplo(vidas);
        } else {
            // tipear numero
            // la pc dice un numero
            // bucle comprobar que la pc adivina le numero
            JugadorPC pc = new JugadorPC();
            Jugador jugV = new Jugador(); //llamamos la clase jugador
            int vidas;
            int conter = 1;

            System.out.println("Bienvenido a Numero Mágico Inverso");
            System.out.println("OBJETIVOS DEL JUEGO:");
            System.out.println("*Piense en un número del 1 al 100 y la máquina intentará adivinarlo");
            System.out.println("*Ingrese menor '<' mayor '>' o igual '=' segun corresponda");

            int min = 0;
            int max = 100;
            int numeroPC;
            String otroNombre;
            do {
                vidas = jugV.getVidas();
                jugV.quitarVida();
                System.out.println("*La Maquina tiene un total de " + vidas + " vidas");
                numeroPC = pc.darNumero(min, max);
                System.out.println("Tu número es " + numeroPC + "?");
                Scanner nomb = new Scanner(System.in);
                otroNombre = nomb.nextLine();

                if (otroNombre.equals("<")) {
                    max = numeroPC;
                }
                if (otroNombre.equals(">")) {
                    min = numeroPC;
                }
                if (otroNombre.equals("=")) {

                    System.out.println("Fin del juego, Tu numero es " + numeroPC);
                }

            } while (!otroNombre.equals("=") && vidas != 1);
            if (vidas == 1) {
                System.out.println("Fin del juego, La computadora se quedo sin vida");
            }
        }


    }

    public int testeo(int option) {
        if (option == 1) {
            NumeroMagico numM = new NumeroMagico(); //llamamos la clase numMagicos
            numM.crearNumeroMagico();//llama al metodo que crea el numero magico
            Jugador jugV = new Jugador(); //llamamos la clase jugador
            int vidas;
            int conter = 1;
            String resultado;
            System.out.println("Bienvenidos a Numeros Magicos");
            do {
                vidas = jugV.getVidas();
                jugV.quitarVida();
                System.out.println("Usted tiene un total de " + vidas + " vidas");
                Scanner numUsuario = new Scanner(System.in);    //funcion q crea el scanner del NumUser
                String userN = numUsuario.nextLine();   //leer Numero de Usuario = userN
                int userInt = Integer.parseInt(userN);  //Transforma el dato StringUser a Integer

                resultado = numM.compararNumeros(userInt);   //llama al metodo que Compara numeroUser con NumeroMagicoAleatorio
                System.out.println("el numero mágico es " + resultado);

            } while (resultado != "Igual" && vidas != 0);

            System.out.println("El juego a terminado :D");
            baseDeDatos obj = new baseDeDatos();
            obj.conexionEjemplo(vidas);
        } else if (option == 2) {
            System.out.println("Hola");
        }
        return option;
    }
}
