package teste.br.ufsc.leb.adan.teste;

public abstract class Triangulo {
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;
	
	private final Integer tamanhoMaximo = Integer.MAX_VALUE;
	
	public <T> Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		if (!ehValido()) {
			throw new IllegalArgumentException();
		}
	}
	
	public abstract Boolean ehEquilatero();
	
	public abstract Boolean ehIsoceles();
	
	public abstract Boolean ehEscaleno();

	private Boolean ehValido() {
		if (temArgumentoIgualZero() || temArgumentoNegativo() || temArgumentoGrande()) return false;
		return Boolean.TRUE;
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
		if (ladoA > tamanhoMaximo || ladoB > tamanhoMaximo || ladoC > tamanhoMaximo) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private Boolean temDoisLadosMaiorOuIgualAoTerceiro() {
		if (ladoA + ladoB >= ladoC || ladoB + ladoC >= ladoA || ladoA + ladoC >= ladoB) {
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
		ladoB = ladoB;
	}

	public Integer getLadoC() {
		return ladoC;
	}

	public void setLadoC(Integer ladoC) {
		this.ladoC = ladoC;
	}

}
