package primeiroprojeto.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }

        System.out.println("End of program");

    }
}
//   e.printStackTrace();