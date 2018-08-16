package teste.br.ufsc.leb.adan.teste;

import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class Triangulo implements Poligonos {
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;
	
	private static final Integer TAMANHO_MAXIMO = Integer.MAX_VALUE;
	
	public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) throws ExcecaoEntradaInvalida {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		if (!ehValido()) {
			throw new ExcecaoEntradaInvalida();
		}
	}
	
	public Boolean ehTriangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
		return Boolean.TRUE;
	}
	
	public Boolean ehEquilatero() {
		return Boolean.FALSE;
	}
	
	public Boolean ehIsoceles() {
		return Boolean.FALSE;
	}
	
	public Boolean ehEscaleno() {
		return Boolean.FALSE;
	}

	private Boolean ehValido() {
		if (temArgumentoNulo() || temArgumentoIgualZero() || temArgumentoNegativo() || temArgumentoGrande()) return false;
		return Boolean.TRUE;
	}
	
	private Boolean temArgumentoNulo() {
		if (ladoA == null || ladoB == null || ladoC == null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private Boolean temArgumentoIgualZero() {
		if (ladoA == 0 || ladoB == 0 || ladoC == 0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private Boolean temArgumentoNegativo() {
		if (ladoA < 0 || ladoB < 0 || ladoC < 0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private Boolean temArgumentoGrande() {
		if (ladoA >= TAMANHO_MAXIMO || ladoB >= TAMANHO_MAXIMO || ladoC >= TAMANHO_MAXIMO) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public Integer getLadoA() {
		return ladoA;
	}

	public void setLadoA(Integer ladoA) {
		this.ladoA = ladoA;
	}

	public Integer getLadoB() {
		return ladoB;
	}

	public void setLadoB(Integer ladoB) {
		this.ladoB = ladoB;
	}

	public Integer getLadoC() {
		return ladoC;
	}

	public void setLadoC(Integer ladoC) {
		this.ladoC = ladoC;
	}

}