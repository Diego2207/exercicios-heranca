package com.br.zup.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.br.exercicio.Ator;
import com.br.exercicio.Programador;

public class Test {

	public static void main(String[] args) {
		
		List<String> linguagens = new ArrayList<>(Arrays.asList("php", "java"));
		
		Programador p = new Programador("Diego", "Neris", 18
				, linguagens, 4, true);
		System.out.println(p);
			
		
		List<String> filmesParticipados = new ArrayList<>(Arrays.asList("MECK DEVIN"));
		Ator A = new Ator ("Snoop ", "Dog", 46, filmesParticipados, false, 1974, "MECK DEVIN");
		
		
	
	}
	



}
