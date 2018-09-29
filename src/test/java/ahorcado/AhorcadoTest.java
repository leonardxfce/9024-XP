package ahorcado;

import junit.framework.TestCase;

import java.util.Scanner;

public class AhorcadoTest extends TestCase {

    public void testAhorcado1() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        boolean result = instance.comprobarLetra('b');
        TestCase.assertEquals(result, true);
    }

    public void testAhorcado2() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        boolean result = instance.comprobarLetra('u');
        TestCase.assertEquals(result, true);
    }

    public void testAhorcado3() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        boolean result = instance.comprobarLetra('h');
        TestCase.assertEquals(result, true);
    }

    public void testAhorcado4() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        boolean result = instance.comprobarLetra('o');
        TestCase.assertEquals(result, true);
    }

    public void testAhorcado5() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        boolean result = instance.comprobarLetra('z');
        TestCase.assertEquals(result, false);
    }

    public void testAhorcado6() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        instance.comprobarLetra('b');
        instance.comprobarLetra('u');
        instance.comprobarLetra('h');
        instance.comprobarLetra('o');
        boolean result = instance.adivinoLaPalabra();
        TestCase.assertEquals(result, true);
    }

    public void testAhorcado7() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        boolean comprobar = instance.comprobarLetra('z');
        jugador.restarVida(comprobar);
        TestCase.assertEquals(jugador.vidas, 9);
    }

    public void testAhorcado8() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        boolean comprobar = instance.comprobarLetra('u');
        jugador.restarVida(comprobar);
        TestCase.assertEquals(jugador.vidas, 10);
    }

    public void testAhorcado9() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        String result = instance.elegirPalabra();
        String resultado = instance.elegirPalabra();
        TestCase.assertTrue(result != resultado);
    }

    public void testAhorcado10() {
        Ahorcado instance = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        jugador.restarVida(instance.comprobarLetra('q'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('l'));
        TestCase.assertEquals(jugador.vidas, 7);
    }

    public void testAhorcado11() {
        Ahorcado instance = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        instance.palabra = "buho";
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        jugador.restarVida(instance.comprobarLetra('b'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('l'));
        TestCase.assertEquals(jugador.vidas, 9);
    }

    public void testAhorcado12() {
        Ahorcado instance = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        jugador.restarVida(instance.comprobarLetra('b'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('h'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('c'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('s'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('t'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('g'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('t'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        TestCase.assertEquals(instance.conjuntoDePalabras.isEmpty(), true);
        TestCase.assertEquals(jugador.vidas, 10);
    }

    public void testAhorcado13() {
        Ahorcado instance = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        jugador.restarVida(instance.comprobarLetra('b'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('h'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('c'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('w'));
        jugador.restarVida(instance.comprobarLetra('s'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('t'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('g'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('t'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        TestCase.assertEquals(instance.conjuntoDePalabras.isEmpty(), true);
        TestCase.assertEquals(jugador.vidas, 9);
    }

    public void testAhorcado14() {
        Ahorcado instance = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador(sc);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        instance.datosAhorcado();
        jugador.restarVida(instance.comprobarLetra('b'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('h'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('c'));
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('w'));
        jugador.restarVida(instance.comprobarLetra('s'));
        jugador.restarVida(instance.comprobarLetra('o'));
        instance.conjuntoDePalabras.remove(0);
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.letrasRestantes = instance.palabra.length();
        jugador.restarVida(instance.comprobarLetra('a'));
        jugador.restarVida(instance.comprobarLetra('u'));
        jugador.restarVida(instance.comprobarLetra('t'));
        jugador.restarVida(instance.comprobarLetra('o'));
        jugador.restarVida(instance.comprobarLetra('z'));
        instance.conjuntoDePalabras.remove(0);
        TestCase.assertEquals(instance.conjuntoDePalabras.isEmpty(), false);
        TestCase.assertEquals(jugador.vidas, 8);
    }
}
