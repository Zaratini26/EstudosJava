package primeiroprojeto.generics.exemplo01.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private final List<Integer> numbers = new ArrayList<>();

    public void addList(int number) {
        numbers.add(number);
    }

    public Integer first() {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return numbers.getFirst();
    }

    public void print() {
        System.out.print("[");
        if (!numbers.isEmpty()) {
            System.out.print(numbers.getFirst());
        }
        for (int i = 1; i < numbers.size(); i++) {
            System.out.print(", " + numbers.get(i));
        }
        System.out.println("]");
    }
}