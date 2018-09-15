package numero_magico;

import junit.framework.TestCase;
import menu.Inicio;
import org.apache.log4j.Logger;

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
  
     public void testOpcion2(){
       InicioNumeroMagico inm = new InicioNumeroMagico();
       Logger logger = Logger.getLogger(Inicio.class);
       Object result = inm.testeo(2);
       assertEquals(2,result);
   }
     public void testJugadorPC(){
         JugadorPC jug = new JugadorPC();
         int result = jug.darNumero(0,45);
         assertTrue(result > 0 && result < 45);
     }
}
