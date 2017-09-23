package pirata;

public class Pirata {
	
	private int ataque;
	private int defensa;
	private int puntos;
	
	private Estado estadoActual;
	
	public Pirata() {
		this.puntos = 0;
		this.estadoActual = new Saludable();
		estadoActual.setAtributosPirata(this);
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public Estado getEstadoActual() {
		return this.estadoActual;
	}
	
	public int getPuntos() {
		return this.puntos;
	}

	public void beberJugo() {
		Estado estadoAnterior = this.estadoActual;
		this.estadoActual = this.estadoActual.beberJugo();
		if(this.estadoActual.getEstadoActual() != estadoAnterior.getEstadoActual()) {
			this.estadoActual.setAtributosPirata(this);
		}
	}
	
	public void beberGrog() {
		Estado estadoAnterior = this.estadoActual;
		this.estadoActual = this.estadoActual.beberGrog();
		if(this.estadoActual != estadoAnterior) {
			this.estadoActual.setAtributosPirata(this);
		}
	}
	
	public void atacarA(Pirata pirata) {
		this.puntos += this.ataque - pirata.defensa;
	}

}
