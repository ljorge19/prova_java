package br.com.confidencecambio.javabasico.test.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.confidencecambio.javabasico.beans.Pessoa;

public class PessoaTest {

	public PessoaTest() {

	}

	private Pessoa geral;

	@BeforeEach
	public void setUp() {
		geral = new Pessoa("João Soares Silva");
	}

	@Test
	public void testGetPrimeiroNome() {
		String primeiroNome = geral.getPrimeiroNome();
		Assertions.assertEquals("João", primeiroNome);
	}

	@Test
	public void testGetUltimoNome() {
		String ultimoNome = geral.getUltimoNome();
		Assertions.assertEquals("Soares Silva", ultimoNome);
	}

	@Test
	public void testGetNomeMaiusculo() {
		String nomeMaiusculo = geral.getNomeMaiusculo();
		Assertions.assertEquals("JOÃO SOARES SILVA", nomeMaiusculo);
	}

	@Test
	public void testGetNomeAbreviado() {
		String nomeAbreviado = geral.getNomeAbreviado();
		Assertions.assertEquals("João S. Silva", nomeAbreviado);
	}

	@Test
	public void testSetNome_Null_ThrowsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			geral.setNome(null);
		});
	}

	@Test
	public void testSetNome_Empty_ThrowsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			geral.setNome("");
		});
	}

	@Test
	public void testSetNome_Whitespace_ThrowsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			geral.setNome("   ");
		});
	}
}
