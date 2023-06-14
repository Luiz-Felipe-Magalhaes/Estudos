package ed.ArmazenamentoSequencial;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	
	//Adiciona um aluno;
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	//Verifica se existe a posição no vetor
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}
	
	//Aumenta Lista caso atinja o maximo da lista anterior
	private void garanteEspaco() {
		if(totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for(int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	//Adiciona um aluno numa posição desejada
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}

		for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}

		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	
	//Verifica se a posicao do vetor esta ocupada
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	//Pega um aluno de determinada posição
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}
		return alunos[posicao];
	}

	
	//Remove um aluno;
	public void remove(int posicao) {
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		
		totalDeAlunos--;
	}
	
	//Verifica se existe o aluno na lista
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	//Verifica a quantidade de alunos na lista
	public int tamanho() {
		return totalDeAlunos;
	}

	//String dos alunos da lista;
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
