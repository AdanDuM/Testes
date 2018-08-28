package br.ufsc.leb.adan.codigos.formas.geometricas;

import br.ufsc.leb.adan.codigos.Poligonos;
import teste.br.ufsc.leb.adan.teste.formas.geometricas.triangulo.excecoes.ExcecaoEntradaInvalida;

public class Triangulo implements Poligonos {
	
	private static final Integer TAMANHO_MAXIMO = Integer.MAX_VALUE;
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;	
	
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
		if (temTamanhoDeLadoNulo() || temTamanhoDeLadoIgualZero() || temTamanhoDeLadoNegativo() || 
				temTamanhoDeLadoMaiorQueLimite() || temTamanhoDeLadoIgualQueSomaDosOutrosDois() || temTamanhoDeLadoMaiorQueSomaDosOutrosDois()) return Boolean.FALSE;
		return Boolean.TRUE;
	}
	
	private Boolean temTamanhoDeLadoNulo() {
		return ladoA == null || ladoB == null || ladoC == null;
	}

	private Boolean temTamanhoDeLadoIgualZero() {
		return ladoA == 0 || ladoB == 0 || ladoC == 0;
	}
	
	private Boolean temTamanhoDeLadoNegativo() {
		return ladoA < 0 || ladoB < 0 || ladoC < 0;
	}
	
	private Boolean temTamanhoDeLadoMaiorQueLimite() {
		return TAMANHO_MAXIMO < ladoA || TAMANHO_MAXIMO < ladoB || TAMANHO_MAXIMO < ladoC;
	}
	
	private Boolean temTamanhoDeLadoIgualQueSomaDosOutrosDois() {
		return ladoA == ladoB + ladoC || ladoB == ladoA + ladoC || ladoC == ladoA + ladoB;
	}
	
	private Boolean temTamanhoDeLadoMaiorQueSomaDosOutrosDois() {
		return ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB;
	}
	
	public Integer getLadoA() {
		return ladoA;
	}

	public Integer getLadoB() {
		return ladoB;
	}

	public Integer getLadoC() {
		return ladoC;
	}

}