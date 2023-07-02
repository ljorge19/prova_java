package br.com.confidencecambio.javabasico.test.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.confidencecambio.javabasico.controller.ImcController;
import br.com.confidencecambio.javabasico.service.ImcService;

import static org.mockito.Mockito.when;

public class ImcControllerTest {

	public ImcControllerTest() {

	}

	@Test
	public void testCalcularIMC() {

		ImcService mockService = Mockito.mock(ImcService.class);

		ImcController controller = new ImcController(mockService);

		double peso = 70.0;
		double altura = 1.75;

		String resultadoEsperado = "O seu IMC é 22,86";

		Mockito.when(mockService.retornaImc(peso, altura)).thenReturn(resultadoEsperado);

		ResponseEntity<String> response = controller.calcularIMC(peso, altura);

		// verifica se o mock foi chamado com os parametros corretos
		Mockito.verify(mockService).retornaImc(peso, altura);

		// verifica o resultado
		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assertions.assertEquals(resultadoEsperado, response.getBody());

	}
}