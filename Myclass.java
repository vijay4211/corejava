import java.util.*;

public class myclass {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList arrlist = new ArrayList();
        arrlist.add(10); // index = 0
        arrlist.add(20); // index = 1
        arrlist.add("mango"); // index = 2
        arrlist.add(10.6); // index = 3
        System.out.println(arrlist);
        System.out.println(arrlist.size());
    }
}
// ========Output
// [10, 20, mango, 10.6]
// 4
