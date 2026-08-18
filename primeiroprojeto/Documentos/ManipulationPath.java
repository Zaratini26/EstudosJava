package primeiroprojeto.Documentos;

import java.io.File;
import java.util.Scanner;

public class ManipulationPath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);

        if (folders != null && files != null) {

            System.out.println("Folders:");
            for (File f : folders) {
                System.out.println(f);
            }
            System.out.println("Files: ");
            for (File f : files) {
                System.out.println(f);
            }
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Folder created: " + success);


        sc.close();
    }
}
