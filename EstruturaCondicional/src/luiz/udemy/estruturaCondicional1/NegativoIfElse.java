package luiz.udemy.estruturaCondicional1;

import java.util.Scanner;

public class NegativoIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number; 
		
		System.out.println("Digite um n�mero: ");
		number = sc.nextInt();
		
		if (number >= 0){
			System.out.println("N�O NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
