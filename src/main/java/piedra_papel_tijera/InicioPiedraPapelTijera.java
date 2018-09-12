/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author caro_
 */
public class InicioPiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public void jugar(Logger logger) {
        Scanner leer = new Scanner(System.in);
        String dato;
        int numA;
        int puntos= 0;
        logger.debug("******** PIEDRA, PAPEL O TIJERA ********");
        
        Usuario c = new Usuario();
        JugadaComputadora nuevaJugada = new JugadaComputadora();
        
        ComprobarJugada comp = new ComprobarJugada();
        
        int rastrear;
        String result;
        String resultFinal = "";
        for(int i=0; i<3; i++){
            numA = nuevaJugada.aleatorio();
            logger.debug("Ingrese su opción: ");
            dato = leer.nextLine();
            String resultado1 = comp.computadoraResult(numA);
            logger.debug(resultado1);
            result = comp.comprobar(numA,dato);
            logger.debug("Usted "+ result);
            if(result=="gano"){
                puntos ++;
            }
            rastrear = c.quitarVidas(i);
            logger.debug("vidas = "+ rastrear);
        }
        logger.debug("Tiene "+puntos+" puntos");
        if(puntos>= 2){
            resultFinal = "gano";
        }else{
            resultFinal = "perdio";
        }
        logger.debug("RESULTADO FINAL: "+resultFinal );
        
        BaseDeDatos nuevo = new BaseDeDatos();
        nuevo.conexionEjemplo(puntos);
    }
    
}
