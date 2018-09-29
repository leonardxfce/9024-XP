/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

/**
 * @author caro_
 */
public class Usuario {
    int vidas = 3;

    public int quitarVidas(int a) {
        int cantVidas = this.vidas - a;
        return cantVidas;
    }

}
