package br.com.zup.modelo;

public class Programador extends Funcionario {
	//Atributos
	private String linguagem;

	public Programador(String linguagem, String area, String senioridade, int matricula, String tipodematricula) {
		
		// construtor
		super(area, senioridade, matricula, tipodematricula);
		this.linguagem = linguagem;
	}
	
	//get e set
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public String toString() {
	
		String modelo = "";
		
		modelo += "linguagem -> " +this.getLinguagem() + "\n";
		modelo += "Área -> " + super.getArea() + "\n";
		modelo += "senioridade -> " + super.getSenioridade() + "\n";
		modelo += "matricula -> " + super.getMatricula() + "\n";
		modelo += "tipodematricula -> " +super.getTipodematricula() +"\n";
		
		return modelo;
	
	}
}
