
import java.util.ArrayList;
import java.util.Iterator;
public class Class_Work {
    public static void main(String[] args) {

        ArrayList ListTest = new ArrayList();

        ListTest.add("First Item");
        ListTest.add("Second Item");
        ListTest.add("Third Item");
        ListTest.add(7);

        Iterator it = ListTest.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListTest.remove("Second item");

        System.out.println("Whole List" + ListTest);

        System.out.println("Position 1 =" + ListTest.get(1));

    }
}
