package exercicio1;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinha {

	public static void main(String[] args) {
		Scanner entrada =  new  Scanner ( System.in);
		Random aleatorio = new Random();
		
		int numeroAleatorio = aleatorio.nextInt( 51 );
		int palpite = numeroAleatorio;
		int vidas =  9 ;
		
		while (vidas >  - 1 ) {
			
			System.out.println( " digite um numero de 0 a 50: " );
			numeroAleatorio = entrada . nextInt ();
			
			if (numeroAleatorio == palpite) {
				System.out.println( " Parabéns você acertou! " );
			} 
			{
				System.out.println( " Você errou, restaram " + vidas + " vidas");
			} if (vidas ==  - 1 ) {
				System.out.println( " JOGO MAIS, PERCA, ACABOU, JÁ ERA, game over! " );
			}
		}

	}

		
		
	}


