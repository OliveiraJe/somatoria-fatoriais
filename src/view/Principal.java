package view;

import java.util.Scanner;

import controller.SomatoriaFatoriaisController;

public class Principal {

	public static void main(String[] args) {
		SomatoriaFatoriaisController somaFat = new SomatoriaFatoriaisController();
		Scanner leia = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um número inteiro: ");
		
		while(!leia.hasNextInt()) {
			System.out.println("Número inválido! Digite um valor inteiro!\n");
			System.out.println("Digite um número inteiro: ");
			leia.next();
		}
		
		a = leia.nextInt();
		
		double res = somaFat.somatoria(a);
		
		System.out.println("Soma = 1 + 1/2! + 1/3! + ... + 1/N!\n");
		System.out.printf("O resultado da soma para N = "+a+" é: "+res);
		
		
		leia.close();

	}

}
