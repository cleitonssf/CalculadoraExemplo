package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class testarCalculadora {

	@Test
	public void testQuandoDoisNumerosForamFornecidosRetornarASoma() {
		//cen�rio 
		int a=2; 
	    int b=6;
		Calculadora calculadora = new Calculadora();
		//a��o calculadora
		int resultadoObtido = calculadora.soma(a,b);
		//verifica��o 
		assertEquals (a+b, resultadoObtido);
	}

}
