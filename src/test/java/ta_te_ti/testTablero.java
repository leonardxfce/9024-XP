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
public class testTablero extends TestCase {

    public testTablero(String testName) {
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
    /*public void testTablero() {
        System.out.println("test de tablero:");
        Tablero instance = new Tablero();
        int valor = 1;
//        boolean expectativa = true;
        //boolean respuesta = instance.elTablero(valor);
       // assertEquals(expectativa, respuesta);
    }*/
    public void testPonerUnaFicha() {
        int[] espectativa = {0, 0, 0, 5, 0, 0, 0, 0, 0};
        Tablero z = new Tablero();
        int[] result = z.elTablero(3);
        //assertEquals(result.toString(),espectativa.toString());
        //assertTrue(result.equals(espectativa));
        boolean bandera = true;
        for (int i = 0; i < result.length; i++) {
            if (espectativa[i] != result[i]) {
                bandera = false;
            }
        }
        assertTrue(bandera);
    }
}
