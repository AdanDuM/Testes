package br.ufsc.leb.douglas.codigos;

public class Calculadora {

	private Integer resultado;

	public Integer obterResultado() {
		return resultado;
	}

	public void soma(Integer operando1, Integer operando2) {
		resultado=operando1+operando2;
	}

}
