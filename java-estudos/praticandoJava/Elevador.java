package praticandoJava;

public class Elevador 
{
	//Atributos:
	private int andarAtual;
	private int totalAndares;
	private int capacidadePessoas;
	private int ocupantesAtual;
	
	//Construtores:
	public Elevador(int andarAtual, int totalAndares, int capacidadePessoas, int ocupantesAtual) 
	{
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadePessoas = capacidadePessoas;
		this.ocupantesAtual = ocupantesAtual;
	}

	//Getters and Setters:
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public int getOcupantesAtual() {
		return ocupantesAtual;
	}

	public void setOcupantesAtual(int ocupantesAtual) {
		this.ocupantesAtual = ocupantesAtual;
	}
	
	//Métodos:
	public void inicializa (int capacidade, int andaresTotal)
	{
		System.out.printf("Inicialização realizada.\nEsse elevador tem capacidade maxima de %d usuarios, "
				+ "e viaja do térreo até o %dº Andar.\n",this.capacidadePessoas, this.totalAndares);
		System.out.printf("\nAndar Atual: Térreo\nLotação Atual: %d pessoas\n\n",this.ocupantesAtual);
	}
		
	public void entrarUsuario (int ocupantes)
	{
		if (ocupantes < this.capacidadePessoas)
		{
			this.ocupantesAtual++;
			System.out.printf("\nLotação Atual: %d pessoas\n", this.ocupantesAtual);
			System.out.printf("Capacidade Maxima: %d pessoas\n\n",this.capacidadePessoas);
		}
		else
		{
			System.out.println("\nLimite de ocupantes atingido\n");
		}
	}
	
	public void sairUsuario (int ocupantes)
	{
		if (ocupantes > 0)
		{
			this.ocupantesAtual--;
			System.out.printf("\nLotação Atual: %d pessoas\n", this.ocupantesAtual);
			System.out.printf("Capacidade Maxima: %d pessoas\n\n",this.capacidadePessoas);
		}
		else 
		{
			System.out.println("\nNão há ninguém ocupando o elevador.\n");
		}
		
	}
	
	public void subir (int andarAtual, int andaresTotal)
	{
		int timer=6;
		if (andarAtual < andaresTotal)
		{
			this.andarAtual++;
			System.out.printf("Subindo... ");
			do
			{
				try 
				{
				    Thread.sleep(1000);                
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				timer--;
				System.out.printf("%d  ",timer);
			}
			while (timer > 1);
			try 
			{
			    Thread.sleep(1000);                
			} catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			System.out.printf("\n\nAndar Atual: %dºAndar\n\n",this.andarAtual);
		}
		else 
		{
			System.out.println("Estamos no ultimo andar.\n");
		}
		
	}
	
	public void descer (int andarAtual, int andaresTotal)
	{
		int timer=6;
		if (andarAtual > 0)
		{
			this.andarAtual--;
			System.out.printf("Descendo... ");
			do
			{
				try 
				{
				    Thread.sleep(1000);                
				} catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				timer--;
				System.out.printf("%d  ",timer);
			}
			while (timer > 1);
			try 
			{
			    Thread.sleep(1000);                
			} catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			if (this.andarAtual==0)
			{
				System.out.println("\n\nAndar Atual: Térreo\n");
			}
			else
			{
				System.out.printf("\n\nAndar Atual: %dºAndar\n\n",this.andarAtual);
			}
		}
		else 
		{
			System.out.println("\nEstamos no Térreo. Não é possivel descer.\n");
		}
	}
	
	
	/*
	 * Crie uma classe denominada Elevador para armazenar as informações de um elevador
		dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
		no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
		presentes nele. A classe deve também disponibilizar os seguintes métodos:
		Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
		andares no prédio (os elevadores sempre começam no térreo e vazio);
		Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
		espaço);
		Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
		dentro dele);
		Sobe : para subir um andar (não deve subir se já estiver no último andar);
		Desce : para descer um andar (não deve descer se já estiver no térreo);
		Encapsular todos os atributos da classe (criar os métodos set e get).

	 */
}
