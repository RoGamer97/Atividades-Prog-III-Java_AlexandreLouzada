package controle;

import java.util.Scanner;

public class Somar2Numeros 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
		
		sc.close();
	}
}
