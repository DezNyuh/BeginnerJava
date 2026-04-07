package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.UnderBank;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		UnderBank user = new UnderBank();
		System.out.print("Enter account number: ");
		user.account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		user.name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String deposit = sc.nextLine();
		user.cash = 0;
		if (deposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			user.cash = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Account data: \n" + user);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		user.deposit(sc.nextDouble());
		System.out.println("Updated account data: \n" + user);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		user.withdraw(sc.nextDouble());
		System.out.println("Updated account data: \n" + user);
		
		
		
		
		
		sc.close();
	}

}
