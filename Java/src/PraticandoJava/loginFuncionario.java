package praticandoJava;

import java.util.Scanner;

public class loginFuncionario 
{
	public static void main (String args[])
	{
		String codCorreto = "1234";
		String senhaCorreta = "9999";
		String codUsuario, senhaUsuario;
		char opcao = '1';
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu código de usuario: ");
		codUsuario = leia.next();
		
		if (!codCorreto.equals(codUsuario))
		{
			System.out.println("Usuario inválido!");
		}
		else
		{
			do
			{	
				System.out.print("Digite a senha: ");
				senhaUsuario = leia.next();
				
				if (senhaCorreta.equals(senhaUsuario))
				{
					System.out.println("Acesso Permitido");
					break;
				}
				else
				{
					
					System.out.print("\nSenha incorreta.\n[1] - Tentar Novamente\n[0] - Encerrar Sistema\nDigite a opção desejada: ");
					opcao = leia.next().charAt(0);
					
					if (opcao == '0')
					{
						opcao = '0';
						break;
					}
				}
			}
			while (opcao == '1');
			
		}
	}
}
