import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
            int x = itr.next();
            if (x == 2) {
                // will not throw Exception
                itr.remove();
            }
        }
        System.out.println(integers);
    }
}