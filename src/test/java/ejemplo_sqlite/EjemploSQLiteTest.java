package ejemplo_sqlite;

import junit.framework.TestCase;

public class EjemploSQLiteTest extends TestCase {

    public void test_conecta_a_bd() {
        EjemploSQLite instance = new EjemploSQLite();
        String result = instance.conexionEjemplo("jdbc:sqlite:sample.db");
        String expected = "leo";
        assertEquals(result, expected);
    }

    public void test_falla_al_conectar() {
        EjemploSQLite instance = new EjemploSQLite();
        String result = instance.conexionEjemplo("pepito");
        String expected = "fail";
        assertEquals(result, expected);
    }

}
