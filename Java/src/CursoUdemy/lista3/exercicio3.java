package cursoUdemy.lista3;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
	 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
	 * será encerrado quando o código informado for o número 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
	 * tipo de combustível, conforme exemplo.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codCombustivel, alcool=0, gasolina=0, diesel=0;
		
		System.out.print("1.Alcool\n2.Gasolina\n3.Diesel\n4.Fim\nEscolha uma opção: ");
		codCombustivel = sc.nextInt();
				
		while (codCombustivel != 4) {

			if (codCombustivel == 1) {
				alcool = alcool + 1;
			}
			
			else if (codCombustivel == 2) {
				gasolina = gasolina + 1;
			}
			
			else if (codCombustivel == 3) {
				diesel = diesel + 1;
			}
			
			else {
				if (codCombustivel != 4) {
					System.out.print("\nCodigo invalido");
				}	
			}
			
			System.out.print("\nEscolha uma opção: ");
			codCombustivel = sc.nextInt();
		}
			
		System.out.printf("Muito Obrigado\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

	}

}
