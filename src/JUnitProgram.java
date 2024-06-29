import static org.junit.Assert.*;
import org.junit.Test;
public class JUnitProgram {
    @Test
    public void test_JUnit() {
        System.out.println("Muhammad Abdullah");
        String str1 = "Muhammad Abdullah";
        assertEquals("Muhammad Abdullah", str1);
    }
    @Test
    public void test_JUnit2() {
        System.out.println("This is Junit 2");
        String str2 = "This is Junit 2";
        assertEquals("This is Junit 2", str2);
    }
    @Test
    public void test_JUnit3() {
        int a = 4;
        int b = 5;
    int c = a + b;
        System.out.println("The sum is: " + c);
        assertEquals(9,c);
    }
}
