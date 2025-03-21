package controle;

import java.util.Scanner;

public class ChecarSeAnoBissexto
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um ano: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
		{
			System.out.print(ano + " é um ano é bissexto!");
		}
		else
		{
			System.out.print(ano + " não é um ano é bissexto!");
		}
	}
}


