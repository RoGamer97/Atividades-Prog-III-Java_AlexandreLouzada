package dominio;

import java.util.Scanner;

public class PrintarClassificacaoIdade
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite uma idade: ");
		int idade = sc.nextInt();
		
		if (idade < 18)
		{
			System.out.print("Menor de idade");
		}
		else if (idade < 60)
		{
			System.out.print("Adulto");
		}
		else
		{
			System.out.print("Idoso");
		}
	}	
}
