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
	public void setAtributosPirata(Pirata pirata) {
		pirata.setAtaque(10);
		pirata.setDefensa(-2);
	}

}
