package dominio;

import java.util.Scanner;

public class CalcSomaNaturais 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= num; i++)
		{
			soma += i;
		}
		
		System.out.print("Soma dos primeiros " + num + " números é " + soma);
	}
}
