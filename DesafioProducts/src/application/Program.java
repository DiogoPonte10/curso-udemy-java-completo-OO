package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		 for (int i=1; i<=n; i++) {
			 System.out.println("Product #" + i + " data:");
			 System.out.print("Common, used or imported (c/u/i)? ");
			 char ch = sc.next().charAt(0);
			 System.out.print("Name: ");
			 String name = sc.next();
			 System.out.print("Price: ");
			 double price = sc.nextDouble();
			 if (ch == 'i') {
				 System.out.print("Customs fee: ");
				 double customsFee = sc.nextDouble();
				 list.add(new ImportedProduct(name, price, customsFee));
			 } else if (ch == 'u') {
				 System.out.println("Manufacture date (DD/MM/YYYY)");
				 LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				 list.add(new UsedProduct(name, price, manufactureDate));
			 } else {
				 list.add(new Product(name, price));
			 }
		 }

		 System.out.println();
		 System.out.println("PRICE TAGS:");
		 for (Product product : list) {
			 System.out.println(product.priceTag());
		 }
	}

}
