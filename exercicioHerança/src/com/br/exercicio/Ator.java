package com.br.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa {
	List<String>filmesParticipados = new ArrayList<String>();
	 private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;
	
	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipados, boolean temOscar,
			int anoNascimento, String melhorFilme) {
		super(nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
		this.melhorFilme = melhorFilme;
	}

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}
	
	public String toString() {
		
		String modelo = "";
		modelo += "Filmes participados  ->" + this.getFilmesParticipados() + "\n";
		modelo += "Tem oscar -> " + this.temOscar  + "\n";
		modelo += "Ano de nascimento ->" + this.anoNascimento + "\n";
		modelo += "Melhor Filme -> " + this.melhorFilme + "\n";
		modelo += "Seu nome -> " + this.getNome() + "\n";
		modelo += "Seu sobrenome ->" + this.getSobreNome() + "\n";
		modelo += "Sua idade -> " + this.idade + "\n";
		return modelo;
	}
	
	
}
