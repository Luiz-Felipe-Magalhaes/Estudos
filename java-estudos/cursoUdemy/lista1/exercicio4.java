package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio4 {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codFuncionario;
		double horasTrabalhadas, salarioHora, salarioMes;
		
		System.out.print("Codigo do funcionario: ");
		codFuncionario = sc.nextInt();
		
		System.out.print("Horas trabalhadas no mês: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.print("Salario hora: R$");
		salarioHora = sc.nextDouble();
		
		salarioMes = horasTrabalhadas * salarioHora;
		
		System.out.printf("Funcionario: %d\nSalario no Mês: R$%.2f",codFuncionario, salarioMes);
		
	}

}
