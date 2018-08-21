package teste.br.ufsc.leb.adan.teste;

public class Linha {
	
	private Ponto a;
	private Ponto b;

	public Linha(Ponto a, Ponto b) {
		this.a = a;
		this.b = b;
	}

	public Integer obterTamanho() {
		Integer distancia = new Integer((int)(Math.sqrt(Math.pow((a.obterCoordenadaX() - b.obterCoordenadaX()), 2) + 
				Math.pow((a.obterCoordenadaY() - b.obterCoordenadaY()), 2))));
		return distancia;
	}

}
