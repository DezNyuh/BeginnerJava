package exercicios.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n  = sc.nextInt();
		
		double [] vect = new double [n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.print("VALORES: =");
		
		for (int i=0; i<vect.length; i++) {
			System.out.print(" ");
			System.out.print(vect[i]);
		}
		
		System.out.println();
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", sum);
		
		double avg = sum / vect.length;
		System.out.printf("MÉDIA = %.2f%n", avg);
		
		sc.close();
	}
}
