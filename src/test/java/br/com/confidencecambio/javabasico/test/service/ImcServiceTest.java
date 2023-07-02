package br.com.confidencecambio.javabasico.test.service;

import org.junit.jupiter.api.Test;

import br.com.confidencecambio.javabasico.service.ImcService;

import org.junit.jupiter.api.Assertions;

public class ImcServiceTest {

	public ImcServiceTest() {

	}

	@Test
	public void testRetornaImc() {
		ImcService imcService = new ImcService();

		double peso = 70.0;
		double altura = 1.75;

		String expected = "O seu IMC é 22,86";
		String result = imcService.retornaImc(peso, altura);

		Assertions.assertEquals(expected, result);
	}

}
