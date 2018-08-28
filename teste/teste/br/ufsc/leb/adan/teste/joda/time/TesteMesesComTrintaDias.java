package teste.br.ufsc.leb.adan.teste.joda.time;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class TesteMesesComTrintaDias {
	
	private Integer diaTrintaEUm;

	@Before
	public void setup() {
		diaTrintaEUm = 31;
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesAbril() throws Exception {
		new LocalDate(2018, 4, diaTrintaEUm);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesJunho() throws Exception {
		new LocalDate(2018, 6, diaTrintaEUm);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesSetembro() throws Exception {
		new LocalDate(2018, 9, diaTrintaEUm);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesNovembro() throws Exception {
		new LocalDate(2018, 11, diaTrintaEUm);
	}

}
