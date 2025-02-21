package controle;

import java.util.Scanner;

public class converterMoeda 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em real (R$): ");
		double real = sc.nextDouble();
		double cotacao = 5.7;
		
		System.out.print("O valor em dolar (U$): " + (real * cotacao));
	}
}
