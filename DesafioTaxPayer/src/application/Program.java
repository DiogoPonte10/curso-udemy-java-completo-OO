package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.PrivateIndividual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new PrivateIndividual(name, anualIncome, healthSpending));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfWorkers = sc.nextInt();
				list.add(new LegalEntity(name, anualIncome, numberOfWorkers));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID:");

		double sum = 0;
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.taxToPay()));
			sum += taxPayer.taxToPay();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}