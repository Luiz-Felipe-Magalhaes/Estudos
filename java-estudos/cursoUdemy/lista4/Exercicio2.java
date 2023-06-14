package cursoUdemy.lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee empregado = new Employee();

		System.out.print("Name: ");
		empregado.name = sc.nextLine();

		System.out.print("Gross salary: ");
		empregado.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();

		System.out.printf("Employee: %s, $ %.2f \n", empregado.name, empregado.netSalary());

		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();

		empregado.increaseSalary(porcentagem);

		System.out.println("Update data: " + empregado);
		

	}

}
