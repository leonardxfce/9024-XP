/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

import junit.framework.TestCase;

/**
 *
 * @author ikariRules
 */
public class TestJugada extends TestCase {
    
    public TestJugada(String testName) {
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
    // public void testHello() {}
    public void testTablero() {
        System.out.println("test de jugada:");
        Jugada instance = new Jugada();
        int valor = 5;
        int expectativa =5 ;
        int respuesta = instance.pedirNumero();
        assertEquals(expectativa, respuesta);
    }
}
