/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

import piedra_papel_tijera.Aleatorio_Piedra;
import piedra_papel_tijera.Aleatorio_Papel;
import piedra_papel_tijera.Aleatorio_Tijera;
import junit.framework.TestCase;

/**
 *
 * @author caro_
 */
public class AleatorioTest extends TestCase {
    
    public void testJugadaComputadora(){
        JugadaComputadora jugada = new JugadaComputadora();
        int resultado = jugada.aleatorio();
        int expectativa []={0,1,2} ;
        assertEquals(expectativa[resultado],resultado);
    }
    public void testAleatorio03() {

        String dato = "tijera";
        Aleatorio_Tijera instance = new Aleatorio_Tijera();
        String expResult = "tijera";
        String result = instance.tijeraEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testAleatorio04() {

        String dato = "piedra";
        Aleatorio_Piedra instance = new Aleatorio_Piedra();
        String expResult = "piedra";
        String result = instance.piedraEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testAleatorio05() {

        String dato = "papel";
        Aleatorio_Papel instance = new Aleatorio_Papel();
        String expResult = "papel";
        String result = instance.papelEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testPiedracontraTijera(){
        String datoUsuario = "piedra";
        int jugadaPC = 0;
        ComprobarJugada a = new ComprobarJugada();
        String result = a.comprobar(jugadaPC, datoUsuario);
        assertEquals(result, "gano");
    }
    public void testPiedracontraPapel(){
        String datoUsuario = "piedra";
        int jugadaPC = 2;
        ComprobarJugada a = new ComprobarJugada();
        String result = a.comprobar(jugadaPC, datoUsuario);
        assertEquals(result, "perdio");
    }
    public void testPiedracontraPiedra(){
        String datoUsuario = "piedra";
        int jugadaPC = 1;
        ComprobarJugada a = new ComprobarJugada();
        String result = a.comprobar(jugadaPC, datoUsuario);
        assertEquals(result, "empato");
    }
    
    public void testRestarVidas(){
        int restar = 1;
        Usuario a = new Usuario();
        int result = a.quitarVidas(restar);
        assertEquals(result,2);
    }
    
    public void testJugarTresVecesYGanar(){
        String datoUsuario[]= {"piedra","papel","tijera"};
        ComprobarJugada a = new ComprobarJugada();
        int b= 0;
        String result;
        String resultFinal = "";
        for(int i=0; i<3; i++){
            result = a.comprobar(i,datoUsuario[i]);
            if(result=="gano"){
                b ++;
            }
        }
        if(b>= 2){
            resultFinal = "gano";
        }else{
            resultFinal = "perdio";
        }
        assertEquals(resultFinal, "gano");
    }
    public void testJugarTresVecesYGanarRestandoVidas(){
        String datoUsuario[]= {"piedra","papel","tijera"};
        ComprobarJugada a = new ComprobarJugada();
        Usuario c = new Usuario();
        int b= 0;
        int rastrear;
        String result;
        String resultFinal = "";
        for(int i=0; i<3; i++){
            result = a.comprobar(i,datoUsuario[i]);
            if(result=="gano"){
                b ++;
            }
            rastrear = c.quitarVidas(i);
           
        }
        if(b>= 2){
            resultFinal = "gano";
        }else{
            resultFinal = "perdio";
        }
        assertEquals(resultFinal, "gano");
    }
    public void testJugarTresVecesYPerderRestandoVidas(){
        String datoUsuario[]= {"papel","tijera","piedra"};
        ComprobarJugada a = new ComprobarJugada();
        Usuario c = new Usuario();
        int b= 0;
        int rastrear;
        String result;
        String resultFinal = "";
        for(int i=0; i<3; i++){
            result = a.comprobar(i,datoUsuario[i]);
            if(result=="gano"){
                b ++;
            }
            rastrear = c.quitarVidas(i);
            
        }
        if(b>= 2){
            resultFinal = "gano";
        }else{
            resultFinal = "perdio";
        }
        assertEquals(resultFinal, "perdio");
    }
    
    public void testBaseDeDatos() {
        int ejemplo=2;
        BaseDeDatos instance = new BaseDeDatos();
        String result = instance.conexionEjemplo(ejemplo);
        String expected = "usuario1";
        
        assertEquals(result,expected);
    }

}
