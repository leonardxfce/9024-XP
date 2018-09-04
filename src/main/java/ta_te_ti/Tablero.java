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
    int[] campoDeJuego={0,0,0,0,0,0,0,0,0};
    boolean jugador = true;
    public int lugarAMarcar(int f){
        int lugarMarcado=f;
        return lugarMarcado;
    }
    
    public int[] elTablero(int pocisionEnElTablero){
        //int[] tableroMarcado= campoDeJuego[]; 
        int marca = 0;
        if (jugador == true){
            marca = 5;
            jugador = false;
        } else {
            marca = 9;
            jugador = true;
        }
        campoDeJuego[pocisionEnElTablero]=marca;
        return campoDeJuego;
    }
    public void marcaraEnTablero(){
        int longitud= campoDeJuego.length;
        for (int i = 0 ; i < longitud; ++i){
            if (campoDeJuego[i]==5){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
        }
    }


