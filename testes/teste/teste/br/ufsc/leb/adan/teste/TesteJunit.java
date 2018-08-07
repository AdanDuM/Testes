package teste.br.ufsc.leb.adan.teste;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TesteJunit {
	
	private final int numeroGrande = (int)Math.pow(2, 65);
	
	@Test
	public void primeiro() throws Exception {
		
		assertFalse(Triangulo.isTriangulo(0, 0, 0));
		
//		assertFalse(Triangulo.isTriangulo(null, 4, 5));
//		assertFalse(Triangulo.isTriangulo(3, null, 5));
//		assertFalse(Triangulo.isTriangulo(3, 4, null));
		
		assertFalse(Triangulo.isTriangulo(0, 4, 5));
		assertFalse(Triangulo.isTriangulo(3, 0, 5));
		assertFalse(Triangulo.isTriangulo(3, 4, 0));
		
		assertFalse(Triangulo.isTriangulo(-3, 4, 5));
		assertFalse(Triangulo.isTriangulo(3, -4, 5));
		assertFalse(Triangulo.isTriangulo(3, 4, -5));
		
		assertFalse(Triangulo.isTriangulo(numeroGrande, 4, 5));
		assertFalse(Triangulo.isTriangulo(3, numeroGrande, 5));
		assertFalse(Triangulo.isTriangulo(3, 4, numeroGrande));
		
		assertFalse(Triangulo.isTriangulo(2, 2, 4));
		assertFalse(Triangulo.isTriangulo(2, 4, 2));
		assertFalse(Triangulo.isTriangulo(4, 2, 2));
		
		assertFalse(Triangulo.isTriangulo(1, 4, 2));
		assertFalse(Triangulo.isTriangulo(2, 1, 4));
		assertFalse(Triangulo.isTriangulo(4, 2, 1));
		
		assertFalse(Triangulo.isTriangulo(3, 3, 3));
		assertFalse(Triangulo.isTriangulo(3, 4, 5));
		assertFalse(Triangulo.isTriangulo(4, 2, 4));
	}

}
