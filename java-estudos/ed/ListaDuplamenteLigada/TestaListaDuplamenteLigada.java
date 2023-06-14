package ed.ListaDuplamenteLigada;

public class TestaListaDuplamenteLigada {

	public static void main(String[] args) {

		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

		lista.adicionaNoComeco("Mauricio");
		System.out.println(lista);

		lista.adicionaNoComeco("Guilherme");
		System.out.println(lista);

		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);

		lista.adiciona("Cecilia");
		System.out.println(lista);

		lista.removeDoComeco();
		System.out.println(lista);

		lista.adiciona("José");
		lista.adiciona("João");
		System.out.println(lista);

		lista.remove(2);
		System.out.println(lista);

		System.out.println(lista.contem("Mauricio"));
		System.out.println(lista.contem("Danilo"));
	
	}

}
