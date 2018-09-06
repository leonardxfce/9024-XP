/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author SantiagoGuirado
 */
public class TableroTest extends TestCase {
    
    public TableroTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testJugadorActual01() {
        System.out.println("jugadorActual01");
        Tablero instance = new Tablero();
        int expResult = 1;
        int result = instance.jugadorActual();
        assertEquals(expResult, result);
    }
    @Test
    public void testJugadorActual02() {
        System.out.println("jugadorActual02");
        Tablero instance = new Tablero();
        //Para que el valor cambie primero se debe ejecutar el metodo "marcaDeCadaJugadorEnTablero"
        instance.cambioDeJugador();
        //Se pide un valor al metodo jugador actual
        int expResult = 2;
        int result = instance.jugadorActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificadorDePosicionOcupada method, of class Tablero.
     */
    @Test
    public void testVerificadorDePosicionOcupada01() {
        System.out.println("verificadorDePosicionOcupada01");
        int posicionIngresadoPorJugador = 0;
        Tablero instance = new Tablero();
        boolean expResult = false;
        boolean result = instance.verificadorDePosicionOcupada(posicionIngresadoPorJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVerificadorDePosicionOcupada02() {
        System.out.println("verificadorDePosicionOcupada02");
        int posicionIngresadoPorJugador = 1;
        Tablero instance = new Tablero();
        //Para que el valor cambien primero se debe ejecutar el metodo "marcaDeCadaJugadorEnTablero"
        //y se debe verificar el metodo en cuestion en la misma posicion en la que se cargo un dato
        instance.marcaDeCadaJugadorEnTablero(1);
        //Se verifica si la posicion esta ocupada
        boolean expResult = true;
        boolean result = instance.verificadorDePosicionOcupada(posicionIngresadoPorJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVerificadorDePosicionOcupada03() {
        System.out.println("verificadorDePosicionOcupada03");
        int posicionIngresadoPorJugador = 3;
        Tablero instance = new Tablero();
        //Para que el valor cambien primero se debe ejecutar el metodo "marcaDeCadaJugadorEnTablero"
        //y se debe verificar el metodo en cuestion en la misma posicion en la que se cargo un dato
        instance.marcaDeCadaJugadorEnTablero(1);
        instance.marcaDeCadaJugadorEnTablero(3);
        //Se verifica si la posicion esta ocupada
        boolean expResult = true;
        boolean result = instance.verificadorDePosicionOcupada(posicionIngresadoPorJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of marcaDeCadaJugadorEnTablero method, of class Tablero.
     */
    @Test
    public void testMarcaDeCadaJugadorEnTablero01() {
        System.out.println("marcaDeCadaJugadorEnTablero01");
        int posicionIngresadoPorJugador = 0;
        Tablero instance = new Tablero();
        String expResult = "J1";
        String result = instance.marcaDeCadaJugadorEnTablero(posicionIngresadoPorJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMarcaDeCadaJugadorEnTablero02() {
        System.out.println("marcaDeCadaJugadorEnTablero02");
        int posicionIngresadoPorJugador = 0;
        Tablero instance = new Tablero();
        //Para que el valor cambie primero se debe ejecutar el cambio de jugador
        instance.cambioDeJugador();
        //Ahora se verifica el valor
        String expResult = "J2";
        String result = instance.marcaDeCadaJugadorEnTablero(posicionIngresadoPorJugador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambioDeJugador method, of class Tablero.
     */
    @Test
    public void testCambioDeJugador01() {
        System.out.println("cambioDeJugador01");
        Tablero instance = new Tablero();
        int expResult = 2;
        int result = instance.cambioDeJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCambioDeJugador02() {
        System.out.println("cambioDeJugador02");
        Tablero instance = new Tablero();
        //se cambia el jugador a 2 primero
        instance.cambioDeJugador();
        //para que al volver a cambiarlo el jugador vuelva a ser 1
        int expResult = 1;
        int result = instance.cambioDeJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lineaCompetada method, of class Tablero.
     */
    @Test
    public void testLineaCompletada01() {
        System.out.println("lineaCompletada01");
        Tablero instance = new Tablero();
        String expResult = null;
        String result = instance.lineaCompletada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testLineaCompletada02() {
        System.out.println("lineaCompletada02");
        Tablero instance = new Tablero();
        //se eligen tres posiciones por el jugador uno
        instance.marcaDeCadaJugadorEnTablero(0);
        instance.marcaDeCadaJugadorEnTablero(1);
        instance.marcaDeCadaJugadorEnTablero(2);
        //y se verifica el metodo
        String expResult = "J1";
        String result = instance.lineaCompletada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testLineaCompletada03() {
        System.out.println("lineaCompletada03");
        Tablero instance = new Tablero();
        //se eligen tres posiciones por el jugador dos
        instance.cambioDeJugador();
        instance.marcaDeCadaJugadorEnTablero(0);
        instance.marcaDeCadaJugadorEnTablero(1);
        instance.marcaDeCadaJugadorEnTablero(2);
        //y se verifica el metodo
        String expResult = "J2";
        String result = instance.lineaCompletada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of escribirElJugadorActual method, of class Tablero.
     */
    @Test
    public void test0escribirElJugadorActual01() {
        System.out.println("escribirElJugadorActual01");
        Tablero instance = new Tablero();
        String expResult = "Juega el primer jugador";
        String result = instance.escribirElJugadorActual(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test0escribirElJugadorActual02() {
        System.out.println("escribirElJugadorActual02");
        Tablero instance = new Tablero();
        String expResult = "Juega el segundo jugador";
        String result = instance.escribirElJugadorActual(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of escribirElJugadorActual method, of class Tablero.
     */
    @Test
    public void testEscribirPosicionOcupadaDesocupada01() {
        System.out.println("escribirPosicionOcupadaDesocupada01");
        Tablero instance = new Tablero();
        String expResult = "La posicion elegida esta ocupada";
        String result = instance.escribirPosicionOcupadaDesocupada(true);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of escribirJugadorGanador method, of class Tablero.
     */
    @Test
    public void testEscribirJugadorGanador01() {
        System.out.println("escribirJugadorGanador01");
        Tablero instance = new Tablero();
        String expResult = "Gano el jugador 1";
        String result = instance.escribirJugadorGanador("JD1");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEscribirJugadorGanador02() {
        System.out.println("escribirJugadorGanador01");
        Tablero instance = new Tablero();
        String expResult = "Gano el jugador 2";
        String result = instance.escribirJugadorGanador("JD2");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
