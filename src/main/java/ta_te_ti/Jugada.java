/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

import java.util.Scanner;

/**
 *
 * @author ikariRules
 */
public class Jugada {
    boolean jugador= true;
    public int pedirNumero(){
        int posicion;
        System.out.println("Ingrese un numero:");
        Scanner lector = new Scanner(System.in);
        posicion = lector.nextInt();
        return posicion;
    }
    
}
