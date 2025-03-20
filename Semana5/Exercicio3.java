package dominio;

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
		char op = sc.next();
		
		switch (op)
		{
		case '+':
			System.out.print(num1 + " + " num2 + " = " + (num1 + num2));
			break;
		}
		INCOMPLETO SEM TEMPO TENHO Q IR
	}	
}
