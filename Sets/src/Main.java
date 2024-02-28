import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(1);

        for(int x : set)
            System.out.print(x + "");
        System.out.println();

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(1);

        for(int x : set2)
            System.out.print(x + "");
        System.out.println();

        Set<Integer> set3 = new TreeSet<>();
        set3.add(5);
        set3.add(3);
        set3.add(2);
        set3.add(3);
        set3.add(1);

        for(int x : set3)
            System.out.print(x + "");
        System.out.println();
    }
}