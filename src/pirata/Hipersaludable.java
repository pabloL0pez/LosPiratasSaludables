package pirata;

public class Hipersaludable extends Estado {

	public Hipersaludable() {
		this.estadoActual = EstadoPirata.HIPERSALUDABLE;
	}
	
	@Override
	public Estado beberJugo() {
		return this;
	}

	@Override
	public Estado beberGrog() {
		return new Saludable();
	}

	@Override
	public int setAtaque() {
		return 10;
	}

	@Override
	public int setDefensa() {
		return -2;
	}
}
