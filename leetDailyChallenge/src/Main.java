import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println("Before sort" + list);
        Collections.sort(list);
        System.out.println("After osrt" + list);

    }
}