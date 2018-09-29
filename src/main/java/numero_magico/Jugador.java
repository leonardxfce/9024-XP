/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_magico;


class Jugador {
    int vidas;

    public Jugador() {
        this.vidas = 10;
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    void quitarVida() {
        this.vidas--;
    }


}
