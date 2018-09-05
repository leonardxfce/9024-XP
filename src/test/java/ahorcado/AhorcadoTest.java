package ahorcado;

import junit.framework.TestCase;

public class AhorcadoTest extends TestCase {
    
    
    public void testAhorcado1() {
        Ahorcado instance = new Ahorcado();
        //char a='a';
        boolean result = instance.comprobarLetra('b');
        assertEquals(result, true);
    }
    
    
    public void testAhorcado2() {
        Ahorcado instance = new Ahorcado();
        //char a='a';
        boolean result = instance.comprobarLetra('u');
        assertEquals(result, true);
    }
    
    public void testAhorcado3() {
        Ahorcado instance = new Ahorcado();
        //char a='a';
        boolean result = instance.comprobarLetra('h');
        assertEquals(result, true);
    }
  
    public void testAhorcado4() {
        Ahorcado instance = new Ahorcado();
        //char a='a';
        boolean result = instance.comprobarLetra('o');
        assertEquals(result, true);
    }
    
    public void testAhorcado5() {
        Ahorcado instance = new Ahorcado();
        //char a='a';
        boolean result = instance.comprobarLetra('z');
        assertEquals(result, false);
    }
  
    public void testAhorcado6() {
        Ahorcado instance = new Ahorcado();
        instance.comprobarLetra('b');
        instance.comprobarLetra('u');
        instance.comprobarLetra('h');
        instance.comprobarLetra('o');
        boolean result = instance.adivinoLaPalabra();
        assertEquals(result, true);
    }
    
    public void testAhorcado7() {
        Ahorcado instance = new Ahorcado();
        Jugador jugador = new Jugador();
        boolean comprobar = instance.comprobarLetra('z');
        int result = instance.vidasRestantes(comprobar);
        assertEquals(result , 2);
    }
    public void testAhorcado8() {
        Ahorcado instance = new Ahorcado();
        Jugador jugador = new Jugador();
        boolean comprobar = instance.comprobarLetra('u');
        int result = instance.vidasRestantes(comprobar);
        assertEquals(result , 3);
    }
    
    public void testAhorcado9 () {
        Ahorcado instance = new Ahorcado();
        String result=instance.elegirPalabra();
        String resultado = instance.elegirPalabra();
        assertTrue (result != resultado);
    }
    
}
   
