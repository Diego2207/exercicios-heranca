package br.com.zup.modelo;

public class Funcionario {
	//Atributos
	private String area;
	private String senioridade;
	private int matricula;
	private String tipodematricula;
	
	
	// Construtor
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSenioridade() {
		return senioridade;
	}
	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getTipodematricula() {
		return tipodematricula;
	}
	public void setTipodematricula(String tipodematricula) {
		this.tipodematricula = tipodematricula;
	}
	public Funcionario(String area, String senioridade, int matricula, String tipodematricula) {
		this.area = area;
		this.senioridade = senioridade;
		this.matricula = matricula;
		this.tipodematricula = tipodematricula;
	}
	
	// Construtor
	
	
	
	

}
