package numero_magico;

import junit.framework.TestCase;

public class NumeroMagicoTest extends TestCase {

    public void testGenerarNumeroAleatorio() {
        NumeroMagico nm = new NumeroMagico();
        int result = nm.crearNumeroMagico();
        int result2 = nm.crearNumeroMagico();
        assertFalse(result == result2);
    }
    public void testCompararNumeros(){
        NumeroMagico nm = new NumeroMagico();
        int numUsuario = -1 ;
        String result = nm.compararNumeros(numUsuario);
        assertEquals(result, "MAYOR");
    }
    public void testCompararNumeros102(){
        NumeroMagico nm = new NumeroMagico();
        int numUsuario = 102 ;
        String result = nm.compararNumeros(numUsuario);
        assertEquals(result, "MENOR");
    }
    public void testCompararNumeroigual(){
        NumeroMagico nm = new NumeroMagico();
        int numUsuario = 70 ;
        System.out.println("El numero del usuario es"+numUsuario);
        String result = nm.compararNumeros(numUsuario);
        System.out.println("el numero aleatorio es");
        assertEquals(result,"IGUAL");
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
   
}
