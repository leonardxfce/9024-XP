/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_te_ti;

import org.junit.*;

import static org.junit.Assert.assertTrue;

/**
 * @author thebo
 */
public class IATest {

    public IATest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of alatoriedad method, of class IA.
     */
    @Test
    public void testAlatoriedad() {
        System.out.println("alatoriedad");
        IA instance = new IA();
        int result = instance.alatoriedad();
        System.out.println(result);
        assertTrue(0 < result && result < 10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
