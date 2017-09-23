package pirata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPirata {
	
	private Pirata pirata;
	
	@Before
	public void seInstancia() {
		 this.pirata = new Pirata();
	}
	
	@Test
	public void queArranqueSaludable() {
		Assert.assertEquals(5, pirata.getAtaque());
		Assert.assertEquals(2, pirata.getDefensa());
	}
	
	@Test
	public void quePasaAHipersaludable() {
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirata.getEstadoActual().getEstadoActual());
	}
	
	@Test
	public void quePasaAEscorbuto() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirata.getEstadoActual().getEstadoActual());
	}
	
	@Test
	public void quePasaDeHiperASaludable() {
		this.pirata.beberJugo();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstadoActual().getEstadoActual());
	}
	
	@Test
	public void quePasaDeEscorbutoASaludable() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstadoActual().getEstadoActual());
	}
	
	@Test
	public void saludableAtacaSaludable() {
		Pirata atacante = new Pirata();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(3, atacante.getPuntos());
	}
	
	@Test
	public void hipersaludableAtacaSaludable() {
		Pirata atacante = new Pirata();
		atacante.beberJugo();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(8, atacante.getPuntos());
	}
	
	@Test
	public void escorbutoAtacaSaludable() {
		Pirata atacante = new Pirata();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(0, atacante.getPuntos());
	}
	
	@Test
	public void saludableAtacaHipersaludable() {
		Pirata atacante = new Pirata();
		this.pirata.beberJugo();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(7, atacante.getPuntos());
	}
	
	@Test
	public void hipersaludableAtacaHipersaludable() {
		Pirata atacante = new Pirata();
		this.pirata.beberJugo();
		atacante.beberJugo();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(12, atacante.getPuntos());
	}
	
	@Test
	public void escorbutoAtacaHiperSaludable() {
		Pirata atacante = new Pirata();
		this.pirata.beberJugo();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(4, atacante.getPuntos());
	}
	
	@Test
	public void saludableAtacaEscorbuto() {
		Pirata atacante = new Pirata();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(5, atacante.getPuntos());
	}
	
	@Test
	public void hipersaludableAtacaEscorbuto() {
		Pirata atacante = new Pirata();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		atacante.beberJugo();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(10, atacante.getPuntos());
	}
	
	@Test
	public void escorbutoAtacaEscorbuto() {
		Pirata atacante = new Pirata();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.beberGrog();
		atacante.atacarA(this.pirata);
		Assert.assertEquals(2, atacante.getPuntos());
	}
}
