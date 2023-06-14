package cursoUdemy.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> empregados = new ArrayList<>();
		
		String nomeFuncionario;
		double salario, percentualAumento;
		int numFuncionarios, idFuncionario, idFuncionarioAumento;
		
		System.out.print("Quantos empregados você quer registrar? ");
		numFuncionarios = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= numFuncionarios; i++) {
			System.out.println("Empregado #"+ i +":");
			System.out.print("Id: ");
			idFuncionario = sc.nextInt();
			
			while (validaId(empregados, idFuncionario)) {
				System.out.print("Id já existente. Tente novamente: ");
				idFuncionario = sc.nextInt();
			}		
			
			System.out.print("Nome: ");
			sc.nextLine();
			nomeFuncionario = sc.nextLine();
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			System.out.println();
			
			empregados.add(new Empregado(idFuncionario, nomeFuncionario, salario));
		}
		
		System.out.print("Entre com o Id do Funcionario para aumentar seu salario: ");
		idFuncionarioAumento = sc.nextInt();
		
		if (buscaId(empregados, idFuncionarioAumento) == null) {
			System.out.println("Id não encontrado.");
		}
		else {
			System.out.print("Digite a porcentagem do aumento: ");
			percentualAumento = sc.nextDouble();
			empregados.get(buscaId(empregados, idFuncionarioAumento)).aumentaSalario(percentualAumento);		
		}
		
		System.out.println("Lista de funcionarios:");
		for (Empregado emp : empregados) {
			System.out.println(emp);
		}
		
	}
	
	public static boolean validaId(List<Empregado> empregados, int id) {
		Empregado emp = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer buscaId(List<Empregado>empregados, int idAumento) {
		for (int i = 0; i < empregados.size(); i++) {
			if (empregados.get(i).getId() == idAumento) {
				return i;
			}				
		}
		return null;
		
	}

}
