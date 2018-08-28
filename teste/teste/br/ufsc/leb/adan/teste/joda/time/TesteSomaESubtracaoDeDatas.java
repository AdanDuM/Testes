package teste.br.ufsc.leb.adan.teste.joda.time;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class TesteSomaESubtracaoDeDatas {

	@Test
	public void somaUmDiaAoUltimoDiaDeFevereiro() throws Exception {
		LocalDate fevereiro2018 = new LocalDate(2018, 2, 28);
		LocalDate diaSeguinte = fevereiro2018.plusDays(1);
		assertEquals(2018, diaSeguinte.getYear());
		assertEquals(3, diaSeguinte.getMonthOfYear());
		assertEquals(1, diaSeguinte.getDayOfMonth());
	}
	
	@Test
	public void subtraiUmDiaAoPrimeiroDiaDeMarco() throws Exception {
		LocalDate marco2016 = new LocalDate(2016, 3, 1);
		LocalDate diaAnterior = marco2016.minusDays(1);
		assertEquals(2016, diaAnterior.getYear());
		assertEquals(2, diaAnterior.getMonthOfYear());
		assertEquals(29, diaAnterior.getDayOfMonth());
	}
	
	@Test
	public void somaUmDiaAoUltimoDiaDoAno() throws Exception {
		LocalDate dezembro2018 = new LocalDate(2018, 12, 31);
		LocalDate diaSeguinte = dezembro2018.plusDays(1);
		assertEquals(2019, diaSeguinte.getYear());
		assertEquals(1, diaSeguinte.getMonthOfYear());
		assertEquals(1, diaSeguinte.getDayOfMonth());
	}
	
	@Test
	public void subtraiUmDiaAoPrimeiroDiaDoAno() throws Exception {
		LocalDate janeiro2018 = new LocalDate(2018, 1, 1);
		LocalDate diaAnterior = janeiro2018.minusDays(1);
		assertEquals(2017, diaAnterior.getYear());
		assertEquals(12, diaAnterior.getMonthOfYear());
		assertEquals(31, diaAnterior.getDayOfMonth());
	}
	
}
