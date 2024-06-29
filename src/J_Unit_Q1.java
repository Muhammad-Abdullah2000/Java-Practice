
import static org.junit.Assert.*;
import org.junit.Test;
public class J_Unit_Q1 {
    @Test
    public void Q1(){
        int a = 2;
        System.out.println("the name is:" + a);
        assertEquals(2,a);
    }
    @Test
    public void OOp(){
        boolean hometaskq1 = true;
        boolean hometaskq2 = false;
        System.out.println(hometaskq1);
        assertEquals(true, hometaskq1);

    }
}
