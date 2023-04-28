import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(5);
        hs.add(100);
        hs.add(50);
        hs.add(6);
        System.out.println(hs.add(5));
        System.out.println(hs);

    }
}
