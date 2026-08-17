package primeiroprojeto.exemplo;

public class VarArgs {

    public static void imprimirLista(String title, String... lista) {
        if (lista.length == 0) {
            System.out.println(title + ": \n" + "Lista Vazia!");
        }
        else {
            for (String items : lista) {
                System.out.println(title + ": \n" + items);
            }
        }
    }

    public static void somaVarArgs(int... numbers) {
        if (numbers == null) {
            return;
        }
        int sum = 0;
        for (int numero : numbers) {
            sum += numero;
        }
        System.out.println("Total: " + sum);
    }

    public static void main(String... args) {

        imprimirLista("Compras do Supermercado", "maçã, banana, café, laranja");
        System.out.println();

        imprimirLista("Tarefas do dia");

        System.out.println();
        somaVarArgs(1, 2, 3, 4, 5);
    }
}
