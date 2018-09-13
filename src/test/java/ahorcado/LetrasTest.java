package ahorcado;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Lisa
 */
public class LetrasTest extends TestCase {

    public void testMostrarTodasLasRayitas() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.datosAhorcado();
        String espaciosVacios = instance.mostrarJuego();
        assertEquals(" _ _ _ _", espaciosVacios);
    }

    public void testMostrarTodasLasRayitasMenosUnaLetra() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = instance.conjuntoDePalabras.get(0);
        instance.datosAhorcado();
        instance.comprobarLetra('b');
        String espaciosVacios = instance.mostrarJuego();
        assertEquals("b _ _ _", espaciosVacios);
    }

    public void testMostrarTodasLasRayitasMenosDosLetra() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = instance.conjuntoDePalabras.get(2);
        instance.datosAhorcado();
        instance.comprobarLetra('a');
        instance.comprobarLetra('t');
        String espaciosVacios = instance.mostrarJuego();
        assertEquals("a _t _", espaciosVacios);
    }

    public void testLetraNuevamenteIngresada() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = instance.conjuntoDePalabras.get(2);
        instance.datosAhorcado();
        boolean presencia = instance.comprobarExistenciaDeLetra("b");
        boolean presencia1 = instance.comprobarExistenciaDeLetra("b");
        assertEquals(true, presencia);
        assertEquals(false, presencia1);
    }

    public void testLetraNuevamenteIngresada2() {
        Ahorcado instance = new Ahorcado();
        instance.palabra = instance.conjuntoDePalabras.get(2);
        instance.datosAhorcado();
        boolean presencia = instance.comprobarExistenciaDeLetra("b");
        boolean presencia1 = instance.comprobarExistenciaDeLetra("b");
        boolean presencia2 = instance.comprobarExistenciaDeLetra("o");
        boolean presencia3 = instance.comprobarExistenciaDeLetra("z");
        boolean presencia4 = instance.comprobarExistenciaDeLetra("o");
        assertEquals(true, presencia);
        assertEquals(false, presencia1);
        assertEquals(true, presencia2);
        assertEquals(true, presencia3);
        assertEquals(false, presencia4);
    }

    public void testLetraRepetida() {
        Ahorcado instance = new Ahorcado();
        instance.agregarPalabras();
        int ind = instance.conjuntoDePalabras.indexOf("casa");
        instance.palabra = instance.conjuntoDePalabras.get(ind);
        instance.datosAhorcado();
        instance.comprobarLetra('a');
        String result = instance.mostrarJuego();
        assertEquals(" _a _a", result);
    }

}
