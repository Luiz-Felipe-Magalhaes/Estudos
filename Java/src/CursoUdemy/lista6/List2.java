package cursoUdemy.lista6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class List2 {

	public static void main(String[] main) {

		Scanner sc = new Scanner(System.in);

		int qtdFuncionarios, idFuncionario;
		String nomeFuncionario;
		double salarioFuncionario;

		List<Empregado> empregado = new ArrayList<>();

		System.out.println("Quantos funcionarios serão registrados?");
		qtdFuncionarios = sc.nextInt();

		for (int i = 1; i <= qtdFuncionarios; i++) {
			System.out.println("Empregado #" + i + ":");

			System.out.println("Id: ");
			idFuncionario = sc.nextInt();

			while (validaId(empregado, idFuncionario)) {
				System.out.print("Id invalido. Tente novamente: ");
				idFuncionario = sc.nextInt();
			}

			System.out.println("Nome: ");
			nomeFuncionario = sc.next();

			System.out.println("Salario: ");
			salarioFuncionario = sc.nextDouble();

			empregado.add(new Empregado(idFuncionario, nomeFuncionario, salarioFuncionario));
		}
	}

	// Metodo para validar se Id já existe
	public static boolean validaId(List<Empregado> empregado, int id) {
		Empregado emp = empregado.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	// Metodo para buscar Id na lista
	public static Integer buscaId(List<Empregado> empregado, int id) {
		for (int i = 0; i < empregado.size(); i++) {
			if (empregado.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
