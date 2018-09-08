/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Lisa
 */
public class LetrasTest extends TestCase {

    public void testMostrarTodasLasRayitas() {
        Ahorcado ahorcado = new Ahorcado();
        String buho = ahorcado.conjuntoDePalabra.get(0);
        String espaciosVacios = ahorcado.mostrarJuego(buho);
        assertEquals("_ _ _ _ ", espaciosVacios);
    }

   
}
