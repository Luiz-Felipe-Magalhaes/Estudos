package ed.ListaDuplamenteLigada;

public class Celula {

	private Object elemento;
	private Celula proxima;
	private Celula anterior;

	public Celula(Object elemento, Celula proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public Celula(Object elemento) {
		this(elemento, null);
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
}
