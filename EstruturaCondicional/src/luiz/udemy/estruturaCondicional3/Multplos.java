package luiz.udemy.estruturaCondicional3;

import java.util.Scanner;

public class Multplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o s�o Multiplos");
		}
		
		sc.close();
	}

}
