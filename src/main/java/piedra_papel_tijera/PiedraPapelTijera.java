/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

import java.util.Scanner;

/**
 *
 * @author caro_
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dato;
        int numA;
        System.out.println("******** PIEDRA, PAPEL O TIJERA ********");
        System.out.println("Ingrese su opción: ");
        dato = leer.nextLine();
        JugadaComputadora nuevaJugada = new JugadaComputadora();
        numA = nuevaJugada.Aleatorio();
        ComprobarJugada comp = new ComprobarJugada();
        //String resultado []= new String [3];
        String resultado = comp.comprobar(numA, dato);
        String resultado1 = comp.computadoraResult(numA);
        System.out.println(resultado1);
        System.out.println("Usted "+ resultado);
        /*for(int i = 0; i < 3; i++){
            System.out.println("Ingrese su opción: ");
            dato = leer.nextLine();
            numA = nuevaJugada.Aleatorio();
            System.out.println("jugada de la computadora: "+numA);
            resultado[i]= comp.comprobar(numA, dato);
        }
        int resultDefinitivo = 0;
        for(int j = 0; j<3;j++){
            if(resultado[0]==resultado[1]){
                resultDefinitivo =resultDefinitivo + 0;
            }else{
                resultDefinitivo = resultDefinitivo + 1;
            }
        }
        if(resultDefinitivo>=1){
            System.out.println("Usted Ganó");
        }else{
            System.out.println("Usted Perdió");
        }*/
    }
    
}
