package teste.br.ufsc.leb.adan.teste.formas.geometricas;

import br.ufsc.leb.adan.codigos.formas.geometricas.Linha;
import br.ufsc.leb.adan.codigos.formas.geometricas.TrianguloEquilatero;
import teste.br.ufsc.leb.adan.teste.formas.geometricas.triangulo.excecoes.ExcecaoEntradaInvalida;

public class TrianguloEquilateroComLinha extends TrianguloEquilatero {
	
	private Linha a;
	private Linha b;
	private Linha c;

	public TrianguloEquilateroComLinha(Linha a, Linha b, Linha c) throws ExcecaoEntradaInvalida {
		super(3);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Linha obterLinhaA() {
		return a;
	}

	public Linha obterLinhaB() {
		return b;
	}

	public Linha obterLinhaC() {
		return c;
	}

}
