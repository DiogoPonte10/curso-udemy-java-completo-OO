package aplicattion;
import java.util.Locale;
import java.util.Scanner;
import Entities.Account;

public class Testes {
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double initialDeposit;
	char resp;

	System.out.print("Enter acount number: ");
	int accNumber = sc.nextInt();
	System.out.print("Enter acount holder: ");
	sc.nextLine();
	String accHolder = sc.nextLine();

	System.out.print("Is there na initial deposit (y/n)? ");
	resp = sc.next().charAt(0);
	if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
	} else {
			initialDeposit = 0;
	}

	Account acc = new Account(accNumber, accHolder, initialDeposit);

	System.out.println();
	System.out.println("Account data:");
	acc.accountData();

	System.out.print("Enter a deposit value: ");
	acc.deposit(sc.nextDouble());

	System.out.println("Update account data:");
	acc.accountData();

	System.out.print("Enter a withdraw value: ");
	acc.withdraw(sc.nextDouble());

	System.out.println("Update account data:");
	acc.accountData();

	sc.close();
	}
}
