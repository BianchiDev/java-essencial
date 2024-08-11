package nelioOO;

import java.util.Scanner;

import entities.employee;

public class EmployeeResult {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee: ");
		String name = scanner.nextLine();

		System.out.println("Enter the gross salary of the employee: ");
		double grossSalary = scanner.nextDouble();

		System.out.println("Enter the tax of the employee: ");
		double tax = scanner.nextDouble();

		employee employee1 = new employee(name, grossSalary, tax);

		System.out.println("Employee data: " + employee1);

		System.out.println("Which percentage to increase salary? ");
		double percentage = scanner.nextDouble();

		employee1.increaseSalary(percentage);

		System.out.println("Updated data: " + employee1);

		scanner.close();
	}

}
