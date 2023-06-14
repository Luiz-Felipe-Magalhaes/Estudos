package picksValorant;

public class Mapa {

	private String nomeMapa;

	public Mapa(String nomeMapa) {
		this.nomeMapa = nomeMapa;
	}

	public String getNomeMapa() {
		return nomeMapa;
	}

	public void setNomeMapa(String nomeMapa) {
		this.nomeMapa = nomeMapa;
	}

	/*
	 * @Override public String toString() { StringBuilder builder = new
	 * StringBuilder(" | ");
	 * 
	 * for(int i = 0; i < 1; i++) { builder.append(getNomeMapa()); }
	 * 
	 * builder.append(" | "); return builder.toString(); }
	 */
	
	@Override
	public String toString() {
		return this.nomeMapa;
	}

}
