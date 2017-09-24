package pirata;

public class Saludable extends Estado {
	
	private int contGrog;

	public Saludable() {
		this.contGrog = 0;
		this.estadoActual = EstadoPirata.SALUDABLE;
	}
	
	@Override
	public Estado beberJugo() {
		this.contGrog = 0;
		return new Hipersaludable();
	}

	@Override
	public Estado beberGrog() {
		this.contGrog++;
		if(this.contGrog == 3) {
			this.contGrog = 0;
			return new Escorbuto();
		}
		return this;
	}
	
	@Override
	public int setAtaque() {
		return 5;
	}

	@Override
	public int setDefensa() {
		return 2;
	}
	
}
