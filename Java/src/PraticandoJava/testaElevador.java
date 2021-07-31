package praticandoJava;

import java.util.Scanner;

public class testaElevador 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Elevador elevadorTeste  = new Elevador(0, 5, 10, 0);
		
		int opcao;
		
		elevadorTeste.inicializa(elevadorTeste.getCapacidadePessoas(), elevadorTeste.getTotalAndares());
		elevadorTeste.setAndarAtual(0);
		
		do
		{	
			System.out.print("[1]Entrada de Usuario\n[2]Saida de Usuario\n"
					+ "[3]Subir\n[4]Descer\nDigite a opção desejada: ");
			opcao = leia.nextInt();
	
			if (opcao == 1)
			{
				elevadorTeste.entrarUsuario(elevadorTeste.getOcupantesAtual());
			}
			if (opcao == 2)
			{
				elevadorTeste.sairUsuario(elevadorTeste.getOcupantesAtual());
			}
			if (opcao == 3)
			{
				elevadorTeste.subir(elevadorTeste.getAndarAtual(), elevadorTeste.getTotalAndares());
			}
			if (opcao == 4)
			{
				elevadorTeste.descer(elevadorTeste.getAndarAtual(), elevadorTeste.getTotalAndares());
			}
			
		}
		while (true);

	}

}
