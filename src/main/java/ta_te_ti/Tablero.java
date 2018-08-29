/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

/**
 *
 * @author ikariRules
 */
public class Tablero {
    int[] campoDeJuego= new int[9];
    boolean jugador = true;
    
    public boolean elTablero(int a){
        int marca = 0;
        if (jugador == true){
            marca = 5;
            jugador = false;
        } 
        if (jugador == false) {
            marca = 9;
            jugador = true;
        }
        campoDeJuego[a] = marca;
        return jugador;
    }
}
