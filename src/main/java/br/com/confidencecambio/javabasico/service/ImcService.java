package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Component;

@Component
public class ImcService {

	public String retornaImc(double peso, double altura) {
		double imc = peso / (altura * altura);
		return String.format("O seu IMC é %.2f", imc);
	}

}
