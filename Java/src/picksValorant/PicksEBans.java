package picksValorant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PicksEBans {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Mapa ascent = new Mapa("Ascent");
		Mapa bind = new Mapa("Bind");
		Mapa breeze = new Mapa("Breeze");
		Mapa fracture = new Mapa("Fracture");
		Mapa haven = new Mapa("Haven");
		Mapa icebox = new Mapa("Icebox");
		Mapa split = new Mapa("Split");
		Mapa vazio = new Mapa(" --- ");

		int escolha = 0;
		Mapa pickTimeA = null, pickTimeB = null;

		List<Mapa> listaMapas = new ArrayList<Mapa>(
				Arrays.asList(new Mapa[] { ascent, bind, breeze, fracture, haven, icebox, split }));

		List<Mapa> bansTimeA = new ArrayList<Mapa>();
		List<Mapa> bansTimeB = new ArrayList<Mapa>();

		System.out.println(
				"\n<-----------------------------PICKS E BANS VAVA----------------------------->\n");

		System.out.println(" | 1-" + ascent.getNomeMapa() + " | 2-" + bind.getNomeMapa() + " | 3-"
				+ breeze.getNomeMapa() + " | 4-" + fracture.getNomeMapa() + " | 5-" + haven.getNomeMapa() + " | 6-"
				+ icebox.getNomeMapa() + " | 7-" + split.getNomeMapa() + " | \n");

		for (int i = 0; i < 6; i++) {

			if (i == 4 || i == 6) {
				System.out.println("\n" + listaMapas);
			}

			if (i == 0 || i == 4 || i == 6) {
				System.out.print("Ban Time A: ");
				escolha = sc.nextInt();
				
				if (listaMapas.get(escolha - 1) == vazio) {
					do {
						System.out.print("Opção invalida. Escolha outro mapa: ");
						escolha = sc.nextInt();
					} while (listaMapas.get(escolha - 1) == vazio);
					
				}
				
				bansTimeA.add(listaMapas.get(escolha - 1));
				listaMapas.set(escolha - 1, null);
				
				

			} else if (i == 1 || i == 5 || i == 7) {
				System.out.println("\n" + listaMapas);				
				System.out.print("Ban Time B: ");
				escolha = sc.nextInt();
				
				if (listaMapas.get(escolha - 1) == vazio) {
					do {
						System.out.print("Opção inválida. Escolha novamente: ");
						escolha = sc.nextInt();
					} while (listaMapas.get(escolha - 1) == vazio);
					
				}
				
				bansTimeB.add(listaMapas.get(escolha - 1));
				listaMapas.set(escolha - 1, null);
			}

			else if (i == 2) {
				System.out.println("\n" + listaMapas);
				System.out.print("Pick Time A: ");
				escolha = sc.nextInt();
				
				if (listaMapas.get(escolha - 1) == vazio) {
					do {
						System.out.print("Opção inválida. Escolha outro mapa: ");
						escolha = sc.nextInt();
					} while (listaMapas.get(escolha - 1) == vazio);
					
				}
				
				pickTimeA = listaMapas.get(escolha - 1);
				listaMapas.set(escolha - 1, null);
			}

			else if (i == 3) {
				System.out.println("\n" + listaMapas);
				System.out.print("Pick Time B: ");
				escolha = sc.nextInt();
				
				if (listaMapas.get(escolha - 1) == vazio) {
					do {
						System.out.print("Opção inválida. Escolha outro mapa: ");
						escolha = sc.nextInt();
					} while (listaMapas.get(escolha - 1) == vazio);
					
				}
				
				pickTimeB = listaMapas.get(escolha - 1);
				listaMapas.set(escolha - 1, null);
			}

			if (listaMapas.get((escolha - 1)) == null) {
				listaMapas.set(escolha - 1, vazio);
			}

		}
		
		for (int i = 0; i < 7; i++) {
			if (listaMapas.get(i) == vazio) {
				listaMapas.set(i, null);
			}
		}
		
		listaMapas.removeIf(Objects::isNull);
		
		System.out.println("\nBans Time A: " + bansTimeA);
		System.out.println("Bans Time B: " + bansTimeB);
		System.out.println("\nPick Time A: " + pickTimeA);
		System.out.println("Pick Time B: " + pickTimeB);
		System.out.println("\nMapa Desempate: " + listaMapas);
		
		sc.close();
	}

}
