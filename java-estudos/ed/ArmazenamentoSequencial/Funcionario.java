package ed.ArmazenamentoSequencial;

public class Funcionario {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario outro = (Funcionario) obj; 
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	
}
