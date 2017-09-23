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
	public void setAtributosPirata(Pirata pirata) {
		pirata.setAtaque(2);
		pirata.setDefensa(0);
	}
	
}
