package dominio;

import java.util.Scanner;

public class PrintarSeParImpar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.print(num + " é par!");
		}
		else
		{
			System.out.print(num + " é ímpar!");
		}
	}	
}
