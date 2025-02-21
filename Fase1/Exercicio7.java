package controle;

import java.util.Scanner;

public class calcPerimetroAreaRetangulo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base do retângulo: ");
		double baseTriangulo = sc.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		double alturaTriangulo = sc.nextDouble();
		
		double area = baseTriangulo * alturaTriangulo;
		
		System.out.print("Área: " + area + "\nPerímetro: " + 2 * area);
	}
}
