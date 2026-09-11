package primeiroprojeto.generics.exemplo01generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private final List<T> list = new ArrayList<>();

    public void addList(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return list.getFirst();
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.getFirst());
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}