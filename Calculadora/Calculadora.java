package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		String opcao;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		numero2 = sc.nextInt();
		
		System.out.println("Escolha a operação desejada:");
		System.out.println("+ :");
		System.out.println("- :");
		System.out.println("* :");
		System.out.println("/ :");
		
		opcao = sc.next();
		
		switch (opcao) {
		case "+":			
			result = numero1 + numero2;
			System.out.println("O valor é de: " + result);
			break;
			
		case "-":
			result = numero1 - numero2;
			System.out.println("O valor da subtração é de: " + result);
			break;
		case "*":
			result = numero1 * numero2;
			System.out.println("O valor da multiplicação é de: " + result);
			break;
		case "/":
			result = numero1 / numero2;
			System.out.println("O valor da divisão é de:" + result);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		sc.close();
	}

}
