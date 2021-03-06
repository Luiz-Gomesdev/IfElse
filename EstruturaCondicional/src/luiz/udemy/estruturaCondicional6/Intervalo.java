package luiz.udemy.estruturaCondicional6;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		
		System.out.println("Digite um n?mero:");
		N = sc.nextDouble();
		
		if (N < 0 || N > 100) {
			System.out.println("Fora de Intervalo");
		}else if (N <= 25) {
			System.out.println("Intervalo (0 , 25)");
		}else if (N <= 50) {
			System.out.println("Intervalo (25 , 50)");
		}else if (N <= 75) {
			System.out.println("Intervalo (50 , 75)");
		}else {
			System.out.println("Intervalo (75 , 100)");
		}
		
		sc.close();
	}

}
