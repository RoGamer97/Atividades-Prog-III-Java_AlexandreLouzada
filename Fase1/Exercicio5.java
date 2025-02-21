package controle;

import java.util.Scanner;

public class converterIdadePraDias 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Você viveu " + idade * 365 + " dias!");
	}
}
