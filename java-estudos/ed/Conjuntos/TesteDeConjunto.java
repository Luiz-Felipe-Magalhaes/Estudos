package ed.Conjuntos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDeConjunto {

	public static void main(String[] args) {

		LinkedList<String> conjunto = new LinkedList<String>();

		Conjunto conjunto1 = new Conjunto();
        conjunto1.adiciona("Mauricio");
        System.out.println(conjunto1);

        conjunto1.adiciona("Mauricio");
        System.out.println(conjunto1);
       
        conjunto1.adiciona("Marcelo");
        conjunto1.adiciona("Guilherme");
        System.out.println(conjunto1);
        
        conjunto1.remove("Mauricio");
        System.out.println(conjunto1);
        
        Set<String> conjuntoDoJava = new HashSet<String>();
        conjuntoDoJava.add("Mauricio");
        System.out.println(conjuntoDoJava);
        
        String x = "Guilherme";
        System.out.println(x.hashCode());
    }

}
