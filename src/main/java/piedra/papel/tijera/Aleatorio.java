/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra.papel.tijera;

/**
 *
 * @author caro_
 */
public class Aleatorio {
    public String aleatorio(String dato){
        String retornar = "";
        String posibilidades[]= {"tijera", "piedra", "papel"};
        int numA= (int)(Math.random()*2);
        /*    if((dato.equals("tijera"))&& (posibilidades[numA].equals("tijera"))){
                retornar= "empate";
            };
            if((dato.equals("tijera"))&& (posibilidades[numA].equals("papel"))){
                retornar= "gano";
            };
            if((dato.equals("tijera"))&& (posibilidades[numA].equals("piedra"))){
                retornar= "perdi√≥";
            };
            if((dato.equals("papel"))&& (posibilidades[numA].equals("papel"))){
                retornar= "empate";
            };
            if((dato.equals("papel"))&& (posibilidades[numA].equals("tijera"))){
                retornar= "perdi√≥";
            };
            if((dato.equals("papel"))&& (posibilidades[numA].equals("piedra"))){
                retornar= "gano";
            };
            if((dato.equals("piedra"))&& (posibilidades[numA].equals("piedra"))){
                retornar= "empate";
            };
            if((dato.equals("piedra"))&& (posibilidades[numA].equals("papel"))){
                retornar= "perdi√≥";
            };
            if((dato.equals("piedra"))&& (posibilidades[numA].equals("tijera"))){
                retornar= "gano";
            };*/
        for(int i = 0; i < 3;i++){
            if(dato.equals(posibilidades[i])){
                retornar = "empate";
            };
        }
        if((dato.equals("tijera"))&& (posibilidades[numA].equals("papel"))||
          (dato.equals("papel"))&& (posibilidades[numA].equals("piedra")) ||
          (dato.equals("piedra"))&& (posibilidades[numA].equals("tijera"))){
            retornar = "ganÛ";
        }else{
            retornar = "perdiÛ";
        }

        
        return retornar;
    }
}
