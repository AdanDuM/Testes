package teste.br.ufsc.leb.adan.teste.formas.geometricas;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.leb.adan.codigos.formas.geometricas.Triangulo;
import teste.br.ufsc.leb.adan.teste.formas.geometricas.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TesteTriangulo {
	
	private static final Integer TAMANHO_MAXIMO = Integer.MAX_VALUE;
	
	private Integer tamanhoNulo;
	private Integer tamanhoZero;
	private Integer tamanhoNegativo;
	private Integer tamanhoMaximo;
	
	@Before
	public void setupVariaveis() {
		tamanhoNulo = null;
		tamanhoZero = 0;
		tamanhoNegativo = -3;
		tamanhoMaximo = TAMANHO_MAXIMO;
	}
	
	@Test
	public void criaTrianguloValido() {
	}	
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNull_1() throws ExcecaoEntradaInvalida {
		new Triangulo(tamanhoNulo, 4, 5);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNull_2() throws ExcecaoEntradaInvalida {
		new Triangulo(3, tamanhoNulo, 5);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNull_3() throws ExcecaoEntradaInvalida {
		new Triangulo(3, 4, tamanhoNulo);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoZero() throws Exception {
		new Triangulo(tamanhoZero, tamanhoZero, tamanhoZero);	
	}

	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoZero_1() throws ExcecaoEntradaInvalida {
		new Triangulo(tamanhoZero, 3, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoZero_2() throws ExcecaoEntradaInvalida {
		new Triangulo(3, tamanhoZero, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoZero_3() throws ExcecaoEntradaInvalida {
		new Triangulo(3, 3, tamanhoZero);
	}

	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoMaximo_1() throws ExcecaoEntradaInvalida {
		new Triangulo(tamanhoMaximo, 3, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoMaximo_2() throws ExcecaoEntradaInvalida {
		new Triangulo(3, tamanhoMaximo, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoMaximo_3() throws ExcecaoEntradaInvalida {
		new Triangulo(3, 3, tamanhoMaximo);
	}

	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNegativo_1() throws ExcecaoEntradaInvalida {
		new Triangulo(tamanhoNegativo, 3, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNegativo_2() throws ExcecaoEntradaInvalida {
		new Triangulo(3, tamanhoNegativo, 3);
	}
	
	@Test(expected = ExcecaoEntradaInvalida.class)
	public void criaComTamanhoNegativo_3() throws ExcecaoEntradaInvalida {
		new Triangulo(3, 3, tamanhoNegativo);
	}

}
