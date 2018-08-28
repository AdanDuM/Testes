package teste.br.ufsc.leb.adan.teste.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.Test;

public class TesteOperacaoEntreHorarios {
	
	private LocalTime meiaNoite;
	private LocalTime umMilisegundoAntesDaMeiaNoite;

	@Before
	public void setup() {
		meiaNoite = new LocalTime(0, 0);
		umMilisegundoAntesDaMeiaNoite = new LocalTime(23, 59, 59, 999);
	}
	
	@Test
	public void subtraiMilisegundoDeHorario() throws Exception {
		LocalTime horarioAnterior = meiaNoite.minusMillis(1);
		assertEquals(umMilisegundoAntesDaMeiaNoite, horarioAnterior);
	}
	
	@Test
	public void comparaSeHorarioEhAnteriorAOutro() throws Exception {
		assertFalse(umMilisegundoAntesDaMeiaNoite.isBefore(meiaNoite));;
	}
	
	@Test
	public void comparaSeHorarioEhPosteriorAOutro() throws Exception {
		assertFalse(meiaNoite.isAfter(umMilisegundoAntesDaMeiaNoite));;
	}

}
