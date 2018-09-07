package sqlite;

import junit.framework.TestCase;

public class SampleTest extends TestCase {

    public void test_de_ejemplo() {
        Sample instance = new Sample();
        String result = instance.conexionEjemplo();
        String expected = "leo";
        System.out.print("Test Se comecta a la BD");
        assertEquals(result,expected);
    }

}
