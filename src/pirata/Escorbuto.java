package pirata;

public class Escorbuto extends Estado {

	public Escorbuto() {
		this.estadoActual = EstadoPirata.ESCORBUTO;
	}
	
	@Override
	public Estado beberJugo() {
		return new Saludable();
	}

	@Override
	public Estado beberGrog() {
		return this;
	}

	@Override
	public int setAtaque() {
		return 2;
	}

	@Override
	public int setDefensa() {
		return 0;
	}
	
	
	
}
