package teste.br.ufsc.leb.adan.teste;

<<<<<<< HEAD
import teste.br.ufsc.leb.adan.teste.triangulo.excecoes.ExcecaoEntradaInvalida;

public class Triangulo implements Poligonos {
=======
public abstract class Triangulo {
>>>>>>> 22c21dfd663faa8284ed098f43f99be2397a4c75
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;
	
<<<<<<< HEAD
	private static final Integer TAMANHO_MAXIMO = Integer.MAX_VALUE;
	
	public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) throws ExcecaoEntradaInvalida {
=======
	private final Integer tamanhoMaximo = Integer.MAX_VALUE;
	
	public <T> Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
>>>>>>> 22c21dfd663faa8284ed098f43f99be2397a4c75
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		if (!ehValido()) {
<<<<<<< HEAD
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
	
=======
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
	
>>>>>>> 22c21dfd663faa8284ed098f43f99be2397a4c75
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
<<<<<<< HEAD
		if (ladoA >= TAMANHO_MAXIMO || ladoB >= TAMANHO_MAXIMO || ladoC >= TAMANHO_MAXIMO) {
=======
		if (ladoA > tamanhoMaximo || ladoB > tamanhoMaximo || ladoC > tamanhoMaximo) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private Boolean temDoisLadosMaiorOuIgualAoTerceiro() {
		if (ladoA + ladoB >= ladoC || ladoB + ladoC >= ladoA || ladoA + ladoC >= ladoB) {
>>>>>>> 22c21dfd663faa8284ed098f43f99be2397a4c75
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
<<<<<<< HEAD
		this.ladoB = ladoB;
=======
		ladoB = ladoB;
>>>>>>> 22c21dfd663faa8284ed098f43f99be2397a4c75
	}

	public Integer getLadoC() {
		return ladoC;
	}

	public void setLadoC(Integer ladoC) {
		this.ladoC = ladoC;
	}

}