package br.com.confidencecambio.javabasico.beans;

public class Pessoa {

	public Pessoa() {

	}

	protected String nome;

	public Pessoa(String nome) {
		setNome(nome);
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome.trim();
		} else {
			throw new IllegalArgumentException("Nome inválido");
		}
	}

	public String getPrimeiroNome() {
		String[] partes = nome.split("\\s+");
		return partes[0];
	}

	public String getUltimoNome() {
		String[] partes = nome.split("\\s+");
		StringBuilder ultimoNome = new StringBuilder();
		for (int i = 1; i < partes.length; i++) {
			ultimoNome.append(partes[i]);
			if (i < partes.length - 1) {
				ultimoNome.append(" ");
			}
		}
		return ultimoNome.toString();
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	public String getNomeAbreviado() {
		String[] parts = nome.split("\\s+");
		StringBuilder nomeAbreviado = new StringBuilder();

		if (parts.length > 0) {
			nomeAbreviado.append(parts[0]);

			for (int i = 1; i < parts.length - 1; i++) {
				String nomeDoMeio = parts[i];
				if (!nomeDoMeio.isEmpty()) {
					nomeAbreviado.append(" ");
					nomeAbreviado.append(nomeDoMeio.charAt(0)).append(".");
				}
			}

			if (parts.length > 1) {
				nomeAbreviado.append(" ");
				nomeAbreviado.append(parts[parts.length - 1]);
			}
		}

		return nomeAbreviado.toString();
	}

}
