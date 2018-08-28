package teste.br.ufsc.leb.adan.teste.joda.time;

import static org.junit.Assert.assertEquals;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.junit.Test;

public class TesteLocalTime {

	@Test
	public void criaHora() throws Exception {
		LocalTime meioDia = new LocalTime(12, 0, 0);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComHoraAbaixoDoLimite() throws Exception {
		new LocalTime(-1, 0);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComHoraAcimaDoLimite() throws Exception {
		new LocalTime(24, 0);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComMinutoAbaixoDoLimite() throws Exception {
		new LocalTime(0, -1);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComMinutoAcimaDoLimite() throws Exception {
		new LocalTime(0, 60);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComSegundoAbaixoDoLimite() throws Exception {
		new LocalTime(0, 0, -1);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaLocalTimeComSegundoAcimaDoLimite() throws Exception {
		new LocalTime(0, 0, 60);
	}
	
}
