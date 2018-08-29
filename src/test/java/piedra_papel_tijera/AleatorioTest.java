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
public class AleatorioTest extends TestCase{
    
    public void testAleatorio03() {
        System.out.println("aleatorio");
        String dato = "tijera";
        Aleatorio_Tijera instance = new Aleatorio_Tijera();
        String expResult = "tijera";
        String result = instance.tijeraEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testAleatorio04() {
        System.out.println("aleatorio");
        String dato = "piedra";
        Aleatorio_Piedra instance = new Aleatorio_Piedra();
        String expResult = "piedra";
        String result = instance.piedraEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testAleatorio05() {
        System.out.println("aleatorio");
        String dato = "papel";
        Aleatorio_Papel instance = new Aleatorio_Papel();
        String expResult = "papel";
        String result = instance.papelEj(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
