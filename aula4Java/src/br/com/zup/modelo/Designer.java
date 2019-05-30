package br.com.zup.modelo;

public class Designer extends Funcionario {
	
	private String web;

	public Designer(String web, String area, String senioridade, int matricula, String tipodematricula) {
		
		// construtor
		super(area, senioridade, matricula, tipodematricula);
		this.web = web;
	}
	
	//get e set
	
	public String getcomunicacao() {
		return web;
	}
	public void setcomunicacao(String web) {
		this.web = web;
	}
	
	public String toString() {
	
		String modelo = "";
		
		modelo += "web -> " +this.getcomunicacao() + "\n";
		modelo += "Área -> " + super.getArea() + "\n";
		modelo += "senioridade -> " + super.getSenioridade() + "\n";
		modelo += "matricula -> " + super.getMatricula() + "\n";
		modelo += "tipodematricula -> " +super.getTipodematricula() +"\n";
		
		return modelo;
	}

}
