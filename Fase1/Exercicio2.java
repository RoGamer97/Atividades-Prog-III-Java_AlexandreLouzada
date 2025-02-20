package controle;

import java.util.Scanner;

public class calcAreaCirculo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		System.out.print("A área do círculo é: " + pi * (raio * raio));
	}
}
