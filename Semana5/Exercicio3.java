package controle;

import java.util.Scanner;

public class Calculadora
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite a operação (+, -, *, /): ");
		String op = sc.next();
		
		switch (op)
		{
		case "+":
			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case "/":
			while (num2 == 0)
			{
				System.out.print("Não é possivel dividir por zero! Digite outro número: ");
				num2 = sc.nextInt();
			}
			System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case "*":
			System.out.print(num1 + " x " + num2 + " = " + (num1 * num2));
			break;
		}
	}
}
