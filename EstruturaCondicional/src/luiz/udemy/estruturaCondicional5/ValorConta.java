package luiz.udemy.estruturaCondicional5;

import java.util.Scanner;

public class ValorConta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o c�digo do Item: ");
		int codigo = sc.nextInt();

		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();

		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}else if (codigo == 2) {
			total = quantidade * 4.5;
		}else if (codigo == 3) {
			total = quantidade * 5.0;
		}else if (codigo == 4) {
			total = quantidade * 2.0;
		}else if (codigo == 5) {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f\n" , total);

		sc.close();

	}

}
