package numero_magico;

import junit.framework.TestCase;

public class NumeroMagicoTest extends TestCase {

    public void testGenerarNumeroAleatorio() {
        NumeroMagico nm = new NumeroMagico();
        int result = nm.crearNumeroMagico();
        int result2 = nm.crearNumeroMagico();
        assertFalse(result == result2);
    }
    //public void testCompararNumeros(){
      //  NumeroMagico nm = new NumeroMagico();
        //NumeroUsuario nu = new NumeroUsuario();
        
        
    //}
}
