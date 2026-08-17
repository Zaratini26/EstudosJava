package primeiroprojeto.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTeste {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");                            // Adiciona na lista
        list.add("Alex");                            // Adiciona na lista
        list.add("Bob");                            // Adiciona na lista
        list.add("Anna");                          // Adiciona na lista
        list.add(2, "Marco");       // Adiciona na lista no índice 2

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("Tamanho da lista: " + list.size() + " elementos");
        System.out.println("-".repeat(30));

        //list.remove("Anna");                                 Remove da lista (obj)
        //list.remove(3);                                      Remove da lista (int)
        list.removeIf(x -> x.charAt(0) == 'M');        // Remove da lista toda o string x -> (tal que)
                                                            // a letra do índice 0 seja igual a M. (Predicado)

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("Tamanho da lista: " + list.size() + " elementos");
        System.out.println("Posição na lista do Milton = " + list.indexOf("Bob"));
        System.out.println("Posição na lista do Felipe = " + list.indexOf("Marco"));
        // Quando o index não encontra o elemento (False) retorna -1

        System.out.println("-".repeat(30));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String name : result) {
            System.out.println(name);
        }

        System.out.println("-".repeat(30));

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);

    }
}
