/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

import junit.framework.TestCase;

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

}
