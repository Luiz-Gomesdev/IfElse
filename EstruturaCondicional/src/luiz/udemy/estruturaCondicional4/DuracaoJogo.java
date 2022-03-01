package luiz.udemy.estruturaCondicional4;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1, h2, duracao;
		
		System.out.println("Hora Inicial: ");
		h1 = sc.nextInt();
		
		System.out.println("Hora Final: ");
		h2 = sc.nextInt();
		
		if (h1 < h2) {
			duracao = h2 - h1;
		}else {
			duracao = 24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
