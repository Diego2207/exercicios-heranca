package com.br.zup.test;

import br.com.zup.modelo.Designer;
import br.com.zup.modelo.Fullstack;
import br.com.zup.modelo.Programador;

public class Testefuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programador p = new Programador ("Java", "TI", "Junior", 78202, "CLT");
		 System.out.println(p);
		 
		 Designer d = new Designer("Designer","Comunicacao", "Senior", 7899, "Adobe Photoshop");
		 System.out.println(d);
		 
		 Fullstack fullstack = new Fullstack("TI", "pleno", 887798, "PJ","JavaScript","Javao");
		 System.out.println(fullstack);
	}

}
