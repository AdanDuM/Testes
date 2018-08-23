package teste.br.ufsc.leb.adan.teste;

public class Circulo {

	private Ponto centro;
	private Double raio;

	public Circulo(Ponto centro, Double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto obterCentro() {
		return centro;
	}

	public Double obterRaio() {
		return raio;
	}

}
