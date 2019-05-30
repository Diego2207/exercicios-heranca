package br.com.zup.modelo;

public class Fullstack extends Funcionario {

	
	private String backend;
	private String frontend;
	public Fullstack(String area, String senioridade, int matricula, String tipodematricula, String backend,
			String frontend) {
		super(area, senioridade, matricula, tipodematricula);
		this.backend = backend;
		this.frontend = frontend;
	}
	
	public String getBackend() {
		return backend;
	}
	public void setBackend(String backend) {
		this.backend = backend;
	}
	 
	public String getFrontend() {
		return frontend;
	}
		
	public void setFrontend(String frontend) {
		this.frontend = frontend;
	}
	
	public String toString() {
		
		String modelo = "";
		modelo += "linguagem de backend ->" + this.getBackend() + "\n";
		modelo += "linguagem de frontend ->" + this.getFrontend() + "\n";
		modelo += "Área -> " + super.getArea() + "\n";
		modelo += "senioridade -> " + super.getSenioridade() + "\n";
		modelo += "matricula -> " + super.getMatricula() + "\n";
		modelo += "tipodematricula -> " +super.getTipodematricula();
		
		return modelo;
	}
	
}
