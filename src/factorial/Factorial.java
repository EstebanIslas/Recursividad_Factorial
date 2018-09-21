package factorial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        System.out.print("\n" + inicio + "\n");
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();

        if (num <= 100) {
            System.out.println("\nEl factorial de " + num + " es: " + factorial(num)); 
            System.out.print("\n" + fin + "\n");
            long resta = fin-inicio;
            System.out.print("\n" + resta + "\n");
        } else {
            System.out.print("El numero debe ser menor a 100!!  \n");

        }

    }
    public static double factorial(double num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
