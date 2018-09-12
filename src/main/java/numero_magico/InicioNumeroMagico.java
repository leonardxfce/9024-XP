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

    public void jugar(Logger logger) {

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
            System.out.println("Usted tiene un total de "+vidas+" vidas");
            Scanner numUsuario = new Scanner(System.in);    //funcion q crea el scanner del NumUser
            String userN = numUsuario.nextLine();   //leer Numero de Usuario = userN
            int userInt = Integer.parseInt(userN);  //Transforma el dato StringUser a Integer

            resultado = numM.compararNumeros(userInt);   //llama al metodo que Compara numeroUser con NumeroMagicoAleatorio
            System.out.println("el numero mágico es " + resultado);
            
        } while (resultado != "Igual" && vidas != 0);

        System.out.println("El juego a terminado :D");
        baseDeDatos obj = new baseDeDatos();
        obj.conexionEjemplo(vidas);

    }
    

    }

