package primeiroprojeto.sets;

import java.util.HashSet;
import java.util.Set;

public class ex001 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        System.out.println(set.size());

        set.removeIf(n -> n.charAt(0) == 'N');

        for (String s : set) {
            System.out.println(s);
        }

    }
}