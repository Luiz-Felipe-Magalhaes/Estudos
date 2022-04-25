package ed.ArmazenamentoSequencial;

import java.util.Arrays;

public class ListaFuncionarios {

	private Funcionario[] funcionarios = new Funcionario[10];
	private int totalDeFuncionarios;

	// Adiciona um funcionario
	public void adiciona(Funcionario funcionario) {
		this.garanteEspaco();
		this.funcionarios[totalDeFuncionarios] = funcionario;
		totalDeFuncionarios++;
	}

	// Verifica se existe a posição na lista, se é valida
	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeFuncionarios;
	}

	// Aumenta Lista caso atinja o maximo do tamanho
	public void garanteEspaco() {
		if (totalDeFuncionarios == funcionarios.length) {
			Funcionario[] novoArray = new Funcionario[funcionarios.length * 2];
			for (int i = 0; i < funcionarios.length; i++) {
				novoArray[i] = funcionarios[i];
			}
			this.funcionarios = novoArray;
		}
	}

	// Adiciona um funcionario numa posição desejada
	public void adiciona(int posicao, Funcionario funcionario) {
		this.garanteEspaco();
		
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicão invalida");
		}
		
		for (int i = totalDeFuncionarios -1; i >= posicao; i -= 1) {
			funcionarios[i + 1] = funcionarios[i];
		}
		
		funcionarios[posicao] = funcionario;
		totalDeFuncionarios++;
	}

	// Verifica se a posicao da lista esta ocupada
	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeFuncionarios;
	}

	// Pega um funcionario de determinada posição na lista
	public Funcionario buscaFuncionario(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicão invalida");
		}
		return funcionarios[posicao];
	}

	// Remove um funcionario;
	public void remove(int posicao) {
		for(int i = posicao; i < this.totalDeFuncionarios; i++) {
			this.funcionarios[i] = this.funcionarios[i+1];
		}
		totalDeFuncionarios--;
	}

	// Verifica se existe o funcionario na lista
	public boolean contem(Funcionario funcionario) {
		for(int i = 0; i < totalDeFuncionarios; i++) {
			if (funcionario.equals(funcionarios[i])) {
				return true;
			}
		}
		return false;
	}

	// Verifica a quantidade de funcionarios na lista
	public int tamanho() {
		return totalDeFuncionarios;
	}

	// String dos funcionarios da lista;

	@Override
	public String toString() {
		return Arrays.toString(funcionarios);
	}

}
