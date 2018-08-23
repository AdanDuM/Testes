package teste.br.ufsc.leb.adan.teste;

public class Linha {

	private Ponto ponto1;
	private Ponto ponto2;

	public Linha(Ponto ponto1, Ponto ponto2) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}

	public Ponto obterPonto1() {
		return ponto1;
	}

	public Ponto obterPonto2() {
		return ponto2;
	}

}
