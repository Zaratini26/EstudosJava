package primeiroprojeto.Documentos.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCopy { // Adiciona codigo no final

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strPath = sc.nextLine();

        File sourcePath = new File(strPath);  // Caminho de Origem
        String sourceFileStr = sourcePath.getParent(); // Arquivo de Origem / Pega o caminho da pasta pai do arquivo

        boolean success = new File(sourceFileStr + "\\out").mkdir();

        String targetSourceFile = sourceFileStr + "\\out\\summary.csv"; // arquivo de origem de destino

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetSourceFile, true))) {
                for (Product product : products) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }
                System.out.println(targetSourceFile + " Successfully");
            }
            catch (IOException e) {
                System.out.println("Error writing file: " +  e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
