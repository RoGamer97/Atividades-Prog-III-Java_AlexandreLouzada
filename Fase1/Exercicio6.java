package controle;

import java.util.Scanner;

public class calcSalario 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o desconto: ");
		double desconto = sc.nextDouble();
		
		System.out.print("O salário líquido é: " + (salarioBruto - desconto));
	}
}
