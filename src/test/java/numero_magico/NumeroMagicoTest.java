package numero_magico;

import junit.framework.TestCase;

public class NumeroMagicoTest extends TestCase {

    public void testGenerarNumeroAleatorio() {
        NumeroMagico nm = new NumeroMagico();
        int result = nm.crearNumeroMagico();
        int result2 = nm.crearNumeroMagico();
        assertFalse(result == result2);
    }
    
   public void test10vidas(){
       Jugador jug = new Jugador();
        Object result = jug.getVidas();
       assertEquals(result,10);
   }
   public void testUnamenos(){
       Jugador jug = new Jugador();
       jug.quitarVida();
        Object result = jug.getVidas();
       assertEquals(9,result);
   }
   public void testConeccion(){
       baseDeDatos instance = new baseDeDatos();
        int vidas = 3;
        int result = instance.conexionEjemplo(vidas);
        int expected = 0;
        System.out.print("Test Se comecta a la BD");
        assertEquals(result,expected);
   }
}
