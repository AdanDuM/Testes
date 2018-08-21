package teste.br.ufsc.leb.adan.teste;

public class Ponto {
	
	private Integer coordenadaX;
	private Integer coordenadaY;

	public Ponto(Integer coordenadaX, Integer coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public Integer obterCoordenadaX() {
		return coordenadaX;
	}

	public Integer obterCoordenadaY() {
		return coordenadaY;
	}

}
