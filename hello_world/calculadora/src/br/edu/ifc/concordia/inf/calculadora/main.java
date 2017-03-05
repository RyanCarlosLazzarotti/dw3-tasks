package br.edu.ifc.concordia.inf.calculadora;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação desejada de 1 a 4 (soma, multiplicação, subtração ou divisão): ");
		int operacao = scan.nextInt();
		System.out.println("Digite o primeiro parâmetro: ");
		double a = scan.nextDouble();
		System.out.println("Digite o segundo parâmetro: ");
		double b = scan.nextDouble();
		
		calculadora calc = new calculadora();
		
		double resultado = 0;
		
		if (operacao == 1){
			resultado = calc.soma(a, b);
		}
		if (operacao == 2){
			resultado = calc.multiplicacao(a, b);
		}
		if (operacao == 3){
			resultado = calc.subtracao(a, b);
		}
		if (operacao == 4){
			resultado = calc.divisao(a, b);
		}
		
		System.out.printf("Resultado = %s\n", String.valueOf(resultado));
		scan.close();
	}
}