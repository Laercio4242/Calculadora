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
		
		System.out.println("Escolha a opera��o desejada:");
		System.out.println("+ :");
		System.out.println("- :");
		System.out.println("* :");
		System.out.println("/ :");
		
		opcao = sc.next();
		
		switch (opcao) {
		case "+":			
			result = numero1 + numero2;
			System.out.println("O valor � de: " + result);
			break;
			
		case "-":
			result = numero1 - numero2;
			System.out.println("O valor da subtra��o � de: " + result);
			break;
		case "*":
			result = numero1 * numero2;
			System.out.println("O valor da multiplica��o � de: " + result);
			break;
		case "/":
			result = numero1 / numero2;
			System.out.println("O valor da divis�o � de:" + result);
			break;

		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
		sc.close();
	}

}
