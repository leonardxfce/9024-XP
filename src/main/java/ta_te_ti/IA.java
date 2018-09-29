/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

/**
 * @author TheBoudica
 */
public class IA {

    public int alatoriedad() {
        int intermedio = (9 - 1) + 1;
        int jugadaDeLaPC = (int) (Math.random() * intermedio) + 1;
        return jugadaDeLaPC;
    }

}
