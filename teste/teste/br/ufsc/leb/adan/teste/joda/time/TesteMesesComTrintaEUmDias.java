package teste.br.ufsc.leb.adan.teste.joda.time;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class TesteMesesComTrintaEUmDias {

	private Integer diaTrintaEDois;

	@Before
	public void setup() {
		diaTrintaEDois = 32;
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesJaneiro() throws Exception {
		new LocalDate(2018, 1, diaTrintaEDois);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesMarco() throws Exception {
		new LocalDate(2018, 3, diaTrintaEDois);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesMaio() throws Exception {
		new LocalDate(2018, 5, diaTrintaEDois);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesJulho() throws Exception {
		new LocalDate(2018, 7, diaTrintaEDois);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesAgosto() throws Exception {
		new LocalDate(2018, 8, diaTrintaEDois);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesOutubro() throws Exception {
		new LocalDate(2018, 10, diaTrintaEDois);
	}

	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesDezembro() throws Exception {
		new LocalDate(2018, 12, diaTrintaEDois);
	}
}
