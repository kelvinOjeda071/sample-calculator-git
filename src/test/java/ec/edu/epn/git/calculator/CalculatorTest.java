package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 01");
        assertEquals(6, c.addition(3,3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test02");
        assertEquals(2, c.subtraction(4,2));
    }

    @Test
    public void given_two_integers_when_division_then_ok(){
        System.out.println("Test03");
        assertEquals(2, c.division(4,2));
    }

    @Test(timeout = 180)
    public void given_x_time_when_timeout_then_exception(){
        System.out.println("Test04");
        c.timeout(160);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }



}