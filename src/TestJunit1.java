import static org.junit.Assert.assertEquals;
 import  org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
public class TestJunit1 {
    @Test
    public void testOne() {
        System.out.println("Muhammad Abdullah");
        String str = "Muhammad Abdullah";
        assertEquals("Muhammad Abdullah", str);
    }
        @Test
        public void testTwo() {
           int a = 4;
           int b = 5;
           int c = a + b;
            System.out.println("The sum expected be: " + c);
            assertEquals(9, c);
        }
    }
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestJunit1.class })
class TestJunitSuite {
}
