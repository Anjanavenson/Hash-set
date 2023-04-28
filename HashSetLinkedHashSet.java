import java.util.LinkedHashSet;
import java.lang.*;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetLinkedHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();  // does not maintain insertion order
        hs.add(5);    // avoid duplicate values
        hs.add(100);
        hs.add(50);
        hs.add(6);
        System.out.println(hs.add(5));
        System.out.println(hs);

        LinkedHashSet lh = new LinkedHashSet();   // maintain insertion order
        lh.toArray();
        lh.add(5);    // avoid duplicate values
        lh.add(100);
        lh.add(50);
        lh.add(6);
        System.out.println(lh.add(5));
        System.out.println(lh);

        LinkedList ll = new LinkedList();   // print duplicate values
        ll.add(5);
        ll.add(100);
        ll.add(50);
        ll.add(6);
        System.out.println(ll.add(5));
        System.out.println("At First " +ll);
//        Object ob = ll.toArray();
//        for (Object o: ob) {
//            System.out.println(o);
//        }
        LinkedHashSet lhs = new LinkedHashSet(ll);
        System.out.println("After " +lhs);
    }
}
