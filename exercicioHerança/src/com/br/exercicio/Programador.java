package com.br.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Pessoa {
	private List<String> linguagensUsadas = new ArrayList<String>();
	private int anosExperiencia;
	private boolean gostaDeCafe;
	

	public Programador(String nome, String sobrenome, int idade, List<String> linguagensUsadas, int anosExperiencia,
			boolean gostaDeCafe ) {
		super(nome, sobrenome, idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperiencia;
		this.gostaDeCafe = gostaDeCafe;
		
	}


	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}


	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}


	public int getAnosExperiencia() {
		return anosExperiencia;
	}


	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}


	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}


	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	public String toString() {
		
		String modelo = "";
		modelo += "Linguagens -> " + this.getLinguagensUsadas() + "\n";
		modelo += "Anos de experiencia -> " + this.getAnosExperiencia() + "\n";
		modelo += "Gosta de café -> " + this.gostaDeCafe + "\n";
		modelo += "Seu nome -> " + super.getNome() + "\n";
		modelo += "Seu sobrenome -> " + super.getSobreNome() + "\n";
		modelo += "Sua idade -> " + super.idade + "\n";
		 return modelo;
		
	}
	
	}