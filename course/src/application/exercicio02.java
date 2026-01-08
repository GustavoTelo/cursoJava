package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name = sc.nextLine();
		System.out.printf("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		System.out.print("Employee: " + employee);
		System.out.println();
		System.out.printf("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("uptade data: " + employee);
		
		
		
		
		
		
		
		sc.close();

	}

}
