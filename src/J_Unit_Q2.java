import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class J_Unit_Q2 {
    @Test
    public void Q2(){
        int y = 9;
        System.out.println("the value is:" + y);
        assertEquals(9,y);
    }
    @Test
    public void OOP(){
        boolean hometaskq2 = false;
        System.out.println(hometaskq2);
        assertEquals(false, hometaskq2);

    }
}
@RunWith(Suite.class)
@Suite.SuiteClasses({ J_Unit_Q2.class })
class Test1 {
}

