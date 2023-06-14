package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio3 {

	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D).
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, produtoAB, produtoCD;		
		
		System.out.println("Digite os valores de A, B, C e D, respectivamente:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("A: "+ a);
		System.out.println("B: "+ b);
		System.out.println("C: "+ c);
		System.out.println("D: "+ d);
		
		produtoAB = a * b;
		produtoCD = c * d;
		
		System.out.printf("Subtração dos produtos (%d x %d) - (%d x %d) = %d",a,b,c,d,(produtoAB - produtoCD));		
		
	}

}
