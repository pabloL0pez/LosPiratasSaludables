package pirata;

/**
 * Saludable: Ataque = 5, Defensa = 2 <br>
 * Escorbuto: Ataque = 2, Defensa = 0 <br>
 * Hipersaludable: Ataque = 10, Defensa = -2
 * @author me
 */

public abstract class Estado {
	
	EstadoPirata estadoActual;
	
	public abstract Estado beberJugo();

	public abstract Estado beberGrog();

	public EstadoPirata getEstadoActual() {
		return estadoActual;
	}
	
	public abstract void setAtributosPirata(Pirata pirata);
	
}
