import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadTest {
	Utilidad U = new Utilidad();
	@Test
	public void CP1() {
		double esperado=0;
		double resultado = U.ejercicioD(0);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void CP2() {
		double esperado=4;
		double resultado = U.ejercicioD(2);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void CP3() {
		double esperado=9;
		double resultado = U.ejercicioD(3);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void CP4() {
		double esperado=28;
		double resultado = U.ejercicioD(4);
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void CP5() {
		double esperado=125;
		double resultado = U.ejercicioD(5);
		assertEquals(esperado, resultado, 0);
	}
}
