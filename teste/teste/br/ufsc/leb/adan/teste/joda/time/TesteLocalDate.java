package teste.br.ufsc.leb.adan.teste.joda.time;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.junit.Test;

public class TesteLocalDate {
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataDeJaneiro() throws Exception {
		Integer diaAbaixoDoLimite = 0;
		new LocalDate(2018, 01, diaAbaixoDoLimite);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesAbaixoDoLimite() throws Exception {
		Integer mesAbaixoDoLimite = 0;
		new LocalDate(2018, mesAbaixoDoLimite, 01);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesAcimaDoLimite() throws Exception {
		Integer mesAcimaDoLimite = 13;
		new LocalDate(2018, mesAcimaDoLimite, 01);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesFevereiro_deveFalhar() throws Exception {
		Integer diaAcimaDoLimite = 29;
		new LocalDate(2018, 2, diaAcimaDoLimite);
	}
	
	@Test
	public void criaDataComMesFevereiro_devePassar() throws Exception {
		Integer diaAcimaDoLimite = 28;
		new LocalDate(2018, 2, diaAcimaDoLimite);
	}
	
	@Test
	public void criaDataComMesFevereiroEmAnoBissexto_devePassar() throws Exception {
		Integer diaAcimaDoLimite = 29;
		new LocalDate(2016, 2, diaAcimaDoLimite);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void criaDataComMesFevereiroEmAnoBissexto_deveFalhar() throws Exception {
		Integer diaAcimaDoLimite = 30;
		new LocalDate(2016, 2, diaAcimaDoLimite);
	}

}
