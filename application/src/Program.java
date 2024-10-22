import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println();
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            sc.nextLine();
            double number = sc.nextDouble();
            vect[i] = number;
        }
        System.out.println();
        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / vect.length;
        System.out.printf("MÈDIA = %.2f%n", avg);
        sc.close();
    }
}