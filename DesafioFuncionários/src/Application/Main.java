package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> func = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(name, id, salary);

			func.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = positionId(func, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			func.get(pos).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : func) {
			emp.showInformations();
		}

		sc.close();
	}

		public static Integer positionId(List<Employee> list, int id) {
			for (int i = 0; i < list.size(); i++){
				if (list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
		}
}
