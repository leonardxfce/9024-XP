/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_magico;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
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
        } else {
            // tipear numero
            // la pc dice un numero
            // bucle comprobar que la pc adivina le numero
            JugadorPC pc = new JugadorPC();
            int min = 0;
            int max = 100;
            int numeroPC = pc.darNumero(min, max);
            Scanner nomb = new Scanner(System.in);
            String otroNombre = nomb.nextLine();
            if (otroNombre == "<") {
                max = numeroPC;
            }
            if (otroNombre == ">") {
                min = numeroPC;
            }
            if (otroNombre == "=") {
                System.out.println("Fin del juego, Tu numero es" + numeroPC);
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
